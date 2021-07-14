/*
 * Taken from Kotlin under Apache License 2.0 (https://github.com/JetBrains/intellij-kotlin/blob/master/license/LICENSE.txt)
 * Source: https://github.com/JetBrains/intellij-kotlin/blob/master/jvm/src/org/jetbrains/kotlin/idea/compiler/KotlinCompilerManager.kt
 */

package me.erik.aprl.compiler

import com.intellij.diagnostic.PluginException
import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.compiler.CompilationStatusListener
import com.intellij.openapi.compiler.CompileContext
import com.intellij.openapi.compiler.CompilerMessageCategory
import com.intellij.openapi.compiler.CompilerTopics
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import java.io.PrintStream
import java.io.PrintWriter

class AprlCompilerStartupActivity : StartupActivity {
    
    // Extending PluginException ensures that Exception Analyzer recognizes this as a APRL exception
    private class AprlCompilerException(private val text: String) : PluginException("", PluginManagerCore.getPluginByClassName(AprlCompilerStartupActivity::class.java.name)) {
        
        override fun printStackTrace(s: PrintWriter) = s.print(text)
        
        override fun printStackTrace(s: PrintStream) = s.print(text)
        
        @Synchronized
        override fun fillInStackTrace(): Throwable = this
        
        override fun getStackTrace(): Array<StackTraceElement> {
            UnsupportedOperationException().stackTrace.also {
                LOG.error("Somebody called getStacktrace() on AprlCompilerException")
                return it
            }
        }
        
        override val message = "<Exception from standalone APRL compiler>"
        
    }
    
    override fun runActivity(project: Project) {
        project.messageBus.connect().subscribe(CompilerTopics.COMPILATION_STATUS, object : CompilationStatusListener {
            override fun compilationFinished(aborted: Boolean, errors: Int, warnings: Int, compileContext: CompileContext) {
                for (error in compileContext.getMessages(CompilerMessageCategory.ERROR)) {
                    val message = error.message
                    if (message.startsWith(INTERNAL_ERROR_PREFIX) || message.startsWith(PREFIX_WITH_COMPILER_NAME)) {
                        LOG.error(AprlCompilerException(message))
                    }
                }
            }
        })
    }
    
    companion object {
        private val LOG = Logger.getInstance(AprlCompilerStartupActivity::class.java)
        private const val PREFIX_WITH_COMPILER_NAME = "$APRL_COMPILER_NAME: $INTERNAL_ERROR_PREFIX"
    }
    
}
