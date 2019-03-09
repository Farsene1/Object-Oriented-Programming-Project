import hello.GreetingController;
import hello.User;
import hello.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Autowired
    private GreetingController controller;

    @MockBean
    private UserRepository repository; //= Mockito.mock(UserRepository.class);

    private User user1 = new User("admin","root");
    private User user2 = new User("postgres","root");

    @Test
    public void defaultTest(){
        String result = controller.getRootPath();
        assertEquals("this is the default page", result);
    }

    @Test
    public void postTest(){
        when(repository.findUserByUsername(user1.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.postMethod(user1);
        assertEquals("/POST successful", res);
    }

    @Test
    public void loginTest(){
        when(repository.findUserByUsername(user2.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.postMethod(user2);
        assertEquals("NEGATIVE", res);
    }

    @Test
    public void getAllUsersTest(){
        when(repository.findAllUsers()).thenReturn((Arrays.asList(new User("farsene", "hash"),
                new User("admin", "root"))));
        assertEquals(2,repository.findAllUsers().size());
    }
}
