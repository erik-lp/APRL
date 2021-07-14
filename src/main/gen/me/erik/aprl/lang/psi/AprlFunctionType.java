// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlFunctionType extends PsiElement {

  @NotNull
  AprlFunctionTypeParameters getFunctionTypeParameters();

  @Nullable
  AprlFunctionTypeReceiver getFunctionTypeReceiver();

  @NotNull
  AprlType getType();

}
