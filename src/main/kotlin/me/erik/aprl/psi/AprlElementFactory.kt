@file: Suppress("MemberVisibilityCanBePrivate")

package me.erik.aprl.psi

import com.intellij.openapi.project.Project
import com.intellij.openapi.compiler.CompileTask
import com.intellij.psi.PsiFileFactory
import me.erik.aprl.AprlFileType
import me.erik.aprl.lang.psi.AprlClassDeclaration
import me.erik.aprl.lang.psi.AprlNamespaceHeader

object AprlElementFactory {
    
    fun createClass(project: Project, name: String): AprlClassDeclaration {
        val file = createFile(project, "class $name")
        return file.firstChild as AprlClassDeclaration
    }
    
    fun createNamespace(project: Project, name: String): AprlNamespaceHeader {
        val file = createFile(project, "namespace $name")
        return file.firstChild as AprlNamespaceHeader
    }
    
    fun createFile(project: Project, text: String): AprlFile {
        val name = "dummy.aprl"
        return PsiFileFactory.getInstance(project).createFileFromText(name, AprlFileType, text) as AprlFile
    }
    
}
