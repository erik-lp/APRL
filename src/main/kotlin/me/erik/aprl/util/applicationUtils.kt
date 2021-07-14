/*
 * Taken from Kotlin under Apache License 2.0 (https://github.com/JetBrains/intellij-kotlin/blob/master/license/LICENSE.txt)
 * Source: https://github.com/JetBrains/intellij-kotlin/blob/master/frontend-independent/src/org/jetbrains/kotlin/idea/util/ApplicationUtils.kt
 */

@file:Suppress("NOTHING_TO_INLINE")

package me.erik.aprl.util

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.command.CommandProcessor
import com.intellij.openapi.components.ComponentManager
import com.intellij.openapi.progress.impl.CancellationCheck
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Condition

fun <T> runReadAction(action: () -> T): T {
    return ApplicationManager.getApplication().runReadAction<T>(action)
}

fun <T> runWriteAction(action: () -> T): T {
    return ApplicationManager.getApplication().runWriteAction<T>(action)
}

fun <T> runWriteActionInEdt(action: () -> T): T {
    var result: T? = null
    ApplicationManager.getApplication().invokeLater {
        result = ApplicationManager.getApplication().runWriteAction<T>(action)
    }
    return result!!
}


fun Project.executeWriteCommand(name: String, command: () -> Unit) {
    CommandProcessor.getInstance().executeCommand(this, { runWriteAction(command) }, name, null)
}

fun <T> Project.executeWriteCommand(name: String, groupId: Any? = null, command: () -> T): T {
    return executeCommand<T>(name, groupId) { runWriteAction(command) }
}

fun <T> Project.executeCommand(name: String, groupId: Any? = null, command: () -> T): T {
    @Suppress("UNCHECKED_CAST") var result: T = null as T
    CommandProcessor.getInstance().executeCommand(this, { result = command() }, name, groupId)
    @Suppress("USELESS_CAST")
    return result as T
}

fun <T> runWithCancellationCheck(block: () -> T): T = CancellationCheck.runWithCancellationCheck(block)

inline fun executeOnPooledThread(crossinline action: () -> Unit) =
    ApplicationManager.getApplication().executeOnPooledThread { action() }

inline fun invokeLater(crossinline action: () -> Unit) =
    ApplicationManager.getApplication().invokeLater { action() }

inline fun invokeLater(expired: Condition<*>, crossinline action: () -> Unit) =
    ApplicationManager.getApplication().invokeLater({ action() }, expired)

inline fun isUnitTestMode(): Boolean = ApplicationManager.getApplication().isUnitTestMode

inline fun isApplicationInternalMode(): Boolean = ApplicationManager.getApplication().isInternal

inline fun <reified T : Any> ComponentManager.getService(): T? = this.getService(T::class.java)

inline fun <reified T : Any> ComponentManager.getServiceSafe(): T =
    this.getService(T::class.java) ?: error("Unable to locate service ${T::class.java.name}")

fun <T> Project.runReadActionInSmartMode(action: () -> T): T {
    if (ApplicationManager.getApplication().isReadAccessAllowed) return action()
    return DumbService.getInstance(this).runReadActionInSmartMode<T>(action)
}
