package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    void save(User user);
    ArrayList<String> clear();
}
