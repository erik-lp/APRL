// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlTopLevelObject extends PsiElement {

  @Nullable
  AprlClassDeclaration getClassDeclaration();

  @Nullable
  AprlEnumDeclaration getEnumDeclaration();

  @Nullable
  AprlFunctionDeclaration getFunctionDeclaration();

  @Nullable
  AprlPropertyDeclaration getPropertyDeclaration();

  @Nullable
  AprlStructDeclaration getStructDeclaration();

  @Nullable
  AprlTypeDeclaration getTypeDeclaration();

}
