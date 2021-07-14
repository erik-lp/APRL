package me.erik.aprl

import com.intellij.lexer.FlexAdapter
import me.erik.aprl.lang.core.lexer.AprlLexer

class AprlLexerAdapter : FlexAdapter(AprlLexer(null))
