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

public class AprlUnescapedAnnotationImpl extends ASTWrapperPsiElement implements AprlUnescapedAnnotation {

  public AprlUnescapedAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitUnescapedAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AprlIdentifier getIdentifier() {
    return findNotNullChildByClass(AprlIdentifier.class);
  }

  @Override
  @Nullable
  public AprlTypeArguments getTypeArguments() {
    return findChildByClass(AprlTypeArguments.class);
  }

  @Override
  @Nullable
  public AprlValueArguments getValueArguments() {
    return findChildByClass(AprlValueArguments.class);
  }

}
