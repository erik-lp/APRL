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

public class AprlFunctionValueParameterImpl extends ASTWrapperPsiElement implements AprlFunctionValueParameter {

  public AprlFunctionValueParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitFunctionValueParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlExpression getExpression() {
    return findChildByClass(AprlExpression.class);
  }

  @Override
  @Nullable
  public AprlModifierList getModifierList() {
    return findChildByClass(AprlModifierList.class);
  }

  @Override
  @NotNull
  public AprlParameter getParameter() {
    return findNotNullChildByClass(AprlParameter.class);
  }

}
