package me.erik.aprl

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object AprlFileType : LanguageFileType(AprlLanguage) {
    
    override fun getName() = "APRL"
    
    override fun getDescription() = "APRL file"
    
    override fun getDefaultExtension() = "aprl"
    
    override fun getIcon(): Icon = AprlIcons.FILE
    
}