package me.erik.aprl.psi

import com.intellij.psi.tree.IElementType
import me.erik.aprl.AprlLanguage
import org.jetbrains.annotations.NonNls

class AprlElementType(@NonNls debugName: String) : IElementType(debugName, AprlLanguage)
