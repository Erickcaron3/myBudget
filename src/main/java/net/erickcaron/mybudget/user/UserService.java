package net.erickcaron.mybudget.user;

import java.util.List;

public interface UserService {

    User getUserById(Long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    List<User> showAllUsers();

}
