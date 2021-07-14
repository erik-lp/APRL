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

public class AprlHandleBlockImpl extends ASTWrapperPsiElement implements AprlHandleBlock {

  public AprlHandleBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitHandleBlock(this);
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
  @NotNull
  public AprlBlock getBlock() {
    return findNotNullChildByClass(AprlBlock.class);
  }

  @Override
  @NotNull
  public AprlSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(AprlSimpleIdentifier.class);
  }

  @Override
  @NotNull
  public List<AprlUserType> getUserTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlUserType.class);
  }

}
