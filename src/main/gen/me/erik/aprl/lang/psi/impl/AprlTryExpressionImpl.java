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

public class AprlTryExpressionImpl extends ASTWrapperPsiElement implements AprlTryExpression {

  public AprlTryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitTryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AprlBlock getBlock() {
    return findNotNullChildByClass(AprlBlock.class);
  }

  @Override
  @Nullable
  public AprlFinallyBlock getFinallyBlock() {
    return findChildByClass(AprlFinallyBlock.class);
  }

  @Override
  @NotNull
  public List<AprlHandleBlock> getHandleBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlHandleBlock.class);
  }

}
