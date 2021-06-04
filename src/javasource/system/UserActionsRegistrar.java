package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(databaseconnector.actions.ExecuteParameterizedQuery.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteParameterizedStatement.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteQuery.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteStatement.class);
    registrator.registerUserAction(encryption.actions.DecryptString.class);
    registrator.registerUserAction(encryption.actions.EncryptString.class);
    registrator.registerUserAction(encryption.actions.GeneratePGPKeyRing.class);
    registrator.registerUserAction(encryption.actions.PGPDecryptDocument.class);
    registrator.registerUserAction(encryption.actions.PGPEncryptDocument.class);
    registrator.registerUserAction(encryption.actions.ValidatePrivateKeyRing.class);
    registrator.registerUserAction(snowflakeconnector.actions.AsyncQueryExecute.class);
    registrator.registerUserAction(snowflakeconnector.actions.AsyncQueryGetResult.class);
    registrator.registerUserAction(snowflakeconnector.actions.AsyncQueryGetStatus.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
