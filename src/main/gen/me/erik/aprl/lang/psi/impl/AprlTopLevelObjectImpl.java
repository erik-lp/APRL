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

public class AprlTopLevelObjectImpl extends ASTWrapperPsiElement implements AprlTopLevelObject {

  public AprlTopLevelObjectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitTopLevelObject(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlClassDeclaration getClassDeclaration() {
    return findChildByClass(AprlClassDeclaration.class);
  }

  @Override
  @Nullable
  public AprlEnumDeclaration getEnumDeclaration() {
    return findChildByClass(AprlEnumDeclaration.class);
  }

  @Override
  @Nullable
  public AprlFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(AprlFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public AprlPropertyDeclaration getPropertyDeclaration() {
    return findChildByClass(AprlPropertyDeclaration.class);
  }

  @Override
  @Nullable
  public AprlStructDeclaration getStructDeclaration() {
    return findChildByClass(AprlStructDeclaration.class);
  }

  @Override
  @Nullable
  public AprlTypeDeclaration getTypeDeclaration() {
    return findChildByClass(AprlTypeDeclaration.class);
  }

}
