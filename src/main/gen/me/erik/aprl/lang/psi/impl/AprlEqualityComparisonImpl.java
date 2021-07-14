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

public class AprlEqualityComparisonImpl extends ASTWrapperPsiElement implements AprlEqualityComparison {

  public AprlEqualityComparisonImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitEqualityComparison(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlEqualityOperator> getEqualityOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlEqualityOperator.class);
  }

  @Override
  @NotNull
  public List<AprlIdentityComparison> getIdentityComparisonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlIdentityComparison.class);
  }

}
