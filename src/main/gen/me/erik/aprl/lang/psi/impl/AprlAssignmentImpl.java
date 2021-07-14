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

public class AprlAssignmentImpl extends ASTWrapperPsiElement implements AprlAssignment {

  public AprlAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AprlArrayAccess> getArrayAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AprlArrayAccess.class);
  }

  @Override
  @Nullable
  public AprlAssignmentOperator getAssignmentOperator() {
    return findChildByClass(AprlAssignmentOperator.class);
  }

  @Override
  @NotNull
  public AprlDisjunction getDisjunction() {
    return findNotNullChildByClass(AprlDisjunction.class);
  }

  @Override
  @Nullable
  public AprlIdentifier getIdentifier() {
    return findChildByClass(AprlIdentifier.class);
  }

}
