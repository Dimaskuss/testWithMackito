package Service;

import model.User;
import repository.UserDaoImpl;

public class UserService {

    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }

}