// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlHandleBlock extends PsiElement {

  @NotNull
  List<AprlAnnotation> getAnnotationList();

  @NotNull
  AprlBlock getBlock();

  @NotNull
  AprlSimpleIdentifier getSimpleIdentifier();

  @NotNull
  List<AprlUserType> getUserTypeList();

}
