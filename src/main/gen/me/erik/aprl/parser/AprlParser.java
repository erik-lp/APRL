// This is a generated file. Not intended for manual editing.
package me.erik.aprl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static me.erik.aprl.lang.psi.AprlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AprlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return aprlFile(b, l + 1);
  }

  /* ********************************************************** */
  // EOL_COMMENT | BLOCK_COMMENT | DOC_COMMENT
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = consumeToken(b, EOL_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // multiplicativeExpression (additiveOperator multiplicativeExpression)*
  public static boolean additiveExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = multiplicativeExpression(b, l + 1);
    r = r && additiveExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (additiveOperator multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additiveExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1", c)) break;
    }
    return true;
  }

  // additiveOperator multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveOperator(b, l + 1);
    r = r && multiplicativeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ADD | SUB
  public static boolean additiveOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveOperator")) return false;
    if (!nextTokenIs(b, "<additive operator>", ADD, SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_OPERATOR, "<additive operator>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HASH (unescapedAnnotation | LSQUARE NL* unescapedAnnotation+ NL* RSQUARE)
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && annotation_1(b, l + 1);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  // unescapedAnnotation | LSQUARE NL* unescapedAnnotation+ NL* RSQUARE
  private static boolean annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unescapedAnnotation(b, l + 1);
    if (!r) r = annotation_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LSQUARE NL* unescapedAnnotation+ NL* RSQUARE
  private static boolean annotation_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && annotation_1_1_1(b, l + 1);
    r = r && annotation_1_1_2(b, l + 1);
    r = r && annotation_1_1_3(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean annotation_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "annotation_1_1_1", c)) break;
    }
    return true;
  }

  // unescapedAnnotation+
  private static boolean annotation_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unescapedAnnotation(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!unescapedAnnotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_1_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean annotation_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "annotation_1_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // preamble NL* (topLevelObject (NL+ topLevelObject?)*)?
  static boolean aprlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = preamble(b, l + 1);
    r = r && aprlFile_1(b, l + 1);
    r = r && aprlFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean aprlFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "aprlFile_1", c)) break;
    }
    return true;
  }

  // (topLevelObject (NL+ topLevelObject?)*)?
  private static boolean aprlFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2")) return false;
    aprlFile_2_0(b, l + 1);
    return true;
  }

  // topLevelObject (NL+ topLevelObject?)*
  private static boolean aprlFile_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = topLevelObject(b, l + 1);
    r = r && aprlFile_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL+ topLevelObject?)*
  private static boolean aprlFile_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!aprlFile_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aprlFile_2_0_1", c)) break;
    }
    return true;
  }

  // NL+ topLevelObject?
  private static boolean aprlFile_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = aprlFile_2_0_1_0_0(b, l + 1);
    r = r && aprlFile_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL+
  private static boolean aprlFile_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "aprlFile_2_0_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // topLevelObject?
  private static boolean aprlFile_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aprlFile_2_0_1_0_1")) return false;
    topLevelObject(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LSQUARE NL* (expression (NL* COMMA NL* expression)*)? NL* RSQUARE
  public static boolean arrayAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess")) return false;
    if (!nextTokenIs(b, LSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && arrayAccess_1(b, l + 1);
    r = r && arrayAccess_2(b, l + 1);
    r = r && arrayAccess_3(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, ARRAY_ACCESS, r);
    return r;
  }

  // NL*
  private static boolean arrayAccess_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "arrayAccess_1", c)) break;
    }
    return true;
  }

  // (expression (NL* COMMA NL* expression)*)?
  private static boolean arrayAccess_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2")) return false;
    arrayAccess_2_0(b, l + 1);
    return true;
  }

  // expression (NL* COMMA NL* expression)*
  private static boolean arrayAccess_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && arrayAccess_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* expression)*
  private static boolean arrayAccess_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayAccess_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayAccess_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* expression
  private static boolean arrayAccess_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayAccess_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && arrayAccess_2_0_1_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean arrayAccess_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "arrayAccess_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean arrayAccess_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "arrayAccess_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean arrayAccess_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayAccess_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "arrayAccess_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (identifier arrayAccess* assignmentOperator)? disjunction
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = assignment_0(b, l + 1);
    r = r && disjunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier arrayAccess* assignmentOperator)?
  private static boolean assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_0")) return false;
    assignment_0_0(b, l + 1);
    return true;
  }

  // identifier arrayAccess* assignmentOperator
  private static boolean assignment_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && assignment_0_0_1(b, l + 1);
    r = r && assignmentOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayAccess*
  private static boolean assignment_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayAccess(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_0_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASSIGN | DEFINE | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN | CONJ_ASSIGN | DISJ_ASSIGN | XOR_ASSIGN | ELVIS_ASSIGN
  public static boolean assignmentOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, DEFINE);
    if (!r) r = consumeToken(b, ADD_ASSIGN);
    if (!r) r = consumeToken(b, SUB_ASSIGN);
    if (!r) r = consumeToken(b, MUL_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    if (!r) r = consumeToken(b, EXP_ASSIGN);
    if (!r) r = consumeToken(b, CONJ_ASSIGN);
    if (!r) r = consumeToken(b, DISJ_ASSIGN);
    if (!r) r = consumeToken(b, XOR_ASSIGN);
    if (!r) r = consumeToken(b, ELVIS_ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parenthesizedExpression | literalConstant | functionLiteral | thisExpression | superExpression | conditionalExpression | tryExpression| jumpExpression | loopExpression | collectionLiteral | simpleIdentifier | userType
  public static boolean atomicExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomicExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOMIC_EXPRESSION, "<atomic expression>");
    r = parenthesizedExpression(b, l + 1);
    if (!r) r = literalConstant(b, l + 1);
    if (!r) r = functionLiteral(b, l + 1);
    if (!r) r = thisExpression(b, l + 1);
    if (!r) r = superExpression(b, l + 1);
    if (!r) r = conditionalExpression(b, l + 1);
    if (!r) r = tryExpression(b, l + 1);
    if (!r) r = jumpExpression(b, l + 1);
    if (!r) r = loopExpression(b, l + 1);
    if (!r) r = collectionLiteral(b, l + 1);
    if (!r) r = simpleIdentifier(b, l + 1);
    if (!r) r = userType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LCURLY NL* statements NL* RCURLY
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && block_1(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && block_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // NL*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "block_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolLiteral")) return false;
    if (!nextTokenIs(b, "<bool literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_LITERAL, "<bool literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BY
  public static boolean byOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "byOperator")) return false;
    if (!nextTokenIs(b, BY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BY);
    exit_section_(b, m, BY_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // typeArguments? valueArguments
  public static boolean callSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callSuffix")) return false;
    if (!nextTokenIs(b, "<call suffix>", LANGLE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_SUFFIX, "<call suffix>");
    r = callSuffix_0(b, l + 1);
    r = r && valueArguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeArguments?
  private static boolean callSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callSuffix_0")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LCURLY NL* classMember* NL* RCURLY
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && classBody_1(b, l + 1);
    r = r && classBody_2(b, l + 1);
    r = r && classBody_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // NL*
  private static boolean classBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classBody_1", c)) break;
    }
    return true;
  }

  // classMember*
  private static boolean classBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classBody_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* (CLASS | INTERFACE | ANNOTATION_) NL* simpleIdentifier (NL* typeParameters)? (NL* primaryConstructor)? (NL* LARROW NL* delegationSpecifiers)? (NL* classBody)?
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = classDeclaration_0(b, l + 1);
    r = r && classDeclaration_1(b, l + 1);
    r = r && classDeclaration_2(b, l + 1);
    r = r && classDeclaration_3(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && classDeclaration_5(b, l + 1);
    r = r && classDeclaration_6(b, l + 1);
    r = r && classDeclaration_7(b, l + 1);
    r = r && classDeclaration_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean classDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean classDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_1", c)) break;
    }
    return true;
  }

  // CLASS | INTERFACE | ANNOTATION_
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    boolean r;
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, INTERFACE);
    if (!r) r = consumeToken(b, ANNOTATION_);
    return r;
  }

  // NL*
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_3", c)) break;
    }
    return true;
  }

  // (NL* typeParameters)?
  private static boolean classDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_5")) return false;
    classDeclaration_5_0(b, l + 1);
    return true;
  }

  // NL* typeParameters
  private static boolean classDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_5_0_0(b, l + 1);
    r = r && typeParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classDeclaration_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_5_0_0", c)) break;
    }
    return true;
  }

  // (NL* primaryConstructor)?
  private static boolean classDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_6")) return false;
    classDeclaration_6_0(b, l + 1);
    return true;
  }

  // NL* primaryConstructor
  private static boolean classDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_6_0_0(b, l + 1);
    r = r && primaryConstructor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classDeclaration_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_6_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_6_0_0", c)) break;
    }
    return true;
  }

  // (NL* LARROW NL* delegationSpecifiers)?
  private static boolean classDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_7")) return false;
    classDeclaration_7_0(b, l + 1);
    return true;
  }

  // NL* LARROW NL* delegationSpecifiers
  private static boolean classDeclaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_7_0_0(b, l + 1);
    r = r && consumeToken(b, LARROW);
    r = r && classDeclaration_7_0_2(b, l + 1);
    r = r && delegationSpecifiers(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classDeclaration_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_7_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_7_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classDeclaration_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_7_0_2", c)) break;
    }
    return true;
  }

  // (NL* classBody)?
  private static boolean classDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_8")) return false;
    classDeclaration_8_0(b, l + 1);
    return true;
  }

  // NL* classBody
  private static boolean classDeclaration_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_8_0_0(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classDeclaration_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_8_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_8_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (topLevelObject | secondaryConstructor | loadScript | initializerBody | partnerDeclaration) NL+
  public static boolean classMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER, "<class member>");
    r = classMember_0(b, l + 1);
    r = r && classMember_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // topLevelObject | secondaryConstructor | loadScript | initializerBody | partnerDeclaration
  private static boolean classMember_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMember_0")) return false;
    boolean r;
    r = topLevelObject(b, l + 1);
    if (!r) r = secondaryConstructor(b, l + 1);
    if (!r) r = loadScript(b, l + 1);
    if (!r) r = initializerBody(b, l + 1);
    if (!r) r = partnerDeclaration(b, l + 1);
    return r;
  }

  // NL+
  private static boolean classMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMember_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classMember_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* (VAL | VAR)? NL* simpleIdentifier NL* COLON NL* type (NL* ASSIGN NL* expression)?
  public static boolean classParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PARAMETER, "<class parameter>");
    r = classParameter_0(b, l + 1);
    r = r && classParameter_1(b, l + 1);
    r = r && classParameter_2(b, l + 1);
    r = r && classParameter_3(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && classParameter_5(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && classParameter_7(b, l + 1);
    r = r && type(b, l + 1);
    r = r && classParameter_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean classParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean classParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_1", c)) break;
    }
    return true;
  }

  // (VAL | VAR)?
  private static boolean classParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_2")) return false;
    classParameter_2_0(b, l + 1);
    return true;
  }

  // VAL | VAR
  private static boolean classParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_2_0")) return false;
    boolean r;
    r = consumeToken(b, VAL);
    if (!r) r = consumeToken(b, VAR);
    return r;
  }

  // NL*
  private static boolean classParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameter_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_7", c)) break;
    }
    return true;
  }

  // (NL* ASSIGN NL* expression)?
  private static boolean classParameter_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_9")) return false;
    classParameter_9_0(b, l + 1);
    return true;
  }

  // NL* ASSIGN NL* expression
  private static boolean classParameter_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameter_9_0_0(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && classParameter_9_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classParameter_9_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_9_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_9_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameter_9_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_9_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_9_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* (classParameter (NL* COMMA classParameter)*)? RPAREN
  public static boolean classParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && classParameters_1(b, l + 1);
    r = r && classParameters_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CLASS_PARAMETERS, r);
    return r;
  }

  // NL*
  private static boolean classParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_1", c)) break;
    }
    return true;
  }

  // (classParameter (NL* COMMA classParameter)*)?
  private static boolean classParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2")) return false;
    classParameters_2_0(b, l + 1);
    return true;
  }

  // classParameter (NL* COMMA classParameter)*
  private static boolean classParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameter(b, l + 1);
    r = r && classParameters_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA classParameter)*
  private static boolean classParameters_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classParameters_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA classParameter
  private static boolean classParameters_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameters_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && classParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classParameters_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_1_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LSQUARE NL* expression? (NL* COMMA NL* expression)* NL* RSQUARE
  public static boolean collectionLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral")) return false;
    if (!nextTokenIs(b, LSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && collectionLiteral_1(b, l + 1);
    r = r && collectionLiteral_2(b, l + 1);
    r = r && collectionLiteral_3(b, l + 1);
    r = r && collectionLiteral_4(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, COLLECTION_LITERAL, r);
    return r;
  }

  // NL*
  private static boolean collectionLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_1", c)) break;
    }
    return true;
  }

  // expression?
  private static boolean collectionLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2")) return false;
    expression(b, l + 1);
    return true;
  }

  // (NL* COMMA NL* expression)*
  private static boolean collectionLiteral_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!collectionLiteral_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_3", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* expression
  private static boolean collectionLiteral_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collectionLiteral_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && collectionLiteral_3_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean collectionLiteral_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean collectionLiteral_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_3_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean collectionLiteral_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // namedInfix (comparisonOperator namedInfix)*
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = namedInfix(b, l + 1);
    r = r && comparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comparisonOperator namedInfix)*
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1", c)) break;
    }
    return true;
  }

  // comparisonOperator namedInfix
  private static boolean comparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonOperator(b, l + 1);
    r = r && namedInfix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LANGLE | NLANGLE | RANGLE | NRANGLE | LEQ | NLEQ | GEQ | NGEQ | SPACESHIP
  public static boolean comparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, LANGLE);
    if (!r) r = consumeToken(b, NLANGLE);
    if (!r) r = consumeToken(b, RANGLE);
    if (!r) r = consumeToken(b, NRANGLE);
    if (!r) r = consumeToken(b, LEQ);
    if (!r) r = consumeToken(b, NLEQ);
    if (!r) r = consumeToken(b, GEQ);
    if (!r) r = consumeToken(b, NGEQ);
    if (!r) r = consumeToken(b, SPACESHIP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ifExpression | matchExpression
  public static boolean conditionalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = ifExpression(b, l + 1);
    if (!r) r = matchExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // equalityComparison (conjunctionOperator equalityComparison)*
  public static boolean conjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION, "<conjunction>");
    r = equalityComparison(b, l + 1);
    r = r && conjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (conjunctionOperator equalityComparison)*
  private static boolean conjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunction_1", c)) break;
    }
    return true;
  }

  // conjunctionOperator equalityComparison
  private static boolean conjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conjunctionOperator(b, l + 1);
    r = r && equalityComparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONJ | AND
  public static boolean conjunctionOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunctionOperator")) return false;
    if (!nextTokenIs(b, "<conjunction operator>", AND, CONJ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION_OPERATOR, "<conjunction operator>");
    r = consumeToken(b, CONJ);
    if (!r) r = consumeToken(b, AND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (THIS | SUPER) NL* valueArguments
  public static boolean constructorDelegationCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDelegationCall")) return false;
    if (!nextTokenIs(b, "<constructor delegation call>", SUPER, THIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DELEGATION_CALL, "<constructor delegation call>");
    r = constructorDelegationCall_0(b, l + 1);
    r = r && constructorDelegationCall_1(b, l + 1);
    r = r && valueArguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // THIS | SUPER
  private static boolean constructorDelegationCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDelegationCall_0")) return false;
    boolean r;
    r = consumeToken(b, THIS);
    if (!r) r = consumeToken(b, SUPER);
    return r;
  }

  // NL*
  private static boolean constructorDelegationCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDelegationCall_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "constructorDelegationCall_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // userType callSuffix
  public static boolean constructorInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_INVOCATION, "<constructor invocation>");
    r = userType(b, l + 1);
    r = r && callSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block | expression
  public static boolean controlStructureBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "controlStructureBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_BODY, "<control structure body>");
    r = block(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constructorInvocation | userType
  public static boolean delegationSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATION_SPECIFIER, "<delegation specifier>");
    r = constructorInvocation(b, l + 1);
    if (!r) r = userType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation* NL* delegationSpecifier (NL* COMMA NL* delegationSpecifier)*
  public static boolean delegationSpecifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATION_SPECIFIERS, "<delegation specifiers>");
    r = delegationSpecifiers_0(b, l + 1);
    r = r && delegationSpecifiers_1(b, l + 1);
    r = r && delegationSpecifier(b, l + 1);
    r = r && delegationSpecifiers_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean delegationSpecifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean delegationSpecifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_1", c)) break;
    }
    return true;
  }

  // (NL* COMMA NL* delegationSpecifier)*
  private static boolean delegationSpecifiers_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!delegationSpecifiers_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_3", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* delegationSpecifier
  private static boolean delegationSpecifiers_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delegationSpecifiers_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && delegationSpecifiers_3_0_2(b, l + 1);
    r = r && delegationSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean delegationSpecifiers_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean delegationSpecifiers_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_3_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // conjunction (disjunctionOperator conjunction)*
  public static boolean disjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION, "<disjunction>");
    r = conjunction(b, l + 1);
    r = r && disjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (disjunctionOperator conjunction)*
  private static boolean disjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!disjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunction_1", c)) break;
    }
    return true;
  }

  // disjunctionOperator conjunction
  private static boolean disjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = disjunctionOperator(b, l + 1);
    r = r && conjunction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DISJ | OR
  public static boolean disjunctionOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunctionOperator")) return false;
    if (!nextTokenIs(b, "<disjunction operator>", DISJ, OR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION_OPERATOR, "<disjunction operator>");
    r = consumeToken(b, DISJ);
    if (!r) r = consumeToken(b, OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DO NL* controlStructureBody NL* WHILE NL* LPAREN NL* expression NL* RPAREN
  public static boolean doWhileExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && doWhileExpression_1(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    r = r && doWhileExpression_3(b, l + 1);
    r = r && consumeToken(b, WHILE);
    r = r && doWhileExpression_5(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && doWhileExpression_7(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && doWhileExpression_9(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DO_WHILE_EXPRESSION, r);
    return r;
  }

  // NL*
  private static boolean doWhileExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "doWhileExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean doWhileExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "doWhileExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean doWhileExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "doWhileExpression_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean doWhileExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "doWhileExpression_7", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean doWhileExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "doWhileExpression_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // infixFunctionCall (elvisOperator infixFunctionCall)*
  public static boolean elvisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELVIS_EXPRESSION, "<elvis expression>");
    r = infixFunctionCall(b, l + 1);
    r = r && elvisExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (elvisOperator infixFunctionCall)*
  private static boolean elvisExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elvisExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elvisExpression_1", c)) break;
    }
    return true;
  }

  // elvisOperator infixFunctionCall
  private static boolean elvisExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elvisOperator(b, l + 1);
    r = r && infixFunctionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ELVIS
  public static boolean elvisOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisOperator")) return false;
    if (!nextTokenIs(b, ELVIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELVIS);
    exit_section_(b, m, ELVIS_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // LCURLY NL* enumEntries? (NL* SEMICOLON NL* classMember*)? NL* RCURLY
  public static boolean enumBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && enumBody_1(b, l + 1);
    r = r && enumBody_2(b, l + 1);
    r = r && enumBody_3(b, l + 1);
    r = r && enumBody_4(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, ENUM_BODY, r);
    return r;
  }

  // NL*
  private static boolean enumBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_1", c)) break;
    }
    return true;
  }

  // enumEntries?
  private static boolean enumBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_2")) return false;
    enumEntries(b, l + 1);
    return true;
  }

  // (NL* SEMICOLON NL* classMember*)?
  private static boolean enumBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_3")) return false;
    enumBody_3_0(b, l + 1);
    return true;
  }

  // NL* SEMICOLON NL* classMember*
  private static boolean enumBody_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumBody_3_0_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && enumBody_3_0_2(b, l + 1);
    r = r && enumBody_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumBody_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean enumBody_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_3_0_2", c)) break;
    }
    return true;
  }

  // classMember*
  private static boolean enumBody_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_3_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_3_0_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean enumBody_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* ENUM NL* simpleIdentifier (NL* primaryConstructor)? (NL* enumBody)
  public static boolean enumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = enumDeclaration_0(b, l + 1);
    r = r && enumDeclaration_1(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && enumDeclaration_3(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && enumDeclaration_5(b, l + 1);
    r = r && enumDeclaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean enumDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean enumDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumDeclaration_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean enumDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumDeclaration_3", c)) break;
    }
    return true;
  }

  // (NL* primaryConstructor)?
  private static boolean enumDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_5")) return false;
    enumDeclaration_5_0(b, l + 1);
    return true;
  }

  // NL* primaryConstructor
  private static boolean enumDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumDeclaration_5_0_0(b, l + 1);
    r = r && primaryConstructor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumDeclaration_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumDeclaration_5_0_0", c)) break;
    }
    return true;
  }

  // NL* enumBody
  private static boolean enumDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumDeclaration_6_0(b, l + 1);
    r = r && enumBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_6_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumDeclaration_6_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (enumEntry NL*)+ SEMICOLON?
  public static boolean enumEntries(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntries")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ENTRIES, "<enum entries>");
    r = enumEntries_0(b, l + 1);
    r = r && enumEntries_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (enumEntry NL*)+
  private static boolean enumEntries_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntries_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumEntries_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!enumEntries_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumEntries_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // enumEntry NL*
  private static boolean enumEntries_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntries_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumEntry(b, l + 1);
    r = r && enumEntries_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumEntries_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntries_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumEntries_0_0_1", c)) break;
    }
    return true;
  }

  // SEMICOLON?
  private static boolean enumEntries_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntries_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* valueArguments)? (NL* classBody)? (NL* COMMA)?
  public static boolean enumEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ENTRY, "<enum entry>");
    r = simpleIdentifier(b, l + 1);
    r = r && enumEntry_1(b, l + 1);
    r = r && enumEntry_2(b, l + 1);
    r = r && enumEntry_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* valueArguments)?
  private static boolean enumEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_1")) return false;
    enumEntry_1_0(b, l + 1);
    return true;
  }

  // NL* valueArguments
  private static boolean enumEntry_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumEntry_1_0_0(b, l + 1);
    r = r && valueArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumEntry_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumEntry_1_0_0", c)) break;
    }
    return true;
  }

  // (NL* classBody)?
  private static boolean enumEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_2")) return false;
    enumEntry_2_0(b, l + 1);
    return true;
  }

  // NL* classBody
  private static boolean enumEntry_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumEntry_2_0_0(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumEntry_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumEntry_2_0_0", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean enumEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_3")) return false;
    enumEntry_3_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean enumEntry_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumEntry_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean enumEntry_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumEntry_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "enumEntry_3_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identityComparison (equalityOperator identityComparison)*
  public static boolean equalityComparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityComparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_COMPARISON, "<equality comparison>");
    r = identityComparison(b, l + 1);
    r = r && equalityComparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (equalityOperator identityComparison)*
  private static boolean equalityComparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityComparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equalityComparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equalityComparison_1", c)) break;
    }
    return true;
  }

  // equalityOperator identityComparison
  private static boolean equalityComparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityComparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equalityOperator(b, l + 1);
    r = r && identityComparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL | NEQUAL
  public static boolean equalityOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityOperator")) return false;
    if (!nextTokenIs(b, "<equality operator>", EQUAL, NEQUAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_OPERATOR, "<equality operator>");
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, NEQUAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // xorExpression (exponentialOperator xorExpression)*
  public static boolean exponentialExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponentialExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENTIAL_EXPRESSION, "<exponential expression>");
    r = xorExpression(b, l + 1);
    r = r && exponentialExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (exponentialOperator xorExpression)*
  private static boolean exponentialExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponentialExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exponentialExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exponentialExpression_1", c)) break;
    }
    return true;
  }

  // exponentialOperator xorExpression
  private static boolean exponentialExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponentialExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponentialOperator(b, l + 1);
    r = r && xorExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXP
  public static boolean exponentialOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponentialOperator")) return false;
    if (!nextTokenIs(b, EXP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXP);
    exit_section_(b, m, EXPONENTIAL_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // assignment
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = assignment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FINALLY NL* block
  public static boolean finallyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && finallyBlock_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, FINALLY_BLOCK, r);
    return r;
  }

  // NL*
  private static boolean finallyBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "finallyBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FOR NL* LPAREN NL* annotation* NL* (variableDeclaration | multiVariableDeclaration) NL* 'in' NL* expression NL* RPAREN NL* controlStructureBody
  public static boolean forExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && forExpression_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && forExpression_3(b, l + 1);
    r = r && forExpression_4(b, l + 1);
    r = r && forExpression_5(b, l + 1);
    r = r && forExpression_6(b, l + 1);
    r = r && forExpression_7(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && forExpression_9(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && forExpression_11(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && forExpression_13(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    exit_section_(b, m, FOR_EXPRESSION, r);
    return r;
  }

  // NL*
  private static boolean forExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean forExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_3", c)) break;
    }
    return true;
  }

  // annotation*
  private static boolean forExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_4", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean forExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_5", c)) break;
    }
    return true;
  }

  // variableDeclaration | multiVariableDeclaration
  private static boolean forExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_6")) return false;
    boolean r;
    r = variableDeclaration(b, l + 1);
    if (!r) r = multiVariableDeclaration(b, l + 1);
    return r;
  }

  // NL*
  private static boolean forExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_7", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean forExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_9", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean forExpression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_11", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean forExpression_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression_13")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "forExpression_13", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block | ASSIGN NL* expression
  public static boolean functionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody")) return false;
    if (!nextTokenIs(b, "<function body>", ASSIGN, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    r = block(b, l + 1);
    if (!r) r = functionBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ASSIGN NL* expression
  private static boolean functionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && functionBody_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionBody_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* (FUNCTION | SCRIPT | OPERATOR) (NL* typeParameters)? (NL* identifier)? NL* functionValueParameters (NL* RARROW NL* type)? (NL* functionBody)?
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = functionDeclaration_0(b, l + 1);
    r = r && functionDeclaration_1(b, l + 1);
    r = r && functionDeclaration_2(b, l + 1);
    r = r && functionDeclaration_3(b, l + 1);
    r = r && functionDeclaration_4(b, l + 1);
    r = r && functionDeclaration_5(b, l + 1);
    r = r && functionValueParameters(b, l + 1);
    r = r && functionDeclaration_7(b, l + 1);
    r = r && functionDeclaration_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean functionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean functionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_1", c)) break;
    }
    return true;
  }

  // FUNCTION | SCRIPT | OPERATOR
  private static boolean functionDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_2")) return false;
    boolean r;
    r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, SCRIPT);
    if (!r) r = consumeToken(b, OPERATOR);
    return r;
  }

  // (NL* typeParameters)?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    functionDeclaration_3_0(b, l + 1);
    return true;
  }

  // NL* typeParameters
  private static boolean functionDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration_3_0_0(b, l + 1);
    r = r && typeParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionDeclaration_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_3_0_0", c)) break;
    }
    return true;
  }

  // (NL* identifier)?
  private static boolean functionDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_4")) return false;
    functionDeclaration_4_0(b, l + 1);
    return true;
  }

  // NL* identifier
  private static boolean functionDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration_4_0_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionDeclaration_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_4_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_5", c)) break;
    }
    return true;
  }

  // (NL* RARROW NL* type)?
  private static boolean functionDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_7")) return false;
    functionDeclaration_7_0(b, l + 1);
    return true;
  }

  // NL* RARROW NL* type
  private static boolean functionDeclaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration_7_0_0(b, l + 1);
    r = r && consumeToken(b, RARROW);
    r = r && functionDeclaration_7_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionDeclaration_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_7_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_7_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionDeclaration_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_7_0_2", c)) break;
    }
    return true;
  }

  // (NL* functionBody)?
  private static boolean functionDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8")) return false;
    functionDeclaration_8_0(b, l + 1);
    return true;
  }

  // NL* functionBody
  private static boolean functionDeclaration_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration_8_0_0(b, l + 1);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionDeclaration_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_8_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation* NL* (LCURLY NL* statements NL* RCURLY | LCURLY NL* lambdaParameters NL* RARROW_THICK NL* statements NL* RCURLY | lambdaParameters NL* RARROW_THICK NL* statement)
  public static boolean functionLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_LITERAL, "<function literal>");
    r = functionLiteral_0(b, l + 1);
    r = r && functionLiteral_1(b, l + 1);
    r = r && functionLiteral_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean functionLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_1", c)) break;
    }
    return true;
  }

  // LCURLY NL* statements NL* RCURLY | LCURLY NL* lambdaParameters NL* RARROW_THICK NL* statements NL* RCURLY | lambdaParameters NL* RARROW_THICK NL* statement
  private static boolean functionLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionLiteral_2_0(b, l + 1);
    if (!r) r = functionLiteral_2_1(b, l + 1);
    if (!r) r = functionLiteral_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LCURLY NL* statements NL* RCURLY
  private static boolean functionLiteral_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && functionLiteral_2_0_1(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && functionLiteral_2_0_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionLiteral_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_0_3", c)) break;
    }
    return true;
  }

  // LCURLY NL* lambdaParameters NL* RARROW_THICK NL* statements NL* RCURLY
  private static boolean functionLiteral_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && functionLiteral_2_1_1(b, l + 1);
    r = r && lambdaParameters(b, l + 1);
    r = r && functionLiteral_2_1_3(b, l + 1);
    r = r && consumeToken(b, RARROW_THICK);
    r = r && functionLiteral_2_1_5(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && functionLiteral_2_1_7(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionLiteral_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_1_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_1_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_2_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_1_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_1_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_2_1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_1_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_1_7", c)) break;
    }
    return true;
  }

  // lambdaParameters NL* RARROW_THICK NL* statement
  private static boolean functionLiteral_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambdaParameters(b, l + 1);
    r = r && functionLiteral_2_2_1(b, l + 1);
    r = r && consumeToken(b, RARROW_THICK);
    r = r && functionLiteral_2_2_3(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionLiteral_2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_2_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionLiteral_2_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteral_2_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteral_2_2_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // EXTENSION | SYNC | EXTERN
  public static boolean functionModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_MODIFIER, "<function modifier>");
    r = consumeToken(b, EXTENSION);
    if (!r) r = consumeToken(b, SYNC);
    if (!r) r = consumeToken(b, EXTERN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (functionTypeReceiver NL* PERIOD NL*)? functionTypeParameters NL* RARROW_THICK NL* type
  public static boolean functionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE, "<function type>");
    r = functionType_0(b, l + 1);
    r = r && functionTypeParameters(b, l + 1);
    r = r && functionType_2(b, l + 1);
    r = r && consumeToken(b, RARROW_THICK);
    r = r && functionType_4(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (functionTypeReceiver NL* PERIOD NL*)?
  private static boolean functionType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_0")) return false;
    functionType_0_0(b, l + 1);
    return true;
  }

  // functionTypeReceiver NL* PERIOD NL*
  private static boolean functionType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionTypeReceiver(b, l + 1);
    r = r && functionType_0_0_1(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && functionType_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionType_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionType_0_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionType_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_0_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionType_0_0_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionType_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionType_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionType_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* ((parameter | type) (NL* COMMA NL* (parameter | type))*)? NL* RPAREN
  public static boolean functionTypeParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && functionTypeParameters_1(b, l + 1);
    r = r && functionTypeParameters_2(b, l + 1);
    r = r && functionTypeParameters_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FUNCTION_TYPE_PARAMETERS, r);
    return r;
  }

  // NL*
  private static boolean functionTypeParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionTypeParameters_1", c)) break;
    }
    return true;
  }

  // ((parameter | type) (NL* COMMA NL* (parameter | type))*)?
  private static boolean functionTypeParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2")) return false;
    functionTypeParameters_2_0(b, l + 1);
    return true;
  }

  // (parameter | type) (NL* COMMA NL* (parameter | type))*
  private static boolean functionTypeParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionTypeParameters_2_0_0(b, l + 1);
    r = r && functionTypeParameters_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parameter | type
  private static boolean functionTypeParameters_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_0")) return false;
    boolean r;
    r = parameter(b, l + 1);
    if (!r) r = type(b, l + 1);
    return r;
  }

  // (NL* COMMA NL* (parameter | type))*
  private static boolean functionTypeParameters_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionTypeParameters_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionTypeParameters_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* (parameter | type)
  private static boolean functionTypeParameters_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionTypeParameters_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && functionTypeParameters_2_0_1_0_2(b, l + 1);
    r = r && functionTypeParameters_2_0_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionTypeParameters_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionTypeParameters_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionTypeParameters_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionTypeParameters_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // parameter | type
  private static boolean functionTypeParameters_2_0_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_2_0_1_0_3")) return false;
    boolean r;
    r = parameter(b, l + 1);
    if (!r) r = type(b, l + 1);
    return r;
  }

  // NL*
  private static boolean functionTypeParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeParameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionTypeParameters_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // parenthesizedType | nullableType | typeReference
  public static boolean functionTypeReceiver(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeReceiver")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_RECEIVER, "<function type receiver>");
    r = parenthesizedType(b, l + 1);
    if (!r) r = nullableType(b, l + 1);
    if (!r) r = typeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* parameter (NL* ASSIGN NL* expression)?
  public static boolean functionValueParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_VALUE_PARAMETER, "<function value parameter>");
    r = functionValueParameter_0(b, l + 1);
    r = r && functionValueParameter_1(b, l + 1);
    r = r && parameter(b, l + 1);
    r = r && functionValueParameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean functionValueParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean functionValueParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameter_1", c)) break;
    }
    return true;
  }

  // (NL* ASSIGN NL* expression)?
  private static boolean functionValueParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_3")) return false;
    functionValueParameter_3_0(b, l + 1);
    return true;
  }

  // NL* ASSIGN NL* expression
  private static boolean functionValueParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionValueParameter_3_0_0(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && functionValueParameter_3_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionValueParameter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameter_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionValueParameter_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameter_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameter_3_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* (functionValueParameter (NL* COMMA NL* functionValueParameter)*)? NL* RPAREN
  public static boolean functionValueParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && functionValueParameters_1(b, l + 1);
    r = r && functionValueParameters_2(b, l + 1);
    r = r && functionValueParameters_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FUNCTION_VALUE_PARAMETERS, r);
    return r;
  }

  // NL*
  private static boolean functionValueParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameters_1", c)) break;
    }
    return true;
  }

  // (functionValueParameter (NL* COMMA NL* functionValueParameter)*)?
  private static boolean functionValueParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2")) return false;
    functionValueParameters_2_0(b, l + 1);
    return true;
  }

  // functionValueParameter (NL* COMMA NL* functionValueParameter)*
  private static boolean functionValueParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionValueParameter(b, l + 1);
    r = r && functionValueParameters_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* functionValueParameter)*
  private static boolean functionValueParameters_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionValueParameters_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameters_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* functionValueParameter
  private static boolean functionValueParameters_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionValueParameters_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && functionValueParameters_2_0_1_0_2(b, l + 1);
    r = r && functionValueParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionValueParameters_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameters_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionValueParameters_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameters_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionValueParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionValueParameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "functionValueParameters_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* GETTER_ (NL* LPAREN NL* RPAREN)? NL* functionBody?
  public static boolean getter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETTER, "<getter>");
    r = getter_0(b, l + 1);
    r = r && getter_1(b, l + 1);
    r = r && consumeToken(b, GETTER_);
    r = r && getter_3(b, l + 1);
    r = r && getter_4(b, l + 1);
    r = r && getter_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean getter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean getter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "getter_1", c)) break;
    }
    return true;
  }

  // (NL* LPAREN NL* RPAREN)?
  private static boolean getter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_3")) return false;
    getter_3_0(b, l + 1);
    return true;
  }

  // NL* LPAREN NL* RPAREN
  private static boolean getter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = getter_3_0_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && getter_3_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean getter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "getter_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean getter_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "getter_3_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean getter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "getter_4", c)) break;
    }
    return true;
  }

  // functionBody?
  private static boolean getter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_5")) return false;
    functionBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // HANDLE NL* LPAREN NL* annotation* NL* simpleIdentifier NL* COLON NL* userType (NL* CONJ NL* userType)* NL* RPAREN NL* block
  public static boolean handleBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock")) return false;
    if (!nextTokenIs(b, HANDLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HANDLE);
    r = r && handleBlock_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && handleBlock_3(b, l + 1);
    r = r && handleBlock_4(b, l + 1);
    r = r && handleBlock_5(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && handleBlock_7(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && handleBlock_9(b, l + 1);
    r = r && userType(b, l + 1);
    r = r && handleBlock_11(b, l + 1);
    r = r && handleBlock_12(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && handleBlock_14(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, HANDLE_BLOCK, r);
    return r;
  }

  // NL*
  private static boolean handleBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_3", c)) break;
    }
    return true;
  }

  // annotation*
  private static boolean handleBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_4", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_7", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_9", c)) break;
    }
    return true;
  }

  // (NL* CONJ NL* userType)*
  private static boolean handleBlock_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!handleBlock_11_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_11", c)) break;
    }
    return true;
  }

  // NL* CONJ NL* userType
  private static boolean handleBlock_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = handleBlock_11_0_0(b, l + 1);
    r = r && consumeToken(b, CONJ);
    r = r && handleBlock_11_0_2(b, l + 1);
    r = r && userType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean handleBlock_11_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_11_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_11_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_11_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_11_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_11_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_12")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_12", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean handleBlock_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handleBlock_14")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "handleBlock_14", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* PERIOD NL* simpleIdentifier)*
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = simpleIdentifier(b, l + 1);
    r = r && identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* PERIOD NL* simpleIdentifier)*
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1", c)) break;
    }
    return true;
  }

  // NL* PERIOD NL* simpleIdentifier
  private static boolean identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_1_0_0(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && identifier_1_0_2(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean identifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean identifier_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // comparison (identityOperator comparison)*
  public static boolean identityComparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityComparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTITY_COMPARISON, "<identity comparison>");
    r = comparison(b, l + 1);
    r = r && identityComparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identityOperator comparison)*
  private static boolean identityComparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityComparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identityComparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identityComparison_1", c)) break;
    }
    return true;
  }

  // identityOperator comparison
  private static boolean identityComparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityComparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identityOperator(b, l + 1);
    r = r && comparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTICAL | NIDENTICAL
  public static boolean identityOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityOperator")) return false;
    if (!nextTokenIs(b, "<identity operator>", IDENTICAL, NIDENTICAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTITY_OPERATOR, "<identity operator>");
    r = consumeToken(b, IDENTICAL);
    if (!r) r = consumeToken(b, NIDENTICAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (IF | UNLESS) NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody (NL* ELSIF NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody)* (NL* ELSE NL* controlStructureBody)?
  public static boolean ifExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression")) return false;
    if (!nextTokenIs(b, "<if expression>", IF, UNLESS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPRESSION, "<if expression>");
    r = ifExpression_0(b, l + 1);
    r = r && ifExpression_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ifExpression_3(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && ifExpression_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ifExpression_7(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    r = r && ifExpression_9(b, l + 1);
    r = r && ifExpression_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IF | UNLESS
  private static boolean ifExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_0")) return false;
    boolean r;
    r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, UNLESS);
    return r;
  }

  // NL*
  private static boolean ifExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_7", c)) break;
    }
    return true;
  }

  // (NL* ELSIF NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody)*
  private static boolean ifExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifExpression_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9", c)) break;
    }
    return true;
  }

  // NL* ELSIF NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody
  private static boolean ifExpression_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifExpression_9_0_0(b, l + 1);
    r = r && consumeToken(b, ELSIF);
    r = r && ifExpression_9_0_2(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ifExpression_9_0_4(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && ifExpression_9_0_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ifExpression_9_0_8(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean ifExpression_9_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_9_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_9_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9_0_4", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_9_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9_0_6", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_9_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_9_0_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_9_0_8", c)) break;
    }
    return true;
  }

  // (NL* ELSE NL* controlStructureBody)?
  private static boolean ifExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_10")) return false;
    ifExpression_10_0(b, l + 1);
    return true;
  }

  // NL* ELSE NL* controlStructureBody
  private static boolean ifExpression_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifExpression_10_0_0(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && ifExpression_10_0_2(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean ifExpression_10_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_10_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_10_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_10_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_10_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_10_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ALIAS simpleIdentifier
  public static boolean importAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importAlias")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, IMPORT_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // USING importIdentifier (COMMA importIdentifier)* semi?
  public static boolean importHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && importIdentifier(b, l + 1);
    r = r && importHeader_2(b, l + 1);
    r = r && importHeader_3(b, l + 1);
    exit_section_(b, m, IMPORT_HEADER, r);
    return r;
  }

  // (COMMA importIdentifier)*
  private static boolean importHeader_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importHeader_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importHeader_2", c)) break;
    }
    return true;
  }

  // COMMA importIdentifier
  private static boolean importHeader_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && importIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // semi?
  private static boolean importHeader_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_3")) return false;
    semi(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier importAlias | identifier (PERIOD (MUL | LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE))?
  public static boolean importIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_IDENTIFIER, "<import identifier>");
    r = importIdentifier_0(b, l + 1);
    if (!r) r = importIdentifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier importAlias
  private static boolean importIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && importAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier (PERIOD (MUL | LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE))?
  private static boolean importIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && importIdentifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PERIOD (MUL | LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE))?
  private static boolean importIdentifier_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1")) return false;
    importIdentifier_1_1_0(b, l + 1);
    return true;
  }

  // PERIOD (MUL | LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE)
  private static boolean importIdentifier_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERIOD);
    r = r && importIdentifier_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MUL | LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE
  private static boolean importIdentifier_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = importIdentifier_1_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LSQUARE simpleIdentifier importAlias? (COMMA simpleIdentifier importAlias?)* RSQUARE
  private static boolean importIdentifier_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && simpleIdentifier(b, l + 1);
    r = r && importIdentifier_1_1_0_1_1_2(b, l + 1);
    r = r && importIdentifier_1_1_0_1_1_3(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, null, r);
    return r;
  }

  // importAlias?
  private static boolean importIdentifier_1_1_0_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1_1_2")) return false;
    importAlias(b, l + 1);
    return true;
  }

  // (COMMA simpleIdentifier importAlias?)*
  private static boolean importIdentifier_1_1_0_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importIdentifier_1_1_0_1_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importIdentifier_1_1_0_1_1_3", c)) break;
    }
    return true;
  }

  // COMMA simpleIdentifier importAlias?
  private static boolean importIdentifier_1_1_0_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && simpleIdentifier(b, l + 1);
    r = r && importIdentifier_1_1_0_1_1_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // importAlias?
  private static boolean importIdentifier_1_1_0_1_1_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importIdentifier_1_1_0_1_1_3_0_2")) return false;
    importAlias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // importHeader*
  public static boolean importList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importList")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_LIST, "<import list>");
    while (true) {
      int c = current_position_(b);
      if (!importHeader(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IN | NOT_IN
  public static boolean inOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inOperator")) return false;
    if (!nextTokenIs(b, "<in operator>", IN, NOT_IN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_OPERATOR, "<in operator>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, NOT_IN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rangeExpression (simpleIdentifier rangeExpression?)*
  public static boolean infixFunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_FUNCTION_CALL, "<infix function call>");
    r = rangeExpression(b, l + 1);
    r = r && infixFunctionCall_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simpleIdentifier rangeExpression?)*
  private static boolean infixFunctionCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infixFunctionCall_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixFunctionCall_1", c)) break;
    }
    return true;
  }

  // simpleIdentifier rangeExpression?
  private static boolean infixFunctionCall_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleIdentifier(b, l + 1);
    r = r && infixFunctionCall_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // rangeExpression?
  private static boolean infixFunctionCall_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1_0_1")) return false;
    rangeExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SAMPLE | FINAL | OPEN | COVER
  public static boolean inheritanceModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inheritanceModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INHERITANCE_MODIFIER, "<inheritance modifier>");
    r = consumeToken(b, SAMPLE);
    if (!r) r = consumeToken(b, FINAL);
    if (!r) r = consumeToken(b, OPEN);
    if (!r) r = consumeToken(b, COVER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INIT NL* block
  public static boolean initializerBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializerBody")) return false;
    if (!nextTokenIs(b, INIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INIT);
    r = r && initializerBody_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, INITIALIZER_BODY, r);
    return r;
  }

  // NL*
  private static boolean initializerBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializerBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "initializerBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INST | NOT_INST
  public static boolean instOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instOperator")) return false;
    if (!nextTokenIs(b, "<inst operator>", INST, NOT_INST)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INST_OPERATOR, "<inst operator>");
    r = consumeToken(b, INST);
    if (!r) r = consumeToken(b, NOT_INST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRIGGER NL* expression | (RETURN | RETURN_AT simpleIdentifier) expression? | CONTINUE | CONTINUE_AT simpleIdentifier | BREAK | BREAK_AT simpleIdentifier
  public static boolean jumpExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUMP_EXPRESSION, "<jump expression>");
    r = jumpExpression_0(b, l + 1);
    if (!r) r = jumpExpression_1(b, l + 1);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = jumpExpression_3(b, l + 1);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = jumpExpression_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TRIGGER NL* expression
  private static boolean jumpExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRIGGER);
    r = r && jumpExpression_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean jumpExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "jumpExpression_0_1", c)) break;
    }
    return true;
  }

  // (RETURN | RETURN_AT simpleIdentifier) expression?
  private static boolean jumpExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = jumpExpression_1_0(b, l + 1);
    r = r && jumpExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN | RETURN_AT simpleIdentifier
  private static boolean jumpExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    if (!r) r = jumpExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN_AT simpleIdentifier
  private static boolean jumpExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN_AT);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean jumpExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // CONTINUE_AT simpleIdentifier
  private static boolean jumpExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE_AT);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BREAK_AT simpleIdentifier
  private static boolean jumpExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK_AT);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier AT NL*
  public static boolean labelDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL_DEFINITION, "<label definition>");
    r = simpleIdentifier(b, l + 1);
    r = r && consumeToken(b, AT);
    r = r && labelDefinition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean labelDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelDefinition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "labelDefinition_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AT simpleIdentifier
  public static boolean labelReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelReference")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, LABEL_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // variableDeclaration | multiVariableDeclaration (NL* COLON NL* type)?
  public static boolean lambdaParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_PARAMETER, "<lambda parameter>");
    r = variableDeclaration(b, l + 1);
    if (!r) r = lambdaParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // multiVariableDeclaration (NL* COLON NL* type)?
  private static boolean lambdaParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiVariableDeclaration(b, l + 1);
    r = r && lambdaParameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COLON NL* type)?
  private static boolean lambdaParameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter_1_1")) return false;
    lambdaParameter_1_1_0(b, l + 1);
    return true;
  }

  // NL* COLON NL* type
  private static boolean lambdaParameter_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambdaParameter_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && lambdaParameter_1_1_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean lambdaParameter_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter_1_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "lambdaParameter_1_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean lambdaParameter_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameter_1_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "lambdaParameter_1_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // lambdaParameter? (NL* COMMA NL* lambdaParameter)*
  public static boolean lambdaParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_PARAMETERS, "<lambda parameters>");
    r = lambdaParameters_0(b, l + 1);
    r = r && lambdaParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lambdaParameter?
  private static boolean lambdaParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters_0")) return false;
    lambdaParameter(b, l + 1);
    return true;
  }

  // (NL* COMMA NL* lambdaParameter)*
  private static boolean lambdaParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lambdaParameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaParameters_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* lambdaParameter
  private static boolean lambdaParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambdaParameters_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && lambdaParameters_1_0_2(b, l + 1);
    r = r && lambdaParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean lambdaParameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "lambdaParameters_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean lambdaParameters_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaParameters_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "lambdaParameters_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // nullLiteral | boolLiteral | trileanLiteral | INTEGER_LITERAL | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | COMPLEX_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | RAW_STRING_LITERAL
  public static boolean literalConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_CONSTANT, "<literal constant>");
    r = nullLiteral(b, l + 1);
    if (!r) r = boolLiteral(b, l + 1);
    if (!r) r = trileanLiteral(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, LONG_LITERAL);
    if (!r) r = consumeToken(b, SHORT_LITERAL);
    if (!r) r = consumeToken(b, BYTE_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, DOUBLE_LITERAL);
    if (!r) r = consumeToken(b, COMPLEX_LITERAL);
    if (!r) r = consumeToken(b, CHARACTER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, RAW_STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXEC NL* block
  public static boolean loadScript(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loadScript")) return false;
    if (!nextTokenIs(b, EXEC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXEC);
    r = r && loadScript_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, LOAD_SCRIPT, r);
    return r;
  }

  // NL*
  private static boolean loadScript_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loadScript_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "loadScript_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* (DEF | CONST | VAR | VAL) (NL* typeParameters)? (NL* type NL* PERIOD)? NL* (variableDeclaration | multiVariableDeclaration) (NL* ASSIGN expression)?
  public static boolean localPropertyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_PROPERTY_DECLARATION, "<local property declaration>");
    r = localPropertyDeclaration_0(b, l + 1);
    r = r && localPropertyDeclaration_1(b, l + 1);
    r = r && localPropertyDeclaration_2(b, l + 1);
    r = r && localPropertyDeclaration_3(b, l + 1);
    r = r && localPropertyDeclaration_4(b, l + 1);
    r = r && localPropertyDeclaration_5(b, l + 1);
    r = r && localPropertyDeclaration_6(b, l + 1);
    r = r && localPropertyDeclaration_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean localPropertyDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean localPropertyDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_1", c)) break;
    }
    return true;
  }

  // DEF | CONST | VAR | VAL
  private static boolean localPropertyDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_2")) return false;
    boolean r;
    r = consumeToken(b, DEF);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, VAL);
    return r;
  }

  // (NL* typeParameters)?
  private static boolean localPropertyDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_3")) return false;
    localPropertyDeclaration_3_0(b, l + 1);
    return true;
  }

  // NL* typeParameters
  private static boolean localPropertyDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = localPropertyDeclaration_3_0_0(b, l + 1);
    r = r && typeParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean localPropertyDeclaration_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_3_0_0", c)) break;
    }
    return true;
  }

  // (NL* type NL* PERIOD)?
  private static boolean localPropertyDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_4")) return false;
    localPropertyDeclaration_4_0(b, l + 1);
    return true;
  }

  // NL* type NL* PERIOD
  private static boolean localPropertyDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = localPropertyDeclaration_4_0_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && localPropertyDeclaration_4_0_2(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean localPropertyDeclaration_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_4_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean localPropertyDeclaration_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_4_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_4_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean localPropertyDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_5", c)) break;
    }
    return true;
  }

  // variableDeclaration | multiVariableDeclaration
  private static boolean localPropertyDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_6")) return false;
    boolean r;
    r = variableDeclaration(b, l + 1);
    if (!r) r = multiVariableDeclaration(b, l + 1);
    return r;
  }

  // (NL* ASSIGN expression)?
  private static boolean localPropertyDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_7")) return false;
    localPropertyDeclaration_7_0(b, l + 1);
    return true;
  }

  // NL* ASSIGN expression
  private static boolean localPropertyDeclaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = localPropertyDeclaration_7_0_0(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean localPropertyDeclaration_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localPropertyDeclaration_7_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "localPropertyDeclaration_7_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // forExpression | whileExpression | doWhileExpression
  public static boolean loopExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loopExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_EXPRESSION, "<loop expression>");
    r = forExpression(b, l + 1);
    if (!r) r = whileExpression(b, l + 1);
    if (!r) r = doWhileExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHEN NL* literalConstant (NL* COMMA NL* literalConstant)* NL* '=>' NL* controlStructureBody semi? | ELSE NL* RARROW_THICK NL* controlStructureBody
  public static boolean matchEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry")) return false;
    if (!nextTokenIs(b, "<match entry>", ELSE, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_ENTRY, "<match entry>");
    r = matchEntry_0(b, l + 1);
    if (!r) r = matchEntry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHEN NL* literalConstant (NL* COMMA NL* literalConstant)* NL* '=>' NL* controlStructureBody semi?
  private static boolean matchEntry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && matchEntry_0_1(b, l + 1);
    r = r && literalConstant(b, l + 1);
    r = r && matchEntry_0_3(b, l + 1);
    r = r && matchEntry_0_4(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && matchEntry_0_6(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    r = r && matchEntry_0_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean matchEntry_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_1", c)) break;
    }
    return true;
  }

  // (NL* COMMA NL* literalConstant)*
  private static boolean matchEntry_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!matchEntry_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_3", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* literalConstant
  private static boolean matchEntry_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchEntry_0_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && matchEntry_0_3_0_2(b, l + 1);
    r = r && literalConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean matchEntry_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchEntry_0_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_3_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchEntry_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_4", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchEntry_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_0_6", c)) break;
    }
    return true;
  }

  // semi?
  private static boolean matchEntry_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_0_8")) return false;
    semi(b, l + 1);
    return true;
  }

  // ELSE NL* RARROW_THICK NL* controlStructureBody
  private static boolean matchEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && matchEntry_1_1(b, l + 1);
    r = r && consumeToken(b, RARROW_THICK);
    r = r && matchEntry_1_3(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean matchEntry_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_1_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchEntry_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchEntry_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchEntry_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MATCH NL* LPAREN NL* expression NL* RPAREN NL* LCURLY NL* (matchEntry NL*)+ NL* RCURLY
  public static boolean matchExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && matchExpression_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && matchExpression_3(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && matchExpression_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && matchExpression_7(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && matchExpression_9(b, l + 1);
    r = r && matchExpression_10(b, l + 1);
    r = r && matchExpression_11(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, MATCH_EXPRESSION, r);
    return r;
  }

  // NL*
  private static boolean matchExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_7", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_9", c)) break;
    }
    return true;
  }

  // (matchEntry NL*)+
  private static boolean matchExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchExpression_10_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!matchExpression_10_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_10", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // matchEntry NL*
  private static boolean matchExpression_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchEntry(b, l + 1);
    r = r && matchExpression_10_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean matchExpression_10_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_10_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_10_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean matchExpression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchExpression_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "matchExpression_11", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PERIOD | QUEST_PERIOD
  public static boolean memberAccessOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccessOperator")) return false;
    if (!nextTokenIs(b, "<member access operator>", PERIOD, QUEST_PERIOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_ACCESS_OPERATOR, "<member access operator>");
    r = consumeToken(b, PERIOD);
    if (!r) r = consumeToken(b, QUEST_PERIOD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // visibilityModifier | inheritanceModifier | parameterModifier | functionModifier
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = visibilityModifier(b, l + 1);
    if (!r) r = inheritanceModifier(b, l + 1);
    if (!r) r = parameterModifier(b, l + 1);
    if (!r) r = functionModifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (annotation NL* | modifier NL*)+
  public static boolean modifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER_LIST, "<modifier list>");
    r = modifierList_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!modifierList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifierList", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation NL* | modifier NL*
  private static boolean modifierList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifierList_0_0(b, l + 1);
    if (!r) r = modifierList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation NL*
  private static boolean modifierList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation(b, l + 1);
    r = r && modifierList_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean modifierList_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "modifierList_0_0_1", c)) break;
    }
    return true;
  }

  // modifier NL*
  private static boolean modifierList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifier(b, l + 1);
    r = r && modifierList_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean modifierList_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifierList_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "modifierList_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* variableDeclaration (COMMA variableDeclaration)* NL* RPAREN
  public static boolean multiVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiVariableDeclaration")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && multiVariableDeclaration_1(b, l + 1);
    r = r && variableDeclaration(b, l + 1);
    r = r && multiVariableDeclaration_3(b, l + 1);
    r = r && multiVariableDeclaration_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, MULTI_VARIABLE_DECLARATION, r);
    return r;
  }

  // NL*
  private static boolean multiVariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiVariableDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "multiVariableDeclaration_1", c)) break;
    }
    return true;
  }

  // (COMMA variableDeclaration)*
  private static boolean multiVariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiVariableDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiVariableDeclaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiVariableDeclaration_3", c)) break;
    }
    return true;
  }

  // COMMA variableDeclaration
  private static boolean multiVariableDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiVariableDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variableDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean multiVariableDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiVariableDeclaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "multiVariableDeclaration_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // exponentialExpression (multiplicativeOperator exponentialExpression)*
  public static boolean multiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = exponentialExpression(b, l + 1);
    r = r && multiplicativeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (multiplicativeOperator exponentialExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicativeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1", c)) break;
    }
    return true;
  }

  // multiplicativeOperator exponentialExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeOperator(b, l + 1);
    r = r && exponentialExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MUL | DIV | MOD
  public static boolean multiplicativeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_OPERATOR, "<multiplicative operator>");
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // elvisExpression ((inOperator elvisExpression) | (instOperator type))*
  public static boolean namedInfix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedInfix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_INFIX, "<named infix>");
    r = elvisExpression(b, l + 1);
    r = r && namedInfix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((inOperator elvisExpression) | (instOperator type))*
  private static boolean namedInfix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedInfix_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namedInfix_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namedInfix_1", c)) break;
    }
    return true;
  }

  // (inOperator elvisExpression) | (instOperator type)
  private static boolean namedInfix_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedInfix_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namedInfix_1_0_0(b, l + 1);
    if (!r) r = namedInfix_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inOperator elvisExpression
  private static boolean namedInfix_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedInfix_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inOperator(b, l + 1);
    r = r && elvisExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // instOperator type
  private static boolean namedInfix_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedInfix_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instOperator(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* NAMESPACE identifier semi?
  public static boolean namespaceHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceHeader")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_HEADER, "<namespace header>");
    r = namespaceHeader_0(b, l + 1);
    r = r && namespaceHeader_1(b, l + 1);
    r = r && consumeToken(b, NAMESPACE);
    r = r && identifier(b, l + 1);
    r = r && namespaceHeader_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean namespaceHeader_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceHeader_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean namespaceHeader_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceHeader_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "namespaceHeader_1", c)) break;
    }
    return true;
  }

  // semi?
  private static boolean namespaceHeader_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceHeader_4")) return false;
    semi(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NULL
  public static boolean nullLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullLiteral")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // (typeReference | parenthesizedType) NL* QUEST+
  public static boolean nullableType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullableType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULLABLE_TYPE, "<nullable type>");
    r = nullableType_0(b, l + 1);
    r = r && nullableType_1(b, l + 1);
    r = r && nullableType_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeReference | parenthesizedType
  private static boolean nullableType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullableType_0")) return false;
    boolean r;
    r = typeReference(b, l + 1);
    if (!r) r = parenthesizedType(b, l + 1);
    return r;
  }

  // NL*
  private static boolean nullableType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullableType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "nullableType_1", c)) break;
    }
    return true;
  }

  // QUEST+
  private static boolean nullableType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullableType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUEST);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, QUEST)) break;
      if (!empty_element_parsed_guard_(b, "nullableType_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier COLON type
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = simpleIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARAMS
  public static boolean parameterModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterModifier")) return false;
    if (!nextTokenIs(b, PARAMS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMS);
    exit_section_(b, m, PARAMETER_MODIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN expression RPAREN
  public static boolean parenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARENTHESIZED_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN NL* type NL* RPAREN
  public static boolean parenthesizedType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedType")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && parenthesizedType_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && parenthesizedType_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARENTHESIZED_TYPE, r);
    return r;
  }

  // NL*
  private static boolean parenthesizedType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "parenthesizedType_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean parenthesizedType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedType_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "parenthesizedType_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* PARTNER NL* classBody
  public static boolean partnerDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partnerDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARTNER_DECLARATION, "<partner declaration>");
    r = partnerDeclaration_0(b, l + 1);
    r = r && partnerDeclaration_1(b, l + 1);
    r = r && consumeToken(b, PARTNER);
    r = r && partnerDeclaration_3(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean partnerDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partnerDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean partnerDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partnerDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "partnerDeclaration_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean partnerDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partnerDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "partnerDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // atomicExpression postfixUnaryOperation*
  public static boolean postfixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_EXPRESSION, "<postfix unary expression>");
    r = atomicExpression(b, l + 1);
    r = r && postfixUnaryExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postfixUnaryOperation*
  private static boolean postfixUnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postfixUnaryOperation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postfixUnaryExpression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INCR | DECR | DOUBLE_EXCL | callSuffix | arrayAccess | memberAccessOperator postfixUnaryExpression
  public static boolean postfixUnaryOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_OPERATION, "<postfix unary operation>");
    r = consumeToken(b, INCR);
    if (!r) r = consumeToken(b, DECR);
    if (!r) r = consumeToken(b, DOUBLE_EXCL);
    if (!r) r = callSuffix(b, l + 1);
    if (!r) r = arrayAccess(b, l + 1);
    if (!r) r = postfixUnaryOperation_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // memberAccessOperator postfixUnaryExpression
  private static boolean postfixUnaryOperation_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryOperation_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memberAccessOperator(b, l + 1);
    r = r && postfixUnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespaceHeader? importList
  public static boolean preamble(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preamble")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREAMBLE, "<preamble>");
    r = preamble_0(b, l + 1);
    r = r && importList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // namespaceHeader?
  private static boolean preamble_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preamble_0")) return false;
    namespaceHeader(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // prefixUnaryOperation* postfixUnaryExpression
  public static boolean prefixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_EXPRESSION, "<prefix unary expression>");
    r = prefixUnaryExpression_0(b, l + 1);
    r = r && postfixUnaryExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // prefixUnaryOperation*
  private static boolean prefixUnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prefixUnaryOperation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prefixUnaryExpression_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INCR | DECR | ADD | SUB | EXCL | NOT | DOUBLE_AT | annotation+ | labelDefinition
  public static boolean prefixUnaryOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_OPERATION, "<prefix unary operation>");
    r = consumeToken(b, INCR);
    if (!r) r = consumeToken(b, DECR);
    if (!r) r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, EXCL);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, DOUBLE_AT);
    if (!r) r = prefixUnaryOperation_7(b, l + 1);
    if (!r) r = labelDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation+
  private static boolean prefixUnaryOperation_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryOperation_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prefixUnaryOperation_7", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* (INIT NL*)? classParameters
  public static boolean primaryConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_CONSTRUCTOR, "<primary constructor>");
    r = primaryConstructor_0(b, l + 1);
    r = r && primaryConstructor_1(b, l + 1);
    r = r && primaryConstructor_2(b, l + 1);
    r = r && classParameters(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean primaryConstructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean primaryConstructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "primaryConstructor_1", c)) break;
    }
    return true;
  }

  // (INIT NL*)?
  private static boolean primaryConstructor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_2")) return false;
    primaryConstructor_2_0(b, l + 1);
    return true;
  }

  // INIT NL*
  private static boolean primaryConstructor_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INIT);
    r = r && primaryConstructor_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean primaryConstructor_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "primaryConstructor_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LCURLY NL* (getter (semi setter)? |  setter (semi getter)?)? NL* RCURLY
  public static boolean propertyBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && propertyBody_1(b, l + 1);
    r = r && propertyBody_2(b, l + 1);
    r = r && propertyBody_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, PROPERTY_BODY, r);
    return r;
  }

  // NL*
  private static boolean propertyBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "propertyBody_1", c)) break;
    }
    return true;
  }

  // (getter (semi setter)? |  setter (semi getter)?)?
  private static boolean propertyBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2")) return false;
    propertyBody_2_0(b, l + 1);
    return true;
  }

  // getter (semi setter)? |  setter (semi getter)?
  private static boolean propertyBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = propertyBody_2_0_0(b, l + 1);
    if (!r) r = propertyBody_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // getter (semi setter)?
  private static boolean propertyBody_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = getter(b, l + 1);
    r = r && propertyBody_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semi setter)?
  private static boolean propertyBody_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_0_1")) return false;
    propertyBody_2_0_0_1_0(b, l + 1);
    return true;
  }

  // semi setter
  private static boolean propertyBody_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semi(b, l + 1);
    r = r && setter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // setter (semi getter)?
  private static boolean propertyBody_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setter(b, l + 1);
    r = r && propertyBody_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semi getter)?
  private static boolean propertyBody_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_1_1")) return false;
    propertyBody_2_0_1_1_0(b, l + 1);
    return true;
  }

  // semi getter
  private static boolean propertyBody_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semi(b, l + 1);
    r = r && getter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean propertyBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBody_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "propertyBody_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // localPropertyDeclaration (NL* propertyBody)?
  public static boolean propertyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    r = localPropertyDeclaration(b, l + 1);
    r = r && propertyDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* propertyBody)?
  private static boolean propertyDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_1")) return false;
    propertyDeclaration_1_0(b, l + 1);
    return true;
  }

  // NL* propertyBody
  private static boolean propertyDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = propertyDeclaration_1_0_0(b, l + 1);
    r = r && propertyBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean propertyDeclaration_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "propertyDeclaration_1_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // additiveExpression (toOperator additiveExpression (byOperator additiveExpression)?)*
  public static boolean rangeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_EXPRESSION, "<range expression>");
    r = additiveExpression(b, l + 1);
    r = r && rangeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (toOperator additiveExpression (byOperator additiveExpression)?)*
  private static boolean rangeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rangeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeExpression_1", c)) break;
    }
    return true;
  }

  // toOperator additiveExpression (byOperator additiveExpression)?
  private static boolean rangeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = toOperator(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    r = r && rangeExpression_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (byOperator additiveExpression)?
  private static boolean rangeExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1_0_2")) return false;
    rangeExpression_1_0_2_0(b, l + 1);
    return true;
  }

  // byOperator additiveExpression
  private static boolean rangeExpression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = byOperator(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* INIT NL* functionValueParameters (NL* COLON NL* constructorDelegationCall)? NL* block?
  public static boolean secondaryConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_CONSTRUCTOR, "<secondary constructor>");
    r = secondaryConstructor_0(b, l + 1);
    r = r && secondaryConstructor_1(b, l + 1);
    r = r && consumeToken(b, INIT);
    r = r && secondaryConstructor_3(b, l + 1);
    r = r && functionValueParameters(b, l + 1);
    r = r && secondaryConstructor_5(b, l + 1);
    r = r && secondaryConstructor_6(b, l + 1);
    r = r && secondaryConstructor_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean secondaryConstructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean secondaryConstructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "secondaryConstructor_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean secondaryConstructor_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "secondaryConstructor_3", c)) break;
    }
    return true;
  }

  // (NL* COLON NL* constructorDelegationCall)?
  private static boolean secondaryConstructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_5")) return false;
    secondaryConstructor_5_0(b, l + 1);
    return true;
  }

  // NL* COLON NL* constructorDelegationCall
  private static boolean secondaryConstructor_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondaryConstructor_5_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && secondaryConstructor_5_0_2(b, l + 1);
    r = r && constructorDelegationCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean secondaryConstructor_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "secondaryConstructor_5_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean secondaryConstructor_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_5_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "secondaryConstructor_5_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean secondaryConstructor_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "secondaryConstructor_6", c)) break;
    }
    return true;
  }

  // block?
  private static boolean secondaryConstructor_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondaryConstructor_7")) return false;
    block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NL+ | NL* SEMICOLON NL*
  public static boolean semi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi")) return false;
    if (!nextTokenIs(b, "<semi>", NL, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMI, "<semi>");
    r = semi_0(b, l + 1);
    if (!r) r = semi_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL+
  private static boolean semi_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "semi_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NL* SEMICOLON NL*
  private static boolean semi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semi_1_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && semi_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean semi_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "semi_1_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean semi_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "semi_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* SETTER_ NL* (LPAREN (annotation+ | parameterModifier)* (simpleIdentifier | parameter) RPAREN NL* functionBody)?
  public static boolean setter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTER, "<setter>");
    r = setter_0(b, l + 1);
    r = r && setter_1(b, l + 1);
    r = r && consumeToken(b, SETTER_);
    r = r && setter_3(b, l + 1);
    r = r && setter_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean setter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean setter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "setter_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean setter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "setter_3", c)) break;
    }
    return true;
  }

  // (LPAREN (annotation+ | parameterModifier)* (simpleIdentifier | parameter) RPAREN NL* functionBody)?
  private static boolean setter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4")) return false;
    setter_4_0(b, l + 1);
    return true;
  }

  // LPAREN (annotation+ | parameterModifier)* (simpleIdentifier | parameter) RPAREN NL* functionBody
  private static boolean setter_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && setter_4_0_1(b, l + 1);
    r = r && setter_4_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && setter_4_0_4(b, l + 1);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (annotation+ | parameterModifier)*
  private static boolean setter_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!setter_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setter_4_0_1", c)) break;
    }
    return true;
  }

  // annotation+ | parameterModifier
  private static boolean setter_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = setter_4_0_1_0_0(b, l + 1);
    if (!r) r = parameterModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation+
  private static boolean setter_4_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setter_4_0_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // simpleIdentifier | parameter
  private static boolean setter_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0_2")) return false;
    boolean r;
    r = simpleIdentifier(b, l + 1);
    if (!r) r = parameter(b, l + 1);
    return r;
  }

  // NL*
  private static boolean setter_4_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_4_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "setter_4_0_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER_ | SETTER_ | GETTER_
  public static boolean simpleIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_IDENTIFIER, "<simple identifier>");
    r = consumeToken(b, IDENTIFIER_);
    if (!r) r = consumeToken(b, SETTER_);
    if (!r) r = consumeToken(b, GETTER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* typeArguments)*
  public static boolean simpleUserType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleUserType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_USER_TYPE, "<simple user type>");
    r = simpleIdentifier(b, l + 1);
    r = r && simpleUserType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* typeArguments)*
  private static boolean simpleUserType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleUserType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simpleUserType_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleUserType_1", c)) break;
    }
    return true;
  }

  // NL* typeArguments
  private static boolean simpleUserType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleUserType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleUserType_1_0_0(b, l + 1);
    r = r && typeArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean simpleUserType_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleUserType_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "simpleUserType_1_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation* NL* expression | localPropertyDeclaration
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = localPropertyDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation* NL* expression
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0(b, l + 1);
    r = r && statement_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation*
  private static boolean statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "statement_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NL* (statement (NL+ statement?)*)?
  public static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    r = statements_0(b, l + 1);
    r = r && statements_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "statements_0", c)) break;
    }
    return true;
  }

  // (statement (NL+ statement?)*)?
  private static boolean statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1")) return false;
    statements_1_0(b, l + 1);
    return true;
  }

  // statement (NL+ statement?)*
  private static boolean statements_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && statements_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL+ statement?)*
  private static boolean statements_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_1_0_1", c)) break;
    }
    return true;
  }

  // NL+ statement?
  private static boolean statements_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statements_1_0_1_0_0(b, l + 1);
    r = r && statements_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL+
  private static boolean statements_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "statements_1_0_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean statements_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1_0_1")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* STRUCT NL* simpleIdentifier (NL* LARROW NL* delegationSpecifiers)? (NL* classBody)?
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = structDeclaration_0(b, l + 1);
    r = r && structDeclaration_1(b, l + 1);
    r = r && consumeToken(b, STRUCT);
    r = r && structDeclaration_3(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && structDeclaration_5(b, l + 1);
    r = r && structDeclaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean structDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean structDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean structDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_3", c)) break;
    }
    return true;
  }

  // (NL* LARROW NL* delegationSpecifiers)?
  private static boolean structDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_5")) return false;
    structDeclaration_5_0(b, l + 1);
    return true;
  }

  // NL* LARROW NL* delegationSpecifiers
  private static boolean structDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structDeclaration_5_0_0(b, l + 1);
    r = r && consumeToken(b, LARROW);
    r = r && structDeclaration_5_0_2(b, l + 1);
    r = r && delegationSpecifiers(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean structDeclaration_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_5_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean structDeclaration_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_5_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_5_0_2", c)) break;
    }
    return true;
  }

  // (NL* classBody)?
  private static boolean structDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_6")) return false;
    structDeclaration_6_0(b, l + 1);
    return true;
  }

  // NL* classBody
  private static boolean structDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structDeclaration_6_0_0(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean structDeclaration_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_6_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_6_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SUPER (LANGLE NL* type NL* RANGLE)? labelReference?
  public static boolean superExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression")) return false;
    if (!nextTokenIs(b, SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPER);
    r = r && superExpression_1(b, l + 1);
    r = r && superExpression_2(b, l + 1);
    exit_section_(b, m, SUPER_EXPRESSION, r);
    return r;
  }

  // (LANGLE NL* type NL* RANGLE)?
  private static boolean superExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1")) return false;
    superExpression_1_0(b, l + 1);
    return true;
  }

  // LANGLE NL* type NL* RANGLE
  private static boolean superExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGLE);
    r = r && superExpression_1_0_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && superExpression_1_0_3(b, l + 1);
    r = r && consumeToken(b, RANGLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean superExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "superExpression_1_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean superExpression_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "superExpression_1_0_3", c)) break;
    }
    return true;
  }

  // labelReference?
  private static boolean superExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_2")) return false;
    labelReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // THIS labelReference?
  public static boolean thisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "thisExpression")) return false;
    if (!nextTokenIs(b, THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIS);
    r = r && thisExpression_1(b, l + 1);
    exit_section_(b, m, THIS_EXPRESSION, r);
    return r;
  }

  // labelReference?
  private static boolean thisExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "thisExpression_1")) return false;
    labelReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_PERIOD | TO
  public static boolean toOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "toOperator")) return false;
    if (!nextTokenIs(b, "<to operator>", DOUBLE_PERIOD, TO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TO_OPERATOR, "<to operator>");
    r = consumeToken(b, DOUBLE_PERIOD);
    if (!r) r = consumeToken(b, TO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // classDeclaration | structDeclaration | enumDeclaration | functionDeclaration | propertyDeclaration | typeDeclaration
  public static boolean topLevelObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topLevelObject")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_OBJECT, "<top level object>");
    r = classDeclaration(b, l + 1);
    if (!r) r = structDeclaration(b, l + 1);
    if (!r) r = enumDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = propertyDeclaration(b, l + 1);
    if (!r) r = typeDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRUE | FALSE | NONE
  public static boolean trileanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trileanLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRILEAN_LITERAL, "<trilean literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NONE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRY NL* block (NL* handleBlock)* (NL* finallyBlock)?
  public static boolean tryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY);
    r = r && tryExpression_1(b, l + 1);
    r = r && block(b, l + 1);
    r = r && tryExpression_3(b, l + 1);
    r = r && tryExpression_4(b, l + 1);
    exit_section_(b, m, TRY_EXPRESSION, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_1", c)) break;
    }
    return true;
  }

  // (NL* handleBlock)*
  private static boolean tryExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tryExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3", c)) break;
    }
    return true;
  }

  // NL* handleBlock
  private static boolean tryExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0_0(b, l + 1);
    r = r && handleBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3_0_0", c)) break;
    }
    return true;
  }

  // (NL* finallyBlock)?
  private static boolean tryExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_4")) return false;
    tryExpression_4_0(b, l + 1);
    return true;
  }

  // NL* finallyBlock
  private static boolean tryExpression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_4_0_0(b, l + 1);
    r = r && finallyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_4_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation* NL* (functionType | parenthesizedType | nullableType | typeReference)
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type_0(b, l + 1);
    r = r && type_1(b, l + 1);
    r = r && type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "type_1", c)) break;
    }
    return true;
  }

  // functionType | parenthesizedType | nullableType | typeReference
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    boolean r;
    r = functionType(b, l + 1);
    if (!r) r = parenthesizedType(b, l + 1);
    if (!r) r = nullableType(b, l + 1);
    if (!r) r = typeReference(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LANGLE NL* typeProjection (NL* COMMA NL* typeProjection)* NL* RANGLE
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, LANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGLE);
    r = r && typeArguments_1(b, l + 1);
    r = r && typeProjection(b, l + 1);
    r = r && typeArguments_3(b, l + 1);
    r = r && typeArguments_4(b, l + 1);
    r = r && consumeToken(b, RANGLE);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  // NL*
  private static boolean typeArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_1", c)) break;
    }
    return true;
  }

  // (NL* COMMA NL* typeProjection)*
  private static boolean typeArguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeArguments_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_3", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* typeProjection
  private static boolean typeArguments_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeArguments_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && typeArguments_3_0_2(b, l + 1);
    r = r && typeProjection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeArguments_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeArguments_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_3_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeArguments_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifierList? NL* TYPE_ NL* simpleIdentifier (NL* typeParameters)? NL* ASSIGN NL* type
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = typeDeclaration_0(b, l + 1);
    r = r && typeDeclaration_1(b, l + 1);
    r = r && consumeToken(b, TYPE_);
    r = r && typeDeclaration_3(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && typeDeclaration_5(b, l + 1);
    r = r && typeDeclaration_6(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && typeDeclaration_8(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean typeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean typeDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_3", c)) break;
    }
    return true;
  }

  // (NL* typeParameters)?
  private static boolean typeDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_5")) return false;
    typeDeclaration_5_0(b, l + 1);
    return true;
  }

  // NL* typeParameters
  private static boolean typeDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDeclaration_5_0_0(b, l + 1);
    r = r && typeParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeDeclaration_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_5_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_6", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // prefixUnaryExpression (typeOperator type)*
  public static boolean typeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION, "<type expression>");
    r = prefixUnaryExpression(b, l + 1);
    r = r && typeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (typeOperator type)*
  private static boolean typeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeExpression_1", c)) break;
    }
    return true;
  }

  // typeOperator type
  private static boolean typeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeOperator(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AS
  public static boolean typeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeOperator")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    exit_section_(b, m, TYPE_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // modifierList? NL* simpleIdentifier (NL* COLON NL* type (NL* CONJ NL* type)*)?
  public static boolean typeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PARAMETER, "<type parameter>");
    r = typeParameter_0(b, l + 1);
    r = r && typeParameter_1(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && typeParameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifierList?
  private static boolean typeParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_0")) return false;
    modifierList(b, l + 1);
    return true;
  }

  // NL*
  private static boolean typeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_1", c)) break;
    }
    return true;
  }

  // (NL* COLON NL* type (NL* CONJ NL* type)*)?
  private static boolean typeParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3")) return false;
    typeParameter_3_0(b, l + 1);
    return true;
  }

  // NL* COLON NL* type (NL* CONJ NL* type)*
  private static boolean typeParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameter_3_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && typeParameter_3_0_2(b, l + 1);
    r = r && type(b, l + 1);
    r = r && typeParameter_3_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeParameter_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeParameter_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_3_0_2", c)) break;
    }
    return true;
  }

  // (NL* CONJ NL* type)*
  private static boolean typeParameter_3_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeParameter_3_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_3_0_4", c)) break;
    }
    return true;
  }

  // NL* CONJ NL* type
  private static boolean typeParameter_3_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameter_3_0_4_0_0(b, l + 1);
    r = r && consumeToken(b, CONJ);
    r = r && typeParameter_3_0_4_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeParameter_3_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_3_0_4_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeParameter_3_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_3_0_4_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameter_3_0_4_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LANGLE NL* typeParameter (NL* COMMA NL* typeParameter)* NL* RANGLE
  public static boolean typeParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters")) return false;
    if (!nextTokenIs(b, LANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LANGLE);
    r = r && typeParameters_1(b, l + 1);
    r = r && typeParameter(b, l + 1);
    r = r && typeParameters_3(b, l + 1);
    r = r && typeParameters_4(b, l + 1);
    r = r && consumeToken(b, RANGLE);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // NL*
  private static boolean typeParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_1", c)) break;
    }
    return true;
  }

  // (NL* COMMA NL* typeParameter)*
  private static boolean typeParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeParameters_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_3", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* typeParameter
  private static boolean typeParameters_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters_3_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && typeParameters_3_0_2(b, l + 1);
    r = r && typeParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeParameters_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_3_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeParameters_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_3_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeParameters_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type | TRIPLE_PERIOD
  public static boolean typeProjection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeProjection")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PROJECTION, "<type projection>");
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, TRIPLE_PERIOD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN NL* typeReference NL* RPAREN | userType
  public static boolean typeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_REFERENCE, "<type reference>");
    r = typeReference_0(b, l + 1);
    if (!r) r = userType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN NL* typeReference NL* RPAREN
  private static boolean typeReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && typeReference_0_1(b, l + 1);
    r = r && typeReference(b, l + 1);
    r = r && typeReference_0_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean typeReference_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeReference_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean typeReference_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeReference_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "typeReference_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier typeArguments? valueArguments?
  public static boolean unescapedAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedAnnotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNESCAPED_ANNOTATION, "<unescaped annotation>");
    r = identifier(b, l + 1);
    r = r && unescapedAnnotation_1(b, l + 1);
    r = r && unescapedAnnotation_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeArguments?
  private static boolean unescapedAnnotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedAnnotation_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // valueArguments?
  private static boolean unescapedAnnotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedAnnotation_2")) return false;
    valueArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simpleUserType (NL* PERIOD NL* simpleUserType)*
  public static boolean userType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USER_TYPE, "<user type>");
    r = simpleUserType(b, l + 1);
    r = r && userType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* PERIOD NL* simpleUserType)*
  private static boolean userType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!userType_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "userType_1", c)) break;
    }
    return true;
  }

  // NL* PERIOD NL* simpleUserType
  private static boolean userType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = userType_1_0_0(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && userType_1_0_2(b, l + 1);
    r = r && simpleUserType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean userType_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "userType_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean userType_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "userType_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (simpleIdentifier NL* ASSIGN)? NL* expression
  public static boolean valueArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ARGUMENT, "<value argument>");
    r = valueArgument_0(b, l + 1);
    r = r && valueArgument_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simpleIdentifier NL* ASSIGN)?
  private static boolean valueArgument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0")) return false;
    valueArgument_0_0(b, l + 1);
    return true;
  }

  // simpleIdentifier NL* ASSIGN
  private static boolean valueArgument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleIdentifier(b, l + 1);
    r = r && valueArgument_0_0_1(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean valueArgument_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArgument_0_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArgument_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* (valueArgument ( NL* COMMA NL* valueArgument)*)? NL* RPAREN
  public static boolean valueArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && valueArguments_1(b, l + 1);
    r = r && valueArguments_2(b, l + 1);
    r = r && valueArguments_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, VALUE_ARGUMENTS, r);
    return r;
  }

  // NL*
  private static boolean valueArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_1", c)) break;
    }
    return true;
  }

  // (valueArgument ( NL* COMMA NL* valueArgument)*)?
  private static boolean valueArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2")) return false;
    valueArguments_2_0(b, l + 1);
    return true;
  }

  // valueArgument ( NL* COMMA NL* valueArgument)*
  private static boolean valueArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueArgument(b, l + 1);
    r = r && valueArguments_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NL* COMMA NL* valueArgument)*
  private static boolean valueArguments_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueArguments_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* valueArgument
  private static boolean valueArguments_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueArguments_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && valueArguments_2_0_1_0_2(b, l + 1);
    r = r && valueArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean valueArguments_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArguments_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* COLON NL* type)?
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = simpleIdentifier(b, l + 1);
    r = r && variableDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* COLON NL* type)?
  private static boolean variableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1")) return false;
    variableDeclaration_1_0(b, l + 1);
    return true;
  }

  // NL* COLON NL* type
  private static boolean variableDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclaration_1_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && variableDeclaration_1_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean variableDeclaration_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaration_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean variableDeclaration_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaration_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PUBLIC | LOCAL | BOUNDED | PRIV
  public static boolean visibilityModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibilityModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY_MODIFIER, "<visibility modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, LOCAL);
    if (!r) r = consumeToken(b, BOUNDED);
    if (!r) r = consumeToken(b, PRIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHILE NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody
  public static boolean whileExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpression")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && whileExpression_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && whileExpression_3(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && whileExpression_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && whileExpression_7(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    exit_section_(b, m, WHILE_EXPRESSION, r);
    return r;
  }

  // NL*
  private static boolean whileExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "whileExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whileExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "whileExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whileExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "whileExpression_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whileExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NL)) break;
      if (!empty_element_parsed_guard_(b, "whileExpression_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeExpression (xorOperator typeExpression)*
  public static boolean xorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XOR_EXPRESSION, "<xor expression>");
    r = typeExpression(b, l + 1);
    r = r && xorExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (xorOperator typeExpression)*
  private static boolean xorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xorExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xorExpression_1", c)) break;
    }
    return true;
  }

  // xorOperator typeExpression
  private static boolean xorExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xorOperator(b, l + 1);
    r = r && typeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XOR
  public static boolean xorOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorOperator")) return false;
    if (!nextTokenIs(b, XOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    exit_section_(b, m, XOR_OPERATOR, r);
    return r;
  }

}
