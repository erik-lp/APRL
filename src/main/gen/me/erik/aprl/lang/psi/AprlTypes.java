// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.erik.aprl.psi.AprlElementType;
import me.erik.aprl.psi.AprlTokenType;
import me.erik.aprl.lang.psi.impl.*;

public interface AprlTypes {

  IElementType ADDITIVE_EXPRESSION = new AprlElementType("ADDITIVE_EXPRESSION");
  IElementType ADDITIVE_OPERATOR = new AprlElementType("ADDITIVE_OPERATOR");
  IElementType ANNOTATION = new AprlElementType("ANNOTATION");
  IElementType ARRAY_ACCESS = new AprlElementType("ARRAY_ACCESS");
  IElementType ASSIGNMENT = new AprlElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_OPERATOR = new AprlElementType("ASSIGNMENT_OPERATOR");
  IElementType ATOMIC_EXPRESSION = new AprlElementType("ATOMIC_EXPRESSION");
  IElementType BLOCK = new AprlElementType("BLOCK");
  IElementType BOOL_LITERAL = new AprlElementType("BOOL_LITERAL");
  IElementType BY_OPERATOR = new AprlElementType("BY_OPERATOR");
  IElementType CALL_SUFFIX = new AprlElementType("CALL_SUFFIX");
  IElementType CLASS_BODY = new AprlElementType("CLASS_BODY");
  IElementType CLASS_DECLARATION = new AprlElementType("CLASS_DECLARATION");
  IElementType CLASS_MEMBER = new AprlElementType("CLASS_MEMBER");
  IElementType CLASS_PARAMETER = new AprlElementType("CLASS_PARAMETER");
  IElementType CLASS_PARAMETERS = new AprlElementType("CLASS_PARAMETERS");
  IElementType COLLECTION_LITERAL = new AprlElementType("COLLECTION_LITERAL");
  IElementType COMMENT = new AprlElementType("COMMENT");
  IElementType COMPARISON = new AprlElementType("COMPARISON");
  IElementType COMPARISON_OPERATOR = new AprlElementType("COMPARISON_OPERATOR");
  IElementType CONDITIONAL_EXPRESSION = new AprlElementType("CONDITIONAL_EXPRESSION");
  IElementType CONJUNCTION = new AprlElementType("CONJUNCTION");
  IElementType CONJUNCTION_OPERATOR = new AprlElementType("CONJUNCTION_OPERATOR");
  IElementType CONSTRUCTOR_DELEGATION_CALL = new AprlElementType("CONSTRUCTOR_DELEGATION_CALL");
  IElementType CONSTRUCTOR_INVOCATION = new AprlElementType("CONSTRUCTOR_INVOCATION");
  IElementType CONTROL_STRUCTURE_BODY = new AprlElementType("CONTROL_STRUCTURE_BODY");
  IElementType DELEGATION_SPECIFIER = new AprlElementType("DELEGATION_SPECIFIER");
  IElementType DELEGATION_SPECIFIERS = new AprlElementType("DELEGATION_SPECIFIERS");
  IElementType DISJUNCTION = new AprlElementType("DISJUNCTION");
  IElementType DISJUNCTION_OPERATOR = new AprlElementType("DISJUNCTION_OPERATOR");
  IElementType DO_WHILE_EXPRESSION = new AprlElementType("DO_WHILE_EXPRESSION");
  IElementType ELVIS_EXPRESSION = new AprlElementType("ELVIS_EXPRESSION");
  IElementType ELVIS_OPERATOR = new AprlElementType("ELVIS_OPERATOR");
  IElementType ENUM_BODY = new AprlElementType("ENUM_BODY");
  IElementType ENUM_DECLARATION = new AprlElementType("ENUM_DECLARATION");
  IElementType ENUM_ENTRIES = new AprlElementType("ENUM_ENTRIES");
  IElementType ENUM_ENTRY = new AprlElementType("ENUM_ENTRY");
  IElementType EQUALITY_COMPARISON = new AprlElementType("EQUALITY_COMPARISON");
  IElementType EQUALITY_OPERATOR = new AprlElementType("EQUALITY_OPERATOR");
  IElementType EXPONENTIAL_EXPRESSION = new AprlElementType("EXPONENTIAL_EXPRESSION");
  IElementType EXPONENTIAL_OPERATOR = new AprlElementType("EXPONENTIAL_OPERATOR");
  IElementType EXPRESSION = new AprlElementType("EXPRESSION");
  IElementType FINALLY_BLOCK = new AprlElementType("FINALLY_BLOCK");
  IElementType FOR_EXPRESSION = new AprlElementType("FOR_EXPRESSION");
  IElementType FUNCTION_BODY = new AprlElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new AprlElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_LITERAL = new AprlElementType("FUNCTION_LITERAL");
  IElementType FUNCTION_MODIFIER = new AprlElementType("FUNCTION_MODIFIER");
  IElementType FUNCTION_TYPE = new AprlElementType("FUNCTION_TYPE");
  IElementType FUNCTION_TYPE_PARAMETERS = new AprlElementType("FUNCTION_TYPE_PARAMETERS");
  IElementType FUNCTION_TYPE_RECEIVER = new AprlElementType("FUNCTION_TYPE_RECEIVER");
  IElementType FUNCTION_VALUE_PARAMETER = new AprlElementType("FUNCTION_VALUE_PARAMETER");
  IElementType FUNCTION_VALUE_PARAMETERS = new AprlElementType("FUNCTION_VALUE_PARAMETERS");
  IElementType GETTER = new AprlElementType("GETTER");
  IElementType HANDLE_BLOCK = new AprlElementType("HANDLE_BLOCK");
  IElementType IDENTIFIER = new AprlElementType("IDENTIFIER");
  IElementType IDENTITY_COMPARISON = new AprlElementType("IDENTITY_COMPARISON");
  IElementType IDENTITY_OPERATOR = new AprlElementType("IDENTITY_OPERATOR");
  IElementType IF_EXPRESSION = new AprlElementType("IF_EXPRESSION");
  IElementType IMPORT_ALIAS = new AprlElementType("IMPORT_ALIAS");
  IElementType IMPORT_HEADER = new AprlElementType("IMPORT_HEADER");
  IElementType IMPORT_IDENTIFIER = new AprlElementType("IMPORT_IDENTIFIER");
  IElementType IMPORT_LIST = new AprlElementType("IMPORT_LIST");
  IElementType INFIX_FUNCTION_CALL = new AprlElementType("INFIX_FUNCTION_CALL");
  IElementType INHERITANCE_MODIFIER = new AprlElementType("INHERITANCE_MODIFIER");
  IElementType INITIALIZER_BODY = new AprlElementType("INITIALIZER_BODY");
  IElementType INST_OPERATOR = new AprlElementType("INST_OPERATOR");
  IElementType IN_OPERATOR = new AprlElementType("IN_OPERATOR");
  IElementType JUMP_EXPRESSION = new AprlElementType("JUMP_EXPRESSION");
  IElementType LABEL_DEFINITION = new AprlElementType("LABEL_DEFINITION");
  IElementType LABEL_REFERENCE = new AprlElementType("LABEL_REFERENCE");
  IElementType LAMBDA_PARAMETER = new AprlElementType("LAMBDA_PARAMETER");
  IElementType LAMBDA_PARAMETERS = new AprlElementType("LAMBDA_PARAMETERS");
  IElementType LITERAL_CONSTANT = new AprlElementType("LITERAL_CONSTANT");
  IElementType LOAD_SCRIPT = new AprlElementType("LOAD_SCRIPT");
  IElementType LOCAL_PROPERTY_DECLARATION = new AprlElementType("LOCAL_PROPERTY_DECLARATION");
  IElementType LOOP_EXPRESSION = new AprlElementType("LOOP_EXPRESSION");
  IElementType MATCH_ENTRY = new AprlElementType("MATCH_ENTRY");
  IElementType MATCH_EXPRESSION = new AprlElementType("MATCH_EXPRESSION");
  IElementType MEMBER_ACCESS_OPERATOR = new AprlElementType("MEMBER_ACCESS_OPERATOR");
  IElementType MODIFIER = new AprlElementType("MODIFIER");
  IElementType MODIFIER_LIST = new AprlElementType("MODIFIER_LIST");
  IElementType MULTIPLICATIVE_EXPRESSION = new AprlElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType MULTIPLICATIVE_OPERATOR = new AprlElementType("MULTIPLICATIVE_OPERATOR");
  IElementType MULTI_VARIABLE_DECLARATION = new AprlElementType("MULTI_VARIABLE_DECLARATION");
  IElementType NAMED_INFIX = new AprlElementType("NAMED_INFIX");
  IElementType NAMESPACE_HEADER = new AprlElementType("NAMESPACE_HEADER");
  IElementType NULLABLE_TYPE = new AprlElementType("NULLABLE_TYPE");
  IElementType NULL_LITERAL = new AprlElementType("NULL_LITERAL");
  IElementType PARAMETER = new AprlElementType("PARAMETER");
  IElementType PARAMETER_MODIFIER = new AprlElementType("PARAMETER_MODIFIER");
  IElementType PARENTHESIZED_EXPRESSION = new AprlElementType("PARENTHESIZED_EXPRESSION");
  IElementType PARENTHESIZED_TYPE = new AprlElementType("PARENTHESIZED_TYPE");
  IElementType PARTNER_DECLARATION = new AprlElementType("PARTNER_DECLARATION");
  IElementType POSTFIX_UNARY_EXPRESSION = new AprlElementType("POSTFIX_UNARY_EXPRESSION");
  IElementType POSTFIX_UNARY_OPERATION = new AprlElementType("POSTFIX_UNARY_OPERATION");
  IElementType PREAMBLE = new AprlElementType("PREAMBLE");
  IElementType PREFIX_UNARY_EXPRESSION = new AprlElementType("PREFIX_UNARY_EXPRESSION");
  IElementType PREFIX_UNARY_OPERATION = new AprlElementType("PREFIX_UNARY_OPERATION");
  IElementType PRIMARY_CONSTRUCTOR = new AprlElementType("PRIMARY_CONSTRUCTOR");
  IElementType PROPERTY_BODY = new AprlElementType("PROPERTY_BODY");
  IElementType PROPERTY_DECLARATION = new AprlElementType("PROPERTY_DECLARATION");
  IElementType RANGE_EXPRESSION = new AprlElementType("RANGE_EXPRESSION");
  IElementType SECONDARY_CONSTRUCTOR = new AprlElementType("SECONDARY_CONSTRUCTOR");
  IElementType SEMI = new AprlElementType("SEMI");
  IElementType SETTER = new AprlElementType("SETTER");
  IElementType SIMPLE_IDENTIFIER = new AprlElementType("SIMPLE_IDENTIFIER");
  IElementType SIMPLE_USER_TYPE = new AprlElementType("SIMPLE_USER_TYPE");
  IElementType STATEMENT = new AprlElementType("STATEMENT");
  IElementType STATEMENTS = new AprlElementType("STATEMENTS");
  IElementType STRUCT_DECLARATION = new AprlElementType("STRUCT_DECLARATION");
  IElementType SUPER_EXPRESSION = new AprlElementType("SUPER_EXPRESSION");
  IElementType THIS_EXPRESSION = new AprlElementType("THIS_EXPRESSION");
  IElementType TOP_LEVEL_OBJECT = new AprlElementType("TOP_LEVEL_OBJECT");
  IElementType TO_OPERATOR = new AprlElementType("TO_OPERATOR");
  IElementType TRILEAN_LITERAL = new AprlElementType("TRILEAN_LITERAL");
  IElementType TRY_EXPRESSION = new AprlElementType("TRY_EXPRESSION");
  IElementType TYPE = new AprlElementType("TYPE");
  IElementType TYPE_ARGUMENTS = new AprlElementType("TYPE_ARGUMENTS");
  IElementType TYPE_DECLARATION = new AprlElementType("TYPE_DECLARATION");
  IElementType TYPE_EXPRESSION = new AprlElementType("TYPE_EXPRESSION");
  IElementType TYPE_OPERATOR = new AprlElementType("TYPE_OPERATOR");
  IElementType TYPE_PARAMETER = new AprlElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new AprlElementType("TYPE_PARAMETERS");
  IElementType TYPE_PROJECTION = new AprlElementType("TYPE_PROJECTION");
  IElementType TYPE_REFERENCE = new AprlElementType("TYPE_REFERENCE");
  IElementType UNESCAPED_ANNOTATION = new AprlElementType("UNESCAPED_ANNOTATION");
  IElementType USER_TYPE = new AprlElementType("USER_TYPE");
  IElementType VALUE_ARGUMENT = new AprlElementType("VALUE_ARGUMENT");
  IElementType VALUE_ARGUMENTS = new AprlElementType("VALUE_ARGUMENTS");
  IElementType VARIABLE_DECLARATION = new AprlElementType("VARIABLE_DECLARATION");
  IElementType VISIBILITY_MODIFIER = new AprlElementType("VISIBILITY_MODIFIER");
  IElementType WHILE_EXPRESSION = new AprlElementType("WHILE_EXPRESSION");
  IElementType XOR_EXPRESSION = new AprlElementType("XOR_EXPRESSION");
  IElementType XOR_OPERATOR = new AprlElementType("XOR_OPERATOR");

