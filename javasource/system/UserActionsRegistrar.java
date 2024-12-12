package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.registerUserAction(myfirstmodule.actions.Java_VALID_PAN.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
