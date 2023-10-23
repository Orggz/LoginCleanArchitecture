package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;

public class ClearState {

    private String username = "";
    private String usernameError = null;
    private String password = "";
    private String passwordError = null;

    public ClearState(ClearState copy) {
        username = copy.username;
        usernameError = null;
        password = copy.password;
        passwordError = null;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

    public String getUsername() {
        return username;
    }

    public String clearUsername() {username = null; return null; }

    public String clearPassword() {password = null; return null; }



    public String getUsernameError() {
        return usernameError;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordError() {
        return passwordError;
    }


    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
}
