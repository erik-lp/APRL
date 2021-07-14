// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlInfixFunctionCall extends PsiElement {

  @NotNull
  List<AprlRangeExpression> getRangeExpressionList();

  @NotNull
  List<AprlSimpleIdentifier> getSimpleIdentifierList();

}
