import hello.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ActivityControllerTest {

    @Autowired
    ActivityController activityController = new ActivityController();

    @MockBean
    ActivityRepository activityRepository = Mockito.mock(ActivityRepository.class);

    @MockBean
    StatisticsRepository statisticsRepository = Mockito.mock(StatisticsRepository.class);

    @BeforeEach
    public void setUp(){
        activityController.setActivityRepository(activityRepository);
        activityController.setStatisticsRepository(statisticsRepository);
    }
    @Test
    public void testPath(){
        when(activityRepository.findActivitiesByUser("admin"))
                .thenReturn(Arrays.asList(new Activity("admin",1,"vegan",200,"")));
        when(statisticsRepository.findStatisticByDateAndType("","ALL")).thenReturn(null);
        List<Activity> list = activityController.addToActivitiesTable(new Activity("admin",1,"vegan",200,""));
        assertEquals(1,list.size());
    }

    @Test
    public void firstActivitiesPath(){
        when(activityRepository.findActivitiesByUser("admin"))
                .thenReturn(Arrays.asList(new Activity("admin",1,"vegan",200,"")));
        List<Activity> list = activityController.getUpdatesActivities(new User("admin",""));
        assertEquals(1,list.size());
    }
}
