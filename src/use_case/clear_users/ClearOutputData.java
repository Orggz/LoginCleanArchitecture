package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {

    private final String username;
    public ClearOutputData(ArrayList<String> name) {
        String join = String.join(",", name);
        this.username = join;
    }

    public String getUsername() {
        return username;
    }
}
