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

public class AprlLoopExpressionImpl extends ASTWrapperPsiElement implements AprlLoopExpression {

  public AprlLoopExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitLoopExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlDoWhileExpression getDoWhileExpression() {
    return findChildByClass(AprlDoWhileExpression.class);
  }

  @Override
  @Nullable
  public AprlForExpression getForExpression() {
    return findChildByClass(AprlForExpression.class);
  }

  @Override
  @Nullable
  public AprlWhileExpression getWhileExpression() {
    return findChildByClass(AprlWhileExpression.class);
  }

}
