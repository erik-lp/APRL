// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlModifier extends PsiElement {

  @Nullable
  AprlFunctionModifier getFunctionModifier();

  @Nullable
  AprlInheritanceModifier getInheritanceModifier();

  @Nullable
  AprlParameterModifier getParameterModifier();

  @Nullable
  AprlVisibilityModifier getVisibilityModifier();

}
