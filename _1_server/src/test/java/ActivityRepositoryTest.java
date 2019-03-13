import hello.User;
import hello.Activity;
import hello.ActivityRepository;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ActivityRepositoryTest {
    User user1 = new User("username", "abc");
    @MockBean
    private ActivityRepository repository = Mockito.mock(ActivityRepository.class);

//    @Test
//    public void findAllActivitiesTest(){
//        when(repository.findAllActivities()).thenReturn(Arrays.asList(
//                new Activity(user1,1, "vegetarian", 50, "13-03-2019")
//        ));
//        List<Activity> result = repository.findAllActivities();
//        assertEquals(1, result.size());
//    }
//
//    @Test
//    public void findWaterFootprintByUser(){
//        when(repository.findWaterFootprintByUser(1)).thenReturn(Arrays.asList(
//                new Activity(user1,1, "bath", 80, "13-03-2019")
//        ));
//        List<Activity> result = repository.findFoodFootprintByUser(1);
//        assertEquals(1, result.size());
//    }
//
//    @Test
//    public void findFoodFootprintByUser(){
//        when(repository.findFoodFootprintByUser(1)).thenReturn(Arrays.asList(
//                new Activity(user1,2, "vegetarian", 50, "13-03-2019")
//        ));
//        List<Activity> result = repository.findFoodFootprintByUser(1);
//        assertEquals(1, result.size());
//    }
//
//    @Test
//    public void findTransportFootprintByUser(){
//        when(repository.findTransportFootprintByUser(1)).thenReturn(Arrays.asList(
//                new Activity(user1,3, "bus", 20, "13-03-2019")
//        ));
//        List<Activity> result = repository.findTransportFootprintByUser(1);
//        assertEquals(1, result.size());
//    }

//    @Test
//    public void updateActivityTest(){
//        Activity a = new Activity(user1,1, "vegetarian", 50, "13-03-2019");
//        when(repository.updateActivity(1)).thenReturn()
//    }
}
