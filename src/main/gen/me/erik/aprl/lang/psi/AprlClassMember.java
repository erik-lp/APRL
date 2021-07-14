// This is a generated file. Not intended for manual editing.
package me.erik.aprl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AprlClassMember extends PsiElement {

  @Nullable
  AprlInitializerBody getInitializerBody();

  @Nullable
  AprlLoadScript getLoadScript();

  @Nullable
  AprlPartnerDeclaration getPartnerDeclaration();

  @Nullable
  AprlSecondaryConstructor getSecondaryConstructor();

  @Nullable
  AprlTopLevelObject getTopLevelObject();

}
