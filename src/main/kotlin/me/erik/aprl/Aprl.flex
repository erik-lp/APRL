package me.erik.aprl.lang.core.lexer;

import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
import me.erik.aprl.lang.psi.AprlTypes;

%%

%unicode
%public
%class AprlLexer
%implements FlexLexer
%function advance
%type IElementType
%eof{ return;
%eof}

DIGIT=[0-9]
HEX_DIGIT=[0-9A-Fa-f]
BIN_DIGIT=[01]
OCT_DIGIT=[0-7]
WHITE_SPACE_CHAR=[\ \t\f]
NEWLINE=(\n)|(\r\n)

IDENTIFIER=[:jletter:] [:jletterdigit:]*

BLOCK_COMMENT=("/*"[^"*"]{COMMENT_TAIL})|"/*"
DOC_COMMENT="/*""*"+("/"|([^"/""*"]{COMMENT_TAIL}))?
COMMENT_TAIL=([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?
EOL_COMMENT="/""/"[^\n]*

INTEGER_LITERAL={WHOLE_INTEGER_LITERAL}|{HEX_LITERAL}|{BIN_LITERAL}|{OCTAL_LITERAL}
LONG_LITERAL={INTEGER_LITERAL}[lL]
SHORT_LITERAL={INTEGER_LITERAL}[sS]
BYTE_LITERAL={INTEGER_LITERAL}[bB]

WHOLE_INTEGER_LITERAL=[-]?{NATURAL_NUMBER_LITERAL}
NATURAL_NUMBER_LITERAL=(({DIGIT})+)|({DIGIT} ({DIGIT}|[_])* {DIGIT})
FLOATING_POINT_LITERAL=[-]?({NATURAL_NUMBER_LITERAL})?[.]({NATURAL_NUMBER_LITERAL})

FLOAT_LITERAL=({FLOATING_POINT_LITERAL}|{SCIENTIFIC_NUMBER_LITERAL}|{INTEGER_LITERAL})[fF]
DOUBLE_LITERAL=(({FLOATING_POINT_LITERAL}|{SCIENTIFIC_NUMBER_LITERAL})[dD]?)|({INTEGER_LITERAL}[dD])
SCIENTIFIC_NUMBER_LITERAL={FLOATING_POINT_LITERAL}[eE]{WHOLE_INTEGER_LITERAL}

COMPLEX_LITERAL=({WHOLE_INTEGER_LITERAL}|{FLOATING_POINT_LITERAL})[jJ]({WHOLE_INTEGER_LITERAL}|{FLOATING_POINT_LITERAL})

HEX_LITERAL=[-]?0[xX]{HEX_DIGIT}({HEX_DIGIT}|[_])*
BIN_LITERAL=[-]?0[bB]{BIN_DIGIT}({BIN_DIGIT}|[_])*
OCTAL_LITERAL=[-]?0[oO]{OCT_DIGIT}({OCT_DIGIT}|[_])*

CHARACTER_LITERAL="'"([^\\\'\n]|{ESCAPE_SEQUENCE})*("'"|\\)?
STRING_LITERAL=\"([^\\\"\n]|{ESCAPE_SEQUENCE})*(\"|\\)?
ESCAPE_SEQUENCE=\\[^\n]

THREE_QUO = (\"\"\")
ONE_TWO_QUO = (\"[^\"]) | (\"\"[^\"])
QUO_STRING_CHAR = [^\"] | {ONE_TWO_QUO}
RAW_STRING_LITERAL = {THREE_QUO} {QUO_STRING_CHAR}* {THREE_QUO}?

%%

<YYINITIAL> {BLOCK_COMMENT} { return AprlTypes.BLOCK_COMMENT; }
<YYINITIAL> {DOC_COMMENT} { return AprlTypes.DOC_COMMENT; }
<YYINITIAL> {EOL_COMMENT} { return AprlTypes.EOL_COMMENT; }

<YYINITIAL> ({WHITE_SPACE_CHAR})+ { return TokenType.WHITE_SPACE; }
<YYINITIAL> ({NEWLINE})+ { return AprlTypes.NL; }

<YYINITIAL> {INTEGER_LITERAL} { return AprlTypes.INTEGER_LITERAL; }
<YYINITIAL> {LONG_LITERAL} { return AprlTypes.LONG_LITERAL; }
<YYINITIAL> {SHORT_LITERAL} { return AprlTypes.SHORT_LITERAL; }
<YYINITIAL> {BYTE_LITERAL} { return AprlTypes.BYTE_LITERAL; }
<YYINITIAL> {FLOAT_LITERAL} { return AprlTypes.FLOAT_LITERAL; }
<YYINITIAL> {DOUBLE_LITERAL} { return AprlTypes.DOUBLE_LITERAL; }
<YYINITIAL> {COMPLEX_LITERAL} { return AprlTypes.COMPLEX_LITERAL; }

<YYINITIAL> {CHARACTER_LITERAL} { return AprlTypes.CHARACTER_LITERAL; }
<YYINITIAL> {STRING_LITERAL} { return AprlTypes.STRING_LITERAL; }
<YYINITIAL> {RAW_STRING_LITERAL} { return AprlTypes.RAW_STRING_LITERAL; }

<YYINITIAL> "namespace" { return AprlTypes.NAMESPACE; }
<YYINITIAL> "using" { return AprlTypes.USING; }
<YYINITIAL> "alias" { return AprlTypes.ALIAS; }
<YYINITIAL> "type" { return AprlTypes.TYPE_; }
<YYINITIAL> "class" { return AprlTypes.CLASS; }
<YYINITIAL> "interface" { return AprlTypes.INTERFACE; }
<YYINITIAL> "struct" { return AprlTypes.STRUCT; }
<YYINITIAL> "enum" { return AprlTypes.ENUM; }
<YYINITIAL> "annotation" { return AprlTypes.ANNOTATION_; }
<YYINITIAL> "partner" { return AprlTypes.PARTNER; }
<YYINITIAL> "this" { return AprlTypes.THIS; }
<YYINITIAL> "super" { return AprlTypes.SUPER; }
<YYINITIAL> "init" { return AprlTypes.INIT; }
<YYINITIAL> "exec" { return AprlTypes.EXEC; }
<YYINITIAL> "private" { return AprlTypes.PRIV; }
<YYINITIAL> "bounded" { return AprlTypes.BOUNDED; }
<YYINITIAL> "local" { return AprlTypes.LOCAL; }
<YYINITIAL> "public" { return AprlTypes.PUBLIC; }
<YYINITIAL> "get" { return AprlTypes.GETTER_; }
<YYINITIAL> "set" { return AprlTypes.SETTER_; }
<YYINITIAL> "def" { return AprlTypes.DEF; }
<YYINITIAL> "const" { return AprlTypes.CONST; }
<YYINITIAL> "var" { return AprlTypes.VAR; }
<YYINITIAL> "val" { return AprlTypes.VAL; }
<YYINITIAL> "sample" { return AprlTypes.SAMPLE; }
<YYINITIAL> "cover" { return AprlTypes.COVER; }
<YYINITIAL> "open" { return AprlTypes.OPEN; }
<YYINITIAL> "final" { return AprlTypes.FINAL; }
<YYINITIAL> "extension" { return AprlTypes.EXTENSION; }
<YYINITIAL> "external" { return AprlTypes.EXTERN; }
<YYINITIAL> "sync" { return AprlTypes.SYNC; }
<YYINITIAL> "function" { return AprlTypes.FUNCTION; }
<YYINITIAL> "script" { return AprlTypes.SCRIPT; }
<YYINITIAL> "operator" { return AprlTypes.OPERATOR; }
<YYINITIAL> "params" { return AprlTypes.PARAMS; }
<YYINITIAL> "if" { return AprlTypes.IF; }
<YYINITIAL> "unless" { return AprlTypes.UNLESS; }
<YYINITIAL> "elsif" { return AprlTypes.ELSIF; }
<YYINITIAL> "else" { return AprlTypes.ELSE; }
<YYINITIAL> "for" { return AprlTypes.FOR; }
<YYINITIAL> "match" { return AprlTypes.MATCH; }
<YYINITIAL> "when" { return AprlTypes.WHEN; }
<YYINITIAL> "do" { return AprlTypes.DO; }
<YYINITIAL> "while" { return AprlTypes.WHILE; }
<YYINITIAL> "return" { return AprlTypes.RETURN; }
<YYINITIAL> "break" { return AprlTypes.BREAK; }
<YYINITIAL> "continue" { return AprlTypes.CONTINUE; }
<YYINITIAL> "return@" { return AprlTypes.RETURN_AT; }
<YYINITIAL> "break@" { return AprlTypes.BREAK_AT; }
<YYINITIAL> "continue@" { return AprlTypes.CONTINUE_AT; }
<YYINITIAL> "or" { return AprlTypes.OR; }
<YYINITIAL> "and" { return AprlTypes.AND; }
<YYINITIAL> "not" { return AprlTypes.NOT; }
<YYINITIAL> "as" { return AprlTypes.AS; }
<YYINITIAL> "inst" { return AprlTypes.INST; }
<YYINITIAL> "!inst" { return AprlTypes.NOT_INST; }
<YYINITIAL> "in" { return AprlTypes.IN; }
<YYINITIAL> "!in" { return AprlTypes.NOT_IN; }
<YYINITIAL> "to" { return AprlTypes.TO; }
<YYINITIAL> "by" { return AprlTypes.BY; }
<YYINITIAL> "try" { return AprlTypes.TRY; }
<YYINITIAL> "handle" { return AprlTypes.HANDLE; }
<YYINITIAL> "finally" { return AprlTypes.FINALLY; }
<YYINITIAL> "trigger" { return AprlTypes.TRIGGER; }
<YYINITIAL> "true" { return AprlTypes.TRUE; }
<YYINITIAL> "false" { return AprlTypes.FALSE; }
<YYINITIAL> "none" { return AprlTypes.NONE; }
<YYINITIAL> "null" { return AprlTypes.NULL; }

<YYINITIAL> {IDENTIFIER} { return AprlTypes.IDENTIFIER_; }

<YYINITIAL> "(" { return AprlTypes.LPAREN; }
<YYINITIAL> ")" { return AprlTypes.RPAREN; }
<YYINITIAL> "[" { return AprlTypes.LSQUARE; }
<YYINITIAL> "]" { return AprlTypes.RSQUARE; }
<YYINITIAL> "{" { return AprlTypes.LCURLY; }
<YYINITIAL> "}" { return AprlTypes.RCURLY; }
<YYINITIAL> "=" { return AprlTypes.ASSIGN; }
<YYINITIAL> ":=" { return AprlTypes.DEFINE; }
<YYINITIAL> "+" { return AprlTypes.ADD; }
<YYINITIAL> "+=" { return AprlTypes.ADD_ASSIGN; }
<YYINITIAL> "++" { return AprlTypes.INCR; }
<YYINITIAL> "-" { return AprlTypes.SUB; }
<YYINITIAL> "-=" { return AprlTypes.SUB_ASSIGN; }
<YYINITIAL> "--" { return AprlTypes.DECR; }
<YYINITIAL> "*" { return AprlTypes.MUL; }
<YYINITIAL> "*=" { return AprlTypes.MUL_ASSIGN; }
<YYINITIAL> "/" { return AprlTypes.DIV; }
<YYINITIAL> "/=" { return AprlTypes.DIV_ASSIGN; }
<YYINITIAL> "%" { return AprlTypes.MOD; }
<YYINITIAL> "%=" { return AprlTypes.MOD_ASSIGN; }
<YYINITIAL> "^" { return AprlTypes.EXP; }
<YYINITIAL> "^=" { return AprlTypes.EXP_ASSIGN; }
<YYINITIAL> "&" { return AprlTypes.CONJ; }
<YYINITIAL> "&&" { return AprlTypes.CONJ; }
<YYINITIAL> "&=" { return AprlTypes.CONJ_ASSIGN; }
<YYINITIAL> "&&=" { return AprlTypes.CONJ_ASSIGN; }
<YYINITIAL> "|" { return AprlTypes.DISJ; }
<YYINITIAL> "||" { return AprlTypes.DISJ; }
<YYINITIAL> "|=" { return AprlTypes.DISJ_ASSIGN; }
<YYINITIAL> "||=" { return AprlTypes.DISJ_ASSIGN; }
<YYINITIAL> "~" { return AprlTypes.XOR; }
<YYINITIAL> "~~" { return AprlTypes.XOR; }
<YYINITIAL> "~=" { return AprlTypes.XOR_ASSIGN; }
<YYINITIAL> "~~=" { return AprlTypes.XOR_ASSIGN; }
<YYINITIAL> "," { return AprlTypes.COMMA; }
<YYINITIAL> "." { return AprlTypes.PERIOD; }
<YYINITIAL> "?." { return AprlTypes.QUEST_PERIOD; }
<YYINITIAL> ".." { return AprlTypes.DOUBLE_PERIOD; }
<YYINITIAL> "..." { return AprlTypes.TRIPLE_PERIOD; }
<YYINITIAL> ":" { return AprlTypes.COLON; }
<YYINITIAL> ";" { return AprlTypes.SEMICOLON; }
<YYINITIAL> "!" { return AprlTypes.EXCL; }
<YYINITIAL> "!!" { return AprlTypes.DOUBLE_EXCL; }
<YYINITIAL> "?" { return AprlTypes.QUEST; }
<YYINITIAL> "#" { return AprlTypes.HASH; }
<YYINITIAL> "@" { return AprlTypes.AT; }
<YYINITIAL> "@@" { return AprlTypes.DOUBLE_AT; }
<YYINITIAL> "?:" { return AprlTypes.ELVIS; }
<YYINITIAL> "?=" { return AprlTypes.ELVIS_ASSIGN; }
<YYINITIAL> "==" { return AprlTypes.EQUAL; }
<YYINITIAL> "!=" { return AprlTypes.NEQUAL; }
<YYINITIAL> "===" { return AprlTypes.IDENTICAL; }
<YYINITIAL> "!==" { return AprlTypes.NIDENTICAL; }
<YYINITIAL> "<" { return AprlTypes.LANGLE; }
<YYINITIAL> "!<" { return AprlTypes.NLANGLE; }
<YYINITIAL> "<=" { return AprlTypes.LEQ; }
<YYINITIAL> "!<=" { return AprlTypes.NLEQ; }
<YYINITIAL> ">" { return AprlTypes.RANGLE; }
<YYINITIAL> "!>" { return AprlTypes.NRANGLE; }
<YYINITIAL> ">=" { return AprlTypes.GEQ; }
<YYINITIAL> "!>=" { return AprlTypes.NGEQ; }
<YYINITIAL> "<-" { return AprlTypes.LARROW; }
<YYINITIAL> "->" { return AprlTypes.RARROW; }
<YYINITIAL> "=>" { return AprlTypes.RARROW_THICK; }
<YYINITIAL> "<=>" { return AprlTypes.SPACESHIP; }

<YYINITIAL>

<YYINITIAL> . { return TokenType.BAD_CHARACTER; }