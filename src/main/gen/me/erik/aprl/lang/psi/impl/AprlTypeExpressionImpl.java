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

public class AprlTypeExpressionImpl extends ASTWrapperPsiElement implements AprlTypeExpression {

  public AprlTypeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitTypeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AprlPrefixUnaryExpression getPrefixUnaryExpression() {
    return findNotNullChildByClass(AprlPrefixUnaryExpression.class);
  }

  @Override
  @NotNull
  public List<AprlType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlType.class);
  }

  @Override
  @NotNull
  public List<AprlTypeOperator> getTypeOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlTypeOperator.class);
  }

}
