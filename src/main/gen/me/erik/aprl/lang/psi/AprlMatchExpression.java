// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlMatchExpression extends PsiElement {

  @NotNull
  AprlExpression getExpression();

  @NotNull
  List<AprlMatchEntry> getMatchEntryList();

}
