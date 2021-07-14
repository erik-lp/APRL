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

public class AprlDisjunctionImpl extends ASTWrapperPsiElement implements AprlDisjunction {

  public AprlDisjunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitDisjunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlConjunction> getConjunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlConjunction.class);
  }

  @Override
  @NotNull
  public List<AprlDisjunctionOperator> getDisjunctionOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlDisjunctionOperator.class);
  }

}
