// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.erik.aprl.lang.psi.AprlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.erik.aprl.lang.psi.*;

public class AprlAtomicExpressionImpl extends ASTWrapperPsiElement implements AprlAtomicExpression {

  public AprlAtomicExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitAtomicExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlCollectionLiteral getCollectionLiteral() {
    return findChildByClass(AprlCollectionLiteral.class);
  }

  @Override
  @Nullable
  public AprlConditionalExpression getConditionalExpression() {
    return findChildByClass(AprlConditionalExpression.class);
  }

  @Override
  @Nullable
  public AprlFunctionLiteral getFunctionLiteral() {
    return findChildByClass(AprlFunctionLiteral.class);
  }

  @Override
  @Nullable
  public AprlJumpExpression getJumpExpression() {
    return findChildByClass(AprlJumpExpression.class);
  }

  @Override
  @Nullable
  public AprlLiteralConstant getLiteralConstant() {
    return findChildByClass(AprlLiteralConstant.class);
  }

  @Override
  @Nullable
  public AprlLoopExpression getLoopExpression() {
    return findChildByClass(AprlLoopExpression.class);
  }

  @Override
  @Nullable
  public AprlParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(AprlParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public AprlSimpleIdentifier getSimpleIdentifier() {
    return findChildByClass(AprlSimpleIdentifier.class);
  }

  @Override
  @Nullable
  public AprlSuperExpression getSuperExpression() {
    return findChildByClass(AprlSuperExpression.class);
  }

  @Override
  @Nullable
  public AprlThisExpression getThisExpression() {
    return findChildByClass(AprlThisExpression.class);
  }

  @Override
  @Nullable
  public AprlTryExpression getTryExpression() {
    return findChildByClass(AprlTryExpression.class);
  }

  @Override
  @Nullable
  public AprlUserType getUserType() {
    return findChildByClass(AprlUserType.class);
  }

}