  IElementType ADD = new AprlTokenType("ADD");
  IElementType ADD_ASSIGN = new AprlTokenType("ADD_ASSIGN");
  IElementType ALIAS = new AprlTokenType("ALIAS");
  IElementType AND = new AprlTokenType("AND");
  IElementType ANNOTATION_ = new AprlTokenType("ANNOTATION_");
  IElementType AS = new AprlTokenType("AS");
  IElementType ASSIGN = new AprlTokenType("ASSIGN");
  IElementType AT = new AprlTokenType("AT");
  IElementType BLOCK_COMMENT = new AprlTokenType("BLOCK_COMMENT");
  IElementType BOUNDED = new AprlTokenType("BOUNDED");
  IElementType BREAK = new AprlTokenType("BREAK");
  IElementType BREAK_AT = new AprlTokenType("BREAK_AT");
  IElementType BY = new AprlTokenType("BY");
  IElementType BYTE_LITERAL = new AprlTokenType("BYTE_LITERAL");
  IElementType CHARACTER_LITERAL = new AprlTokenType("CHARACTER_LITERAL");
  IElementType CLASS = new AprlTokenType("CLASS");
  IElementType COLON = new AprlTokenType("COLON");
  IElementType COMMA = new AprlTokenType("COMMA");
  IElementType COMPLEX_LITERAL = new AprlTokenType("COMPLEX_LITERAL");
  IElementType CONJ = new AprlTokenType("CONJ");
  IElementType CONJ_ASSIGN = new AprlTokenType("CONJ_ASSIGN");
  IElementType CONST = new AprlTokenType("CONST");
  IElementType CONTINUE = new AprlTokenType("CONTINUE");
  IElementType CONTINUE_AT = new AprlTokenType("CONTINUE_AT");
  IElementType COVER = new AprlTokenType("COVER");
  IElementType DECR = new AprlTokenType("DECR");
  IElementType DEF = new AprlTokenType("DEF");
  IElementType DEFINE = new AprlTokenType("DEFINE");
  IElementType DISJ = new AprlTokenType("DISJ");
  IElementType DISJ_ASSIGN = new AprlTokenType("DISJ_ASSIGN");
  IElementType DIV = new AprlTokenType("DIV");
  IElementType DIV_ASSIGN = new AprlTokenType("DIV_ASSIGN");
  IElementType DO = new AprlTokenType("DO");
  IElementType DOC_COMMENT = new AprlTokenType("DOC_COMMENT");
  IElementType DOUBLE_AT = new AprlTokenType("DOUBLE_AT");
  IElementType DOUBLE_EXCL = new AprlTokenType("DOUBLE_EXCL");
  IElementType DOUBLE_LITERAL = new AprlTokenType("DOUBLE_LITERAL");
  IElementType DOUBLE_PERIOD = new AprlTokenType("DOUBLE_PERIOD");
  IElementType ELSE = new AprlTokenType("ELSE");
  IElementType ELSIF = new AprlTokenType("ELSIF");
  IElementType ELVIS = new AprlTokenType("ELVIS");
  IElementType ELVIS_ASSIGN = new AprlTokenType("ELVIS_ASSIGN");
  IElementType ENUM = new AprlTokenType("ENUM");
  IElementType EOL_COMMENT = new AprlTokenType("EOL_COMMENT");
  IElementType EQUAL = new AprlTokenType("EQUAL");
  IElementType EXCL = new AprlTokenType("EXCL");
  IElementType EXEC = new AprlTokenType("EXEC");
  IElementType EXP = new AprlTokenType("EXP");
  IElementType EXP_ASSIGN = new AprlTokenType("EXP_ASSIGN");
  IElementType EXTENSION = new AprlTokenType("EXTENSION");
  IElementType EXTERN = new AprlTokenType("EXTERN");
  IElementType FALSE = new AprlTokenType("FALSE");
  IElementType FINAL = new AprlTokenType("FINAL");
  IElementType FINALLY = new AprlTokenType("FINALLY");
  IElementType FLOAT_LITERAL = new AprlTokenType("FLOAT_LITERAL");
  IElementType FOR = new AprlTokenType("FOR");
  IElementType FUNCTION = new AprlTokenType("FUNCTION");
  IElementType GEQ = new AprlTokenType("GEQ");
  IElementType GETTER_ = new AprlTokenType("GETTER_");
  IElementType HANDLE = new AprlTokenType("HANDLE");
  IElementType HASH = new AprlTokenType("HASH");
  IElementType IDENTICAL = new AprlTokenType("IDENTICAL");
  IElementType IDENTIFIER_ = new AprlTokenType("IDENTIFIER_");
  IElementType IF = new AprlTokenType("IF");
  IElementType IN = new AprlTokenType("IN");
  IElementType INCR = new AprlTokenType("INCR");
  IElementType INIT = new AprlTokenType("INIT");
  IElementType INST = new AprlTokenType("INST");
  IElementType INTEGER_LITERAL = new AprlTokenType("INTEGER_LITERAL");
  IElementType INTERFACE = new AprlTokenType("INTERFACE");
  IElementType LANGLE = new AprlTokenType("LANGLE");
  IElementType LARROW = new AprlTokenType("LARROW");
  IElementType LCURLY = new AprlTokenType("LCURLY");
  IElementType LEQ = new AprlTokenType("LEQ");
  IElementType LOCAL = new AprlTokenType("LOCAL");
  IElementType LONG_LITERAL = new AprlTokenType("LONG_LITERAL");
  IElementType LPAREN = new AprlTokenType("LPAREN");
  IElementType LSQUARE = new AprlTokenType("LSQUARE");
  IElementType MATCH = new AprlTokenType("MATCH");
  IElementType MOD = new AprlTokenType("MOD");
  IElementType MOD_ASSIGN = new AprlTokenType("MOD_ASSIGN");
  IElementType MUL = new AprlTokenType("MUL");
  IElementType MUL_ASSIGN = new AprlTokenType("MUL_ASSIGN");
  IElementType NAMESPACE = new AprlTokenType("NAMESPACE");
  IElementType NEQUAL = new AprlTokenType("NEQUAL");
  IElementType NGEQ = new AprlTokenType("NGEQ");
  IElementType NIDENTICAL = new AprlTokenType("NIDENTICAL");
  IElementType NL = new AprlTokenType("NL");
  IElementType NLANGLE = new AprlTokenType("NLANGLE");
  IElementType NLEQ = new AprlTokenType("NLEQ");
  IElementType NONE = new AprlTokenType("NONE");
  IElementType NOT = new AprlTokenType("NOT");
  IElementType NOT_IN = new AprlTokenType("NOT_IN");
  IElementType NOT_INST = new AprlTokenType("NOT_INST");
  IElementType NRANGLE = new AprlTokenType("NRANGLE");
  IElementType NULL = new AprlTokenType("NULL");
  IElementType OPEN = new AprlTokenType("OPEN");
  IElementType OPERATOR = new AprlTokenType("OPERATOR");
  IElementType OR = new AprlTokenType("OR");
  IElementType PARAMS = new AprlTokenType("PARAMS");
  IElementType PARTNER = new AprlTokenType("PARTNER");
  IElementType PERIOD = new AprlTokenType("PERIOD");
  IElementType PRIV = new AprlTokenType("PRIV");
  IElementType PUBLIC = new AprlTokenType("PUBLIC");
  IElementType QUEST = new AprlTokenType("QUEST");
  IElementType QUEST_PERIOD = new AprlTokenType("QUEST_PERIOD");
  IElementType RANGLE = new AprlTokenType("RANGLE");
  IElementType RARROW = new AprlTokenType("RARROW");
  IElementType RARROW_THICK = new AprlTokenType("RARROW_THICK");
  IElementType RAW_STRING_LITERAL = new AprlTokenType("RAW_STRING_LITERAL");
  IElementType RCURLY = new AprlTokenType("RCURLY");
  IElementType RETURN = new AprlTokenType("RETURN");
  IElementType RETURN_AT = new AprlTokenType("RETURN_AT");
  IElementType RPAREN = new AprlTokenType("RPAREN");
  IElementType RSQUARE = new AprlTokenType("RSQUARE");
  IElementType SAMPLE = new AprlTokenType("SAMPLE");
  IElementType SCRIPT = new AprlTokenType("SCRIPT");
  IElementType SEMICOLON = new AprlTokenType("SEMICOLON");
  IElementType SETTER_ = new AprlTokenType("SETTER_");
  IElementType SHORT_LITERAL = new AprlTokenType("SHORT_LITERAL");
  IElementType SPACESHIP = new AprlTokenType("SPACESHIP");
  IElementType STRING_LITERAL = new AprlTokenType("STRING_LITERAL");
  IElementType STRUCT = new AprlTokenType("STRUCT");
  IElementType SUB = new AprlTokenType("SUB");
  IElementType SUB_ASSIGN = new AprlTokenType("SUB_ASSIGN");
  IElementType SUPER = new AprlTokenType("SUPER");
  IElementType SYNC = new AprlTokenType("SYNC");
  IElementType THIS = new AprlTokenType("THIS");
  IElementType TO = new AprlTokenType("TO");
  IElementType TRIGGER = new AprlTokenType("TRIGGER");
  IElementType TRIPLE_PERIOD = new AprlTokenType("TRIPLE_PERIOD");
  IElementType TRUE = new AprlTokenType("TRUE");
  IElementType TRY = new AprlTokenType("TRY");
  IElementType TYPE_ = new AprlTokenType("TYPE_");
  IElementType UNLESS = new AprlTokenType("UNLESS");
  IElementType USING = new AprlTokenType("USING");
  IElementType VAL = new AprlTokenType("VAL");
  IElementType VAR = new AprlTokenType("VAR");
  IElementType WHEN = new AprlTokenType("WHEN");
  IElementType WHILE = new AprlTokenType("WHILE");
  IElementType XOR = new AprlTokenType("XOR");
  IElementType XOR_ASSIGN = new AprlTokenType("XOR_ASSIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITIVE_EXPRESSION) {
        return new AprlAdditiveExpressionImpl(node);
      }
      else if (type == ADDITIVE_OPERATOR) {
        return new AprlAdditiveOperatorImpl(node);
      }
      else if (type == ANNOTATION) {
        return new AprlAnnotationImpl(node);
      }
      else if (type == ARRAY_ACCESS) {
        return new AprlArrayAccessImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new AprlAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new AprlAssignmentOperatorImpl(node);
      }
      else if (type == ATOMIC_EXPRESSION) {
        return new AprlAtomicExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new AprlBlockImpl(node);
      }
      else if (type == BOOL_LITERAL) {
        return new AprlBoolLiteralImpl(node);
      }
      else if (type == BY_OPERATOR) {
        return new AprlByOperatorImpl(node);
      }
      else if (type == CALL_SUFFIX) {
        return new AprlCallSuffixImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new AprlClassBodyImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new AprlClassDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER) {
        return new AprlClassMemberImpl(node);
      }
      else if (type == CLASS_PARAMETER) {
        return new AprlClassParameterImpl(node);
      }
      else if (type == CLASS_PARAMETERS) {
        return new AprlClassParametersImpl(node);
      }
      else if (type == COLLECTION_LITERAL) {
        return new AprlCollectionLiteralImpl(node);
      }
      else if (type == COMMENT) {
        return new AprlCommentImpl(node);
      }
      else if (type == COMPARISON) {
        return new AprlComparisonImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new AprlComparisonOperatorImpl(node);
      }
      else if (type == CONDITIONAL_EXPRESSION) {
        return new AprlConditionalExpressionImpl(node);
      }
      else if (type == CONJUNCTION) {
        return new AprlConjunctionImpl(node);
      }
      else if (type == CONJUNCTION_OPERATOR) {
        return new AprlConjunctionOperatorImpl(node);
      }
      else if (type == CONSTRUCTOR_DELEGATION_CALL) {
        return new AprlConstructorDelegationCallImpl(node);
      }
      else if (type == CONSTRUCTOR_INVOCATION) {
        return new AprlConstructorInvocationImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_BODY) {
        return new AprlControlStructureBodyImpl(node);
      }
      else if (type == DELEGATION_SPECIFIER) {
        return new AprlDelegationSpecifierImpl(node);
      }
      else if (type == DELEGATION_SPECIFIERS) {
        return new AprlDelegationSpecifiersImpl(node);
      }
      else if (type == DISJUNCTION) {
        return new AprlDisjunctionImpl(node);
      }
      else if (type == DISJUNCTION_OPERATOR) {
        return new AprlDisjunctionOperatorImpl(node);
      }
      else if (type == DO_WHILE_EXPRESSION) {
        return new AprlDoWhileExpressionImpl(node);
      }
      else if (type == ELVIS_EXPRESSION) {
        return new AprlElvisExpressionImpl(node);
      }
      else if (type == ELVIS_OPERATOR) {
        return new AprlElvisOperatorImpl(node);
      }
      else if (type == ENUM_BODY) {
        return new AprlEnumBodyImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new AprlEnumDeclarationImpl(node);
      }
      else if (type == ENUM_ENTRIES) {
        return new AprlEnumEntriesImpl(node);
      }
      else if (type == ENUM_ENTRY) {
        return new AprlEnumEntryImpl(node);
      }
      else if (type == EQUALITY_COMPARISON) {
        return new AprlEqualityComparisonImpl(node);
      }
      else if (type == EQUALITY_OPERATOR) {
        return new AprlEqualityOperatorImpl(node);
      }
      else if (type == EXPONENTIAL_EXPRESSION) {
        return new AprlExponentialExpressionImpl(node);
      }
      else if (type == EXPONENTIAL_OPERATOR) {
        return new AprlExponentialOperatorImpl(node);
      }
      else if (type == EXPRESSION) {
        return new AprlExpressionImpl(node);
      }
      else if (type == FINALLY_BLOCK) {
        return new AprlFinallyBlockImpl(node);
      }
      else if (type == FOR_EXPRESSION) {
        return new AprlForExpressionImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new AprlFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new AprlFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_LITERAL) {
        return new AprlFunctionLiteralImpl(node);
      }
      else if (type == FUNCTION_MODIFIER) {
        return new AprlFunctionModifierImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new AprlFunctionTypeImpl(node);
      }
      else if (type == FUNCTION_TYPE_PARAMETERS) {
        return new AprlFunctionTypeParametersImpl(node);
      }
      else if (type == FUNCTION_TYPE_RECEIVER) {
        return new AprlFunctionTypeReceiverImpl(node);
      }
      else if (type == FUNCTION_VALUE_PARAMETER) {
        return new AprlFunctionValueParameterImpl(node);
      }
      else if (type == FUNCTION_VALUE_PARAMETERS) {
        return new AprlFunctionValueParametersImpl(node);
      }
      else if (type == GETTER) {
        return new AprlGetterImpl(node);
      }
      else if (type == HANDLE_BLOCK) {
        return new AprlHandleBlockImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new AprlIdentifierImpl(node);
      }
      else if (type == IDENTITY_COMPARISON) {
        return new AprlIdentityComparisonImpl(node);
      }
      else if (type == IDENTITY_OPERATOR) {
        return new AprlIdentityOperatorImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new AprlIfExpressionImpl(node);
      }
      else if (type == IMPORT_ALIAS) {
        return new AprlImportAliasImpl(node);
      }
      else if (type == IMPORT_HEADER) {
        return new AprlImportHeaderImpl(node);
      }
      else if (type == IMPORT_IDENTIFIER) {
        return new AprlImportIdentifierImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new AprlImportListImpl(node);
      }
      else if (type == INFIX_FUNCTION_CALL) {
        return new AprlInfixFunctionCallImpl(node);
      }
      else if (type == INHERITANCE_MODIFIER) {
        return new AprlInheritanceModifierImpl(node);
      }
      else if (type == INITIALIZER_BODY) {
        return new AprlInitializerBodyImpl(node);
      }
      else if (type == INST_OPERATOR) {
        return new AprlInstOperatorImpl(node);
      }
      else if (type == IN_OPERATOR) {
        return new AprlInOperatorImpl(node);
      }
      else if (type == JUMP_EXPRESSION) {
        return new AprlJumpExpressionImpl(node);
      }
      else if (type == LABEL_DEFINITION) {
        return new AprlLabelDefinitionImpl(node);
      }
      else if (type == LABEL_REFERENCE) {
        return new AprlLabelReferenceImpl(node);
      }
      else if (type == LAMBDA_PARAMETER) {
        return new AprlLambdaParameterImpl(node);
      }
      else if (type == LAMBDA_PARAMETERS) {
        return new AprlLambdaParametersImpl(node);
      }
      else if (type == LITERAL_CONSTANT) {
        return new AprlLiteralConstantImpl(node);
      }
      else if (type == LOAD_SCRIPT) {
        return new AprlLoadScriptImpl(node);
      }
      else if (type == LOCAL_PROPERTY_DECLARATION) {
        return new AprlLocalPropertyDeclarationImpl(node);
      }
      else if (type == LOOP_EXPRESSION) {
        return new AprlLoopExpressionImpl(node);
      }
      else if (type == MATCH_ENTRY) {
        return new AprlMatchEntryImpl(node);
      }
      else if (type == MATCH_EXPRESSION) {
        return new AprlMatchExpressionImpl(node);
      }
      else if (type == MEMBER_ACCESS_OPERATOR) {
        return new AprlMemberAccessOperatorImpl(node);
      }
      else if (type == MODIFIER) {
        return new AprlModifierImpl(node);
      }
      else if (type == MODIFIER_LIST) {
        return new AprlModifierListImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new AprlMultiplicativeExpressionImpl(node);
      }
      else if (type == MULTIPLICATIVE_OPERATOR) {
        return new AprlMultiplicativeOperatorImpl(node);
      }
      else if (type == MULTI_VARIABLE_DECLARATION) {
        return new AprlMultiVariableDeclarationImpl(node);
      }
      else if (type == NAMED_INFIX) {
        return new AprlNamedInfixImpl(node);
      }
      else if (type == NAMESPACE_HEADER) {
        return new AprlNamespaceHeaderImpl(node);
      }
      else if (type == NULLABLE_TYPE) {
        return new AprlNullableTypeImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new AprlNullLiteralImpl(node);
      }
      else if (type == PARAMETER) {
        return new AprlParameterImpl(node);
      }
      else if (type == PARAMETER_MODIFIER) {
        return new AprlParameterModifierImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new AprlParenthesizedExpressionImpl(node);
      }
      else if (type == PARENTHESIZED_TYPE) {
        return new AprlParenthesizedTypeImpl(node);
      }
      else if (type == PARTNER_DECLARATION) {
        return new AprlPartnerDeclarationImpl(node);
      }
      else if (type == POSTFIX_UNARY_EXPRESSION) {
        return new AprlPostfixUnaryExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_OPERATION) {
        return new AprlPostfixUnaryOperationImpl(node);
      }
      else if (type == PREAMBLE) {
        return new AprlPreambleImpl(node);
      }
      else if (type == PREFIX_UNARY_EXPRESSION) {
        return new AprlPrefixUnaryExpressionImpl(node);
      }
      else if (type == PREFIX_UNARY_OPERATION) {
        return new AprlPrefixUnaryOperationImpl(node);
      }
      else if (type == PRIMARY_CONSTRUCTOR) {
        return new AprlPrimaryConstructorImpl(node);
      }
      else if (type == PROPERTY_BODY) {
        return new AprlPropertyBodyImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new AprlPropertyDeclarationImpl(node);
      }
      else if (type == RANGE_EXPRESSION) {
        return new AprlRangeExpressionImpl(node);
      }
      else if (type == SECONDARY_CONSTRUCTOR) {
        return new AprlSecondaryConstructorImpl(node);
      }
      else if (type == SEMI) {
        return new AprlSemiImpl(node);
      }
      else if (type == SETTER) {
        return new AprlSetterImpl(node);
      }
      else if (type == SIMPLE_IDENTIFIER) {
        return new AprlSimpleIdentifierImpl(node);
      }
      else if (type == SIMPLE_USER_TYPE) {
        return new AprlSimpleUserTypeImpl(node);
      }
      else if (type == STATEMENT) {
        return new AprlStatementImpl(node);
      }
      else if (type == STATEMENTS) {
        return new AprlStatementsImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new AprlStructDeclarationImpl(node);
      }
      else if (type == SUPER_EXPRESSION) {
        return new AprlSuperExpressionImpl(node);
      }
      else if (type == THIS_EXPRESSION) {
        return new AprlThisExpressionImpl(node);
      }
      else if (type == TOP_LEVEL_OBJECT) {
        return new AprlTopLevelObjectImpl(node);
      }
      else if (type == TO_OPERATOR) {
        return new AprlToOperatorImpl(node);
      }
      else if (type == TRILEAN_LITERAL) {
        return new AprlTrileanLiteralImpl(node);
      }
      else if (type == TRY_EXPRESSION) {
        return new AprlTryExpressionImpl(node);
      }
      else if (type == TYPE) {
        return new AprlTypeImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new AprlTypeArgumentsImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new AprlTypeDeclarationImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new AprlTypeExpressionImpl(node);
      }
      else if (type == TYPE_OPERATOR) {
        return new AprlTypeOperatorImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new AprlTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new AprlTypeParametersImpl(node);
      }
      else if (type == TYPE_PROJECTION) {
        return new AprlTypeProjectionImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new AprlTypeReferenceImpl(node);
      }
      else if (type == UNESCAPED_ANNOTATION) {
        return new AprlUnescapedAnnotationImpl(node);
      }
      else if (type == USER_TYPE) {
        return new AprlUserTypeImpl(node);
      }
      else if (type == VALUE_ARGUMENT) {
        return new AprlValueArgumentImpl(node);
      }
      else if (type == VALUE_ARGUMENTS) {
        return new AprlValueArgumentsImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new AprlVariableDeclarationImpl(node);
      }
      else if (type == VISIBILITY_MODIFIER) {
        return new AprlVisibilityModifierImpl(node);
      }
      else if (type == WHILE_EXPRESSION) {
        return new AprlWhileExpressionImpl(node);
      }
      else if (type == XOR_EXPRESSION) {
        return new AprlXorExpressionImpl(node);
      }
      else if (type == XOR_OPERATOR) {
        return new AprlXorOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
