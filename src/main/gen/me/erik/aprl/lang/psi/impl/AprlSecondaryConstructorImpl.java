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

public class AprlSecondaryConstructorImpl extends ASTWrapperPsiElement implements AprlSecondaryConstructor {

  public AprlSecondaryConstructorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitSecondaryConstructor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlBlock getBlock() {
    return findChildByClass(AprlBlock.class);
  }

  @Override
  @Nullable
  public AprlConstructorDelegationCall getConstructorDelegationCall() {
    return findChildByClass(AprlConstructorDelegationCall.class);
  }

  @Override
  @NotNull
  public AprlFunctionValueParameters getFunctionValueParameters() {
    return findNotNullChildByClass(AprlFunctionValueParameters.class);
  }

  @Override
  @Nullable
  public AprlModifierList getModifierList() {
    return findChildByClass(AprlModifierList.class);
  }

}
