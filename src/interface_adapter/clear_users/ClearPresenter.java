package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.clear_users.ClearState;
import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInState;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData user) {
        JOptionPane.showMessageDialog(null, user.getUsername());
    }

    @Override
    public void prepareFailView(String error) {

    }
}
