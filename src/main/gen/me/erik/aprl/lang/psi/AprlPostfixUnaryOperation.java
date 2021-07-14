// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlPostfixUnaryOperation extends PsiElement {

  @Nullable
  AprlArrayAccess getArrayAccess();

  @Nullable
  AprlCallSuffix getCallSuffix();

  @Nullable
  AprlMemberAccessOperator getMemberAccessOperator();

  @Nullable
  AprlPostfixUnaryExpression getPostfixUnaryExpression();

}
