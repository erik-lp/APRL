package me.erik.aprl

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import me.erik.aprl.psi.AprlFile
import me.erik.aprl.lang.psi.AprlTypes
import me.erik.aprl.parser.AprlParser

class AprlParserDefinition : ParserDefinition {
    
    override fun createLexer(project: Project): Lexer = AprlLexerAdapter()
    
    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES
    
    override fun getCommentTokens(): TokenSet = COMMENTS
    
    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS
    
    override fun createParser(project: Project): PsiParser = AprlParser()
    
    override fun getFileNodeType(): IFileElementType = FILE
    
    override fun createFile(viewProvider: FileViewProvider): PsiFile = AprlFile(viewProvider)
    
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements = ParserDefinition.SpaceRequirements.MAY
    
    override fun createElement(node: ASTNode?): PsiElement = AprlTypes.Factory.createElement(node)
    
    companion object {
        @JvmField val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        @JvmField val COMMENTS = TokenSet.create(AprlTypes.BLOCK_COMMENT, AprlTypes.DOC_COMMENT, AprlTypes.EOL_COMMENT)
        @JvmField val STRING_LITERALS = TokenSet.create(AprlTypes.STRING_LITERAL, AprlTypes.RAW_STRING_LITERAL)
        @JvmField val FILE = IFileElementType(AprlLanguage)
    }
    
}