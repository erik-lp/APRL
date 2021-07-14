package me.erik.aprl.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import me.erik.aprl.AprlFileType
import me.erik.aprl.AprlLanguage
import me.erik.aprl.lang.psi.AprlTopLevelObject

class AprlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, AprlLanguage) {
    
    override fun getFileType(): FileType = AprlFileType
    
    override fun toString() = "APRL File: $name"
    
    fun firstTopLevelObjectOrNull(): AprlTopLevelObject? = findChildrenByClass(AprlTopLevelObject::class.java).firstOrNull()
    
    
}
