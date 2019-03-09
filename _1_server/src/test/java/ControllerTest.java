import hello.GreetingController;
import hello.User;
import hello.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Autowired
    private GreetingController controller = new GreetingController();

    @MockBean
    private UserRepository repository = Mockito.mock(UserRepository.class);

    private User user1 = new User("admin","root");
    private User user2 = new User("postgres","root");

    @BeforeEach
    public void setUp(){
        controller.setUserRepository(repository);
    }

    @Test
    public void defaultTest(){
        String result = controller.getRootPath();
        assertEquals("this is the default page", result);
    }

    @Test
    public void postTest(){
        Mockito.when(repository.findUserByUsername(user1.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.postMethod(user1);
        assertEquals("/POST successful", res);
    }

    @Test
    public void postTestFail(){
        Mockito.when(repository.findUserByUsername(user1.getUsername())).thenReturn(
                Arrays.asList(user1));
        assertEquals("/POST failed", controller.postMethod(user1));
    }

    @Test
    public void loginTest(){
        when(repository.findUserByUsername(user2.getUsername())).thenReturn(
                Arrays.asList(user2)
        );
        String res = controller.login(user2);
        assertEquals("POSITIVE", res);
    }

    @Test
    public void loginTestFail(){
        when(repository.findUserByUsername(user2.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.login(user2);
        assertEquals("NEGATIVE", res);
    }

    @Test
    public void getAllUsersTest(){
        when(repository.findAllUsers()).thenReturn((Arrays.asList(new User("farsene", "hash"),
                new User("admin", "root"))));
        assertEquals(2,repository.findAllUsers().size());
        //Mockito.when(controller.getAll()).thenReturn(new ArrayList<>());
        assertEquals(2,controller.getAll().size());
    }
}
