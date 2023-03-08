package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {

    private final List<User> userList;

    public UserDaoImpl(List<User> userList) {
        this.userList = userList;
        userList.add(new User("Dima", 31));
        userList.add(new User("Yarik", 30));
    }

    public User getUserByName(String name) {

        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;

            }
        }

        return null;

    }

    public List<User> findAllUsers() {
        return userList;
    }

}
