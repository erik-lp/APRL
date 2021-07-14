// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlSetter extends PsiElement {

  @NotNull
  List<AprlAnnotation> getAnnotationList();

  @Nullable
  AprlFunctionBody getFunctionBody();

  @Nullable
  AprlModifierList getModifierList();

  @Nullable
  AprlParameter getParameter();

  @NotNull
  List<AprlParameterModifier> getParameterModifierList();

  @Nullable
  AprlSimpleIdentifier getSimpleIdentifier();

}
