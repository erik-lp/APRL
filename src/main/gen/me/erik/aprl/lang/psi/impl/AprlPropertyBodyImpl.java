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

public class AprlPropertyBodyImpl extends ASTWrapperPsiElement implements AprlPropertyBody {

  public AprlPropertyBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitPropertyBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlGetter getGetter() {
    return findChildByClass(AprlGetter.class);
  }

  @Override
  @Nullable
  public AprlSemi getSemi() {
    return findChildByClass(AprlSemi.class);
  }

  @Override
  @Nullable
  public AprlSetter getSetter() {
    return findChildByClass(AprlSetter.class);
  }

}
