// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlDisjunction extends PsiElement {

  @NotNull
  List<AprlConjunction> getConjunctionList();

  @NotNull
  List<AprlDisjunctionOperator> getDisjunctionOperatorList();

}
