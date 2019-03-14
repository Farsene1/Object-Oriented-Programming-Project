import hello.User;
import hello.UserRepository;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserRepositoryTest {
    @MockBean
    private UserRepository repository = Mockito.mock(UserRepository.class);

    @Test
    public void findAllUsersTest(){
        when(repository.findAllUsers()).thenReturn(Arrays.asList(
                new User("admin","root")
        ));
        List<User> result = repository.findAllUsers();
        assertEquals(1,result.size());
    }

    @Test
    public void findUserByUserNameTest(){
        when(repository.findUserByUsername("admin")).thenReturn(Arrays.asList(
                new User("admin","root")
        ));
        List<User> result = repository.findUserByUsername("admin");
        assertEquals(1,result.size());
    }

//    @Test
//    public void updateActivity(){
//        User u = new User("admin", "root");
//        when(repository.updateActivity(u.getUsername(),u.getWaterFootprint(),
//                u.getFoodFootprint(), u.getTransportFootprint(), u.getPolarScore(),
//                u.getDate())).thenReturn(Arrays.asList(
//                new User("admin","root")
//        ));
//        List<User> result = repository.updateActivity(u.getUsername(), u.getWaterFootprint(),
//                u.getFoodFootprint(), u.getTransportFootprint(), u.getPolarScore(),
//                u.getDate());
//        assertEquals(1,result.size());
//    }

}
