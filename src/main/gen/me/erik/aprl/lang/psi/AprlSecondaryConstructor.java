// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlSecondaryConstructor extends PsiElement {

  @Nullable
  AprlBlock getBlock();

  @Nullable
  AprlConstructorDelegationCall getConstructorDelegationCall();

  @NotNull
  AprlFunctionValueParameters getFunctionValueParameters();

  @Nullable
  AprlModifierList getModifierList();

}
