package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;
import use_case.login.LoginInputData;
import use_case.login.LoginOutputBoundary;
import use_case.login.LoginOutputData;
import use_case.login.LoginUserDataAccessInterface;
import use_case.clear_users.ClearOutputData;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.clear_users.ClearInputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessInterface;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessInterface = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
            ArrayList<String> users = userDataAccessInterface.clear();

            ClearOutputData clearOutputData = new ClearOutputData(users);
            clearPresenter.prepareSuccessView(clearOutputData);
            }
        }

