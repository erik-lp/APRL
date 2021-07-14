// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlRangeExpression extends PsiElement {

  @NotNull
  List<AprlAdditiveExpression> getAdditiveExpressionList();

  @NotNull
  List<AprlByOperator> getByOperatorList();

  @NotNull
  List<AprlToOperator> getToOperatorList();

}
