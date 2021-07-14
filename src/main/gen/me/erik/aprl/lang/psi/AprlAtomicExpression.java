// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlAtomicExpression extends PsiElement {

  @Nullable
  AprlCollectionLiteral getCollectionLiteral();

  @Nullable
  AprlConditionalExpression getConditionalExpression();

  @Nullable
  AprlFunctionLiteral getFunctionLiteral();

  @Nullable
  AprlJumpExpression getJumpExpression();

  @Nullable
  AprlLiteralConstant getLiteralConstant();

  @Nullable
  AprlLoopExpression getLoopExpression();

  @Nullable
  AprlParenthesizedExpression getParenthesizedExpression();

  @Nullable
  AprlSimpleIdentifier getSimpleIdentifier();

  @Nullable
  AprlSuperExpression getSuperExpression();

  @Nullable
  AprlThisExpression getThisExpression();

  @Nullable
  AprlTryExpression getTryExpression();

  @Nullable
  AprlUserType getUserType();

}
