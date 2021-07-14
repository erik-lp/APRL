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

public class AprlPostfixUnaryOperationImpl extends ASTWrapperPsiElement implements AprlPostfixUnaryOperation {

  public AprlPostfixUnaryOperationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitPostfixUnaryOperation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlArrayAccess getArrayAccess() {
    return findChildByClass(AprlArrayAccess.class);
  }

  @Override
  @Nullable
  public AprlCallSuffix getCallSuffix() {
    return findChildByClass(AprlCallSuffix.class);
  }

  @Override
  @Nullable
  public AprlMemberAccessOperator getMemberAccessOperator() {
    return findChildByClass(AprlMemberAccessOperator.class);
  }

  @Override
  @Nullable
  public AprlPostfixUnaryExpression getPostfixUnaryExpression() {
    return findChildByClass(AprlPostfixUnaryExpression.class);
  }

}
