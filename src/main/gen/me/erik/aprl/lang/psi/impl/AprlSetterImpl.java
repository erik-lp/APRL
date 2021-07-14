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

public class AprlSetterImpl extends ASTWrapperPsiElement implements AprlSetter {

  public AprlSetterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitSetter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlAnnotation.class);
  }

  @Override
  @Nullable
  public AprlFunctionBody getFunctionBody() {
    return findChildByClass(AprlFunctionBody.class);
  }

  @Override
  @Nullable
  public AprlModifierList getModifierList() {
    return findChildByClass(AprlModifierList.class);
  }

  @Override
  @Nullable
  public AprlParameter getParameter() {
    return findChildByClass(AprlParameter.class);
  }

  @Override
  @NotNull
  public List<AprlParameterModifier> getParameterModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlParameterModifier.class);
  }

  @Override
  @Nullable
  public AprlSimpleIdentifier getSimpleIdentifier() {
    return findChildByClass(AprlSimpleIdentifier.class);
  }

}
