package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.registerUserAction(myfirstmodule.actions.Java_Valid_Email.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_VALID_PAN.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_ValidAccntNo.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_ValidFirstName.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_validIFSC.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_ValidMoblNo.class);
    registrator.registerUserAction(myfirstmodule.actions.Java_ValidPKERN.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
