// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlXorExpression extends PsiElement {

  @NotNull
  List<AprlTypeExpression> getTypeExpressionList();

  @NotNull
  List<AprlXorOperator> getXorOperatorList();

}
