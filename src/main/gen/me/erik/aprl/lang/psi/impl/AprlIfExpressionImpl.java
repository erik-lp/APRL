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

public class AprlIfExpressionImpl extends ASTWrapperPsiElement implements AprlIfExpression {

  public AprlIfExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitIfExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlControlStructureBody> getControlStructureBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlControlStructureBody.class);
  }

  @Override
  @NotNull
  public List<AprlExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlExpression.class);
  }

}
