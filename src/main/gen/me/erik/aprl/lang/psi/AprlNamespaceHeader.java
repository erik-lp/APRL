// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlNamespaceHeader extends PsiElement {

  @NotNull
  AprlIdentifier getIdentifier();

  @Nullable
  AprlModifierList getModifierList();

  @Nullable
  AprlSemi getSemi();

}
