package repository;

import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UserDaoTest {

    private UserDaoImpl userDao = new UserDaoImpl(new ArrayList<>());


    @Test
    void getUserByNameWithCorrectName() {

        String name = "Dima";
        Assertions.assertNotNull(userDao.getUserByName(name));
    }

    @Test
    void getUserByNameWithCorrectUser() {
        User dima = new User("Dima", 31);
        String name = "Dima";

        Assertions.assertEquals(dima, userDao.getUserByName(name));
    }

    @Test
    void getUserByNameWithWrongName() {

        String name = "Dimas";
        Assertions.assertNull(userDao.getUserByName(name));
    }

    @Test
    void findAll() {
        Assertions.assertNotNull(userDao.findAllUsers());
    }

}