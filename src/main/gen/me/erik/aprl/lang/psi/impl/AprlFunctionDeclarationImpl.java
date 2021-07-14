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

public class AprlFunctionDeclarationImpl extends ASTWrapperPsiElement implements AprlFunctionDeclaration {

  public AprlFunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlFunctionBody getFunctionBody() {
    return findChildByClass(AprlFunctionBody.class);
  }

  @Override
  @NotNull
  public AprlFunctionValueParameters getFunctionValueParameters() {
    return findNotNullChildByClass(AprlFunctionValueParameters.class);
  }

  @Override
  @Nullable
  public AprlIdentifier getIdentifier() {
    return findChildByClass(AprlIdentifier.class);
  }

  @Override
  @Nullable
  public AprlModifierList getModifierList() {
    return findChildByClass(AprlModifierList.class);
  }

  @Override
  @Nullable
  public AprlType getType() {
    return findChildByClass(AprlType.class);
  }

  @Override
  @Nullable
  public AprlTypeParameters getTypeParameters() {
    return findChildByClass(AprlTypeParameters.class);
  }

}
