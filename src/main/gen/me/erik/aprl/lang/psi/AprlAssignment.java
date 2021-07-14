// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlAssignment extends PsiElement {

  @NotNull
  List<AprlArrayAccess> getArrayAccessList();

  @Nullable
  AprlAssignmentOperator getAssignmentOperator();

  @NotNull
  AprlDisjunction getDisjunction();

  @Nullable
  AprlIdentifier getIdentifier();

}
