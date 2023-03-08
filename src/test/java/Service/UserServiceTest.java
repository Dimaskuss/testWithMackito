package Service;

import lombok.RequiredArgsConstructor;
import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserDaoImpl;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserDaoImpl userDaoMock;
    @InjectMocks
    private UserService userService;


    @Test
    void checkUserExistWithCorrectUser() {

        User dima = new User("Dima", 31);
        String name = "Dima";
        when(userDaoMock.getUserByName(name)).thenReturn(dima);

        Assertions.assertTrue(userService.checkUserExist(dima));

    }

    @Test
    void checkUserExistWithNullUser() {

        User dima = new User("Dima", 31);
        String name = "Dima";
        when(userDaoMock.getUserByName(name)).thenReturn(null);

        Assertions.assertFalse(userService.checkUserExist(dima));

    }
}