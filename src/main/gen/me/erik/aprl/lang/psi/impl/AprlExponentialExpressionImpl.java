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

public class AprlExponentialExpressionImpl extends ASTWrapperPsiElement implements AprlExponentialExpression {

  public AprlExponentialExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitExponentialExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlExponentialOperator> getExponentialOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlExponentialOperator.class);
  }

  @Override
  @NotNull
  public List<AprlXorExpression> getXorExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlXorExpression.class);
  }

}
