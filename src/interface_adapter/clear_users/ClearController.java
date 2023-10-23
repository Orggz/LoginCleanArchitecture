package interface_adapter.clear_users;

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
import use_case.login.LoginInputData;
import use_case.login.LoginInputBoundary;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;
// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearInputInteractor;
    public ClearController(ClearInputBoundary clearInputInteractor) {
        this.clearInputInteractor = clearInputInteractor;
    }


    public void execute() {
        clearInputInteractor.execute();
    }
}
