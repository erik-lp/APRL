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

public class AprlTypeImpl extends ASTWrapperPsiElement implements AprlType {

  public AprlTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitType(this);
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
  public AprlFunctionType getFunctionType() {
    return findChildByClass(AprlFunctionType.class);
  }

  @Override
  @Nullable
  public AprlNullableType getNullableType() {
    return findChildByClass(AprlNullableType.class);
  }

  @Override
  @Nullable
  public AprlParenthesizedType getParenthesizedType() {
    return findChildByClass(AprlParenthesizedType.class);
  }

  @Override
  @Nullable
  public AprlTypeReference getTypeReference() {
    return findChildByClass(AprlTypeReference.class);
  }

}
