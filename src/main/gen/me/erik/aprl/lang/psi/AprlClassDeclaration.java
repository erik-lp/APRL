// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlClassDeclaration extends PsiElement {

  @Nullable
  AprlClassBody getClassBody();

  @Nullable
  AprlDelegationSpecifiers getDelegationSpecifiers();

  @Nullable
  AprlModifierList getModifierList();

  @Nullable
  AprlPrimaryConstructor getPrimaryConstructor();

  @NotNull
  AprlSimpleIdentifier getSimpleIdentifier();

  @Nullable
  AprlTypeParameters getTypeParameters();

}
