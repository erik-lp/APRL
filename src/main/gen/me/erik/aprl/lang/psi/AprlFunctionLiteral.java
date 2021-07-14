// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlFunctionLiteral extends PsiElement {

  @NotNull
  List<AprlAnnotation> getAnnotationList();

  @Nullable
  AprlLambdaParameters getLambdaParameters();

  @Nullable
  AprlStatement getStatement();

  @Nullable
  AprlStatements getStatements();

}
