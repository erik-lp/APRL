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

public class AprlClassMemberImpl extends ASTWrapperPsiElement implements AprlClassMember {

  public AprlClassMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AprlVisitor visitor) {
    visitor.visitClassMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AprlVisitor) accept((AprlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AprlInitializerBody getInitializerBody() {
    return findChildByClass(AprlInitializerBody.class);
  }

  @Override
  @Nullable
  public AprlLoadScript getLoadScript() {
    return findChildByClass(AprlLoadScript.class);
  }

  @Override
  @Nullable
  public AprlPartnerDeclaration getPartnerDeclaration() {
    return findChildByClass(AprlPartnerDeclaration.class);
  }

  @Override
  @Nullable
  public AprlSecondaryConstructor getSecondaryConstructor() {
    return findChildByClass(AprlSecondaryConstructor.class);
  }

  @Override
  @Nullable
  public AprlTopLevelObject getTopLevelObject() {
    return findChildByClass(AprlTopLevelObject.class);
  }

}
