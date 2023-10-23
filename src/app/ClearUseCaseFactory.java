package app;

import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupController;
import interface_adapter.signup.SignupPresenter;
import interface_adapter.signup.SignupViewModel;
import interface_adapter.clear_users.ClearState;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import use_case.signup.SignupUserDataAccessInterface;
import entity.CommonUserFactory;
import entity.UserFactory;
import interface_adapter.*;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInteractor;
import use_case.signup.SignupOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
import use_case.signup.SignupInteractor;
import use_case.signup.SignupOutputBoundary;
import view.SignupView;

import javax.swing.*;
import java.io.IOException;

public class ClearUseCaseFactory {

    /** Prevent instantiation. */
    private ClearUseCaseFactory() {}

    public static ClearController create(ClearViewModel clearViewModel, ClearUserDataAccessInterface userDataAccessObject){
        try {
            ClearController clearController = createClearUseCase(clearViewModel, userDataAccessObject);
            return clearController;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Could not open user data file.");
        }

        return null;
    }

    private static ClearController createClearUseCase(ClearViewModel clearViewModel, ClearUserDataAccessInterface userDataAccessObject) throws IOException {

        // Notice how we pass this method's parameters to the Presenter.
        ClearOutputBoundary clearOutputBoundary = new ClearPresenter(clearViewModel);

        ClearInputBoundary ClearInteractor = new ClearInteractor(
                userDataAccessObject, clearOutputBoundary);

        return new ClearController(ClearInteractor);
    }
}
