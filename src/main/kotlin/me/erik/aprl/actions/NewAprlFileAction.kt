package me.erik.aprl.actions

import java.util.Properties
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.ide.fileTemplates.FileTemplateManager
import com.intellij.ide.fileTemplates.actions.AttributesDefaults
import com.intellij.ide.fileTemplates.ui.CreateFromTemplateDialog
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.editor.LogicalPosition
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.ui.InputValidatorEx
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import com.intellij.util.IncorrectOperationException
import me.erik.aprl.AprlFileType
import me.erik.aprl.AprlIcons
import me.erik.aprl.psi.AprlFile

class NewAprlFileAction : CreateFileFromTemplateAction("APRL File", "Creates new APRL file", AprlFileType.icon), DumbAware {
    
    override fun postProcess(createdElement: PsiFile, templateName: String?, customProperties: MutableMap<String, String>?) {
        super.postProcess(createdElement, templateName, customProperties)
        assert(createdElement is AprlFile) { "Unexpected error - created .aprl-file is not an instance of AprlFile" }
        val aprlFile = createdElement as AprlFile
        val topLevelObject = aprlFile.firstTopLevelObjectOrNull()
        if (topLevelObject == null) {
            val editor = FileEditorManager.getInstance(createdElement.project).selectedTextEditor ?: return
            if (editor.document == createdElement.viewProvider.document) {
                val lineCount = editor.document.lineCount
                editor.caretModel.moveToLogicalPosition(LogicalPosition(lineCount, 0))
            }
        }
    }
    
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle("New APRL File")
            .addKind("File", AprlIcons.FILE, "APRL File")
            .addKind("Class", AprlIcons.CLASS, "APRL Class")
            .addKind("Sample class", AprlIcons.SAMPLE_CLASS, "Aprl Sample Class")
            .addKind("Interface", AprlIcons.INTERFACE, "APRL Interface")
            .addKind("Enum", AprlIcons.ENUM, "APRL Enum")
            .addKind("Annotation", AprlIcons.ANNOTATION, "APRL Annotation")
            .addKind("Struct", AprlIcons.STRUCT, "APRL Struct")
        builder.setValidator(NameValidator)
    }
    
    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?): String = "APRL File"
    
    override fun isAvailable(dataContext: DataContext): Boolean {
        if (super.isAvailable(dataContext)) {
            val ideView = LangDataKeys.IDE_VIEW.getData(dataContext)!!
            val project = PlatformDataKeys.PROJECT.getData(dataContext)!!
            val projectFileIndex = ProjectRootManager.getInstance(project).fileIndex
            return ideView.directories.any { projectFileIndex.isInSourceContent(it.virtualFile) }
        }
        return false
    }
    
    @Suppress("DEPRECATION")
    override fun createFileFromTemplate(name: String, template: FileTemplate, dir: PsiDirectory): PsiFile? {
        val directorySeparators = if (template.name == "APRL File") charArrayOf('/', '\\') else charArrayOf('/', '\\', '.')
        val (className, targetDir) = findOrCreateTarget(dir, name, directorySeparators)
        val service = DumbService.getInstance(dir.project)
        service.isAlternativeResolveEnabled = true
        return try {
            createFromTemplate(targetDir, className, template)
        } finally {
            service.isAlternativeResolveEnabled = false
        }
    }
    
    override fun hashCode(): Int = 0
    
    override fun equals(other: Any?): Boolean = other is NewAprlFileAction
    
    override fun startInWriteAction(): Boolean = false
    
    companion object {
        
        private fun findOrCreateTarget(dir: PsiDirectory, name: String, directorySeparators: CharArray): Pair<String, PsiDirectory> {
            var className = if (name.endsWith(".aprl")) name.removeSuffix(".aprl") else name
            var targetDir = dir
            
            for (splitChar in directorySeparators) {
                if (splitChar in className) {
                    val names = className.trim().split(splitChar)
                    
                    for (dirName in names.dropLast(1)) {
                        targetDir = targetDir.findSubdirectory(dirName) ?: runWriteAction {
                            targetDir.createSubdirectory(dirName)
                        }
                    }
                    
                    className = names.last()
                    break
                }
            }
            return Pair(className, targetDir)
        }
        
        private fun <T> runWriteAction(action: () -> T): T {
            return ApplicationManager.getApplication().runWriteAction<T>(action)
        }
        
        private fun createFromTemplate(dir: PsiDirectory, className: String, template: FileTemplate): PsiFile? {
            val project = dir.project
            val defaultProperties = FileTemplateManager.getInstance(project).defaultProperties
            
            val properties = Properties(defaultProperties)
            
            val element = try {
                CreateFromTemplateDialog(
                    project, dir, template,
                    AttributesDefaults(className).withFixedName(true),
                    properties
                ).create()
            } catch (ex: IncorrectOperationException) {
                throw ex
            } catch (ex: Exception) {
                ex.printStackTrace()
                return null
            }
            
            return element?.containingFile
        }
        
    }
    
    private object NameValidator : InputValidatorEx {
        override fun getErrorText(inputString: String): String? {
            if (inputString.trim().isEmpty()) {
                return "Name cannot be empty"
            }
            val parts = inputString.split('/', '\\', '.')
            if (parts.any { it.trim().isEmpty() }) {
                return "Name cannot have empty parts"
            }
            return null
        }
        
        override fun checkInput(inputString: String?): Boolean = true
        
        override fun canClose(inputString: String): Boolean = getErrorText(inputString) == null
    }
    
}
