package me.erik.aprl.psi

import com.intellij.psi.tree.IElementType
import me.erik.aprl.AprlLanguage
import org.jetbrains.annotations.NonNls

class AprlTokenType(@NonNls val debugName: String) : IElementType(debugName, AprlLanguage)
