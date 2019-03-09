import hello.GreetingController;
import hello.User;
import hello.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Autowired
    private GreetingController controller;

    @MockBean
    private UserRepository repository;

    @Test
    public void getAllUsersTest(){
        when(repository.findAllUsers()).thenReturn((List<User>) Stream.of(new User("farsene","hash"),
                new User("admin","root")));
        assertEquals(2,repository.findAllUsers().size());
    }
}
