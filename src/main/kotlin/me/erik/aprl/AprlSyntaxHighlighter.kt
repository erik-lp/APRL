package me.erik.aprl

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import me.erik.aprl.lang.psi.AprlIdentifier
import me.erik.aprl.lang.psi.AprlTypes
import me.erik.aprl.lang.psi.AprlTypes.*

class AprlSyntaxHighlighter : SyntaxHighlighterBase() {
    
    override fun getHighlightingLexer(): Lexer = AprlLexerAdapter()
    
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return arrayOf(
            when (tokenType) {
                ADD, ADD_ASSIGN, ASSIGN, COLON, COMMA, CONJ, CONJ_ASSIGN, DECR, DEFINE, DISJ, DISJ_ASSIGN, DIV, DIV_ASSIGN, DOUBLE_AT, DOUBLE_EXCL, DOUBLE_PERIOD, ELVIS, ELVIS_ASSIGN,
                EQUAL, EXCL, EXP, EXP_ASSIGN, GEQ, HASH, IDENTICAL, INCR, LANGLE, LARROW, LEQ, MOD, MOD_ASSIGN, MUL, MUL_ASSIGN, NEQUAL, NGEQ, NIDENTICAL, NLANGLE, NLEQ, NRANGLE,
                QUEST, QUEST_PERIOD, RANGLE, RARROW, RARROW_THICK, SPACESHIP, SUB, SUB_ASSIGN, TRIPLE_PERIOD, XOR, XOR_ASSIGN -> {
                    OPERATION
                }
                LPAREN, RPAREN -> {
                    PARENTHESES
                }
                LSQUARE, RSQUARE -> {
                    BRACKETS
                }
                LCURLY, RCURLY -> {
                    BRACES
                }
                PERIOD -> {
                    DOT
                }
                ALIAS, AND, ANNOTATION_, AS, BOUNDED, BREAK, BY, CLASS, CONST, CONTINUE, COVER, DEF, DO, ELSE, ELSIF, ENUM, EXEC, EXTENSION, EXTERN, FALSE, FINAL, FINALLY, FOR,
                FUNCTION, HANDLE, IF, IN, INIT, INST, INTERFACE, LOCAL, MATCH, NAMESPACE, NONE, NOT, NOT_IN, NOT_INST, NULL, OPEN, OPERATOR, OR, PARAMS, PARTNER, PRIV, PUBLIC, RETURN,
                SAMPLE, SCRIPT, STRUCT, SUPER, SYNC, THIS, TO, TRIGGER, TRUE, TRY, TYPE_, UNLESS, USING, VAL, VAR, WHEN, WHILE -> {
                    KEYWORD
                }
                AprlTypes.BLOCK_COMMENT -> {
                    BLOCK_COMMENT
                }
                BYTE_LITERAL, COMPLEX_LITERAL, DOUBLE_LITERAL, FLOAT_LITERAL, INTEGER_LITERAL, LONG_LITERAL, SHORT_LITERAL -> {
                    NUMBER
                }
                CHARACTER_LITERAL, RAW_STRING_LITERAL, STRING_LITERAL -> {
                    STRING
                }
                AprlTypes.DOC_COMMENT -> {
                    DOC_COMMENT
                }
                EOL_COMMENT -> {
                    LINE_COMMENT
                }
                IDENTIFIER_ -> {
                    IDENTIFIER
                }
                GETTER_, SETTER_ -> {
                    if (tokenType is AprlIdentifier) IDENTIFIER
                    else KEYWORD
                }
                else -> return arrayOf()
            }
        )
    }
    
    companion object {
        
        val IDENTIFIER = createTextAttributesKey("APRL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val NUMBER = createTextAttributesKey("APRL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val KEYWORD = createTextAttributesKey("APRL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = createTextAttributesKey("APRL_STRING", DefaultLanguageHighlighterColors.STRING)
        val BLOCK_COMMENT = createTextAttributesKey("APRL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val LINE_COMMENT = createTextAttributesKey("APRL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val DOC_COMMENT = createTextAttributesKey("APRL_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
        val OPERATION = createTextAttributesKey("APRL_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val BRACES = createTextAttributesKey("APRL_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val DOT = createTextAttributesKey("APRL_DOT", DefaultLanguageHighlighterColors.DOT)
        val PARENTHESES = createTextAttributesKey("APRL_PARENTHS", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACKETS = createTextAttributesKey("APRL_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        
    }
    
}