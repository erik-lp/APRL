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

public class AprlModifierImpl extends ASTWrapperPsiElement implements AprlModifier {

  public AprlModifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitModifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlFunctionModifier getFunctionModifier() {
    return findChildByClass(AprlFunctionModifier.class);
  }

  @Override
  @Nullable
  public AprlInheritanceModifier getInheritanceModifier() {
    return findChildByClass(AprlInheritanceModifier.class);
  }

  @Override
  @Nullable
  public AprlParameterModifier getParameterModifier() {
    return findChildByClass(AprlParameterModifier.class);
  }

  @Override
  @Nullable
  public AprlVisibilityModifier getVisibilityModifier() {
    return findChildByClass(AprlVisibilityModifier.class);
  }

}
