import hello.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StatisticsControllerTest {

    @Autowired
    private StatisticsController controller = new StatisticsController();

    @MockBean
    private StatisticsRepository statisticsRepository = Mockito.mock(StatisticsRepository.class);

    @MockBean
    private ActivityRepository repository = Mockito.mock(ActivityRepository.class);

    private Statistics stats1 = new Statistics("admin",5000,"22-02-1999");
    private Statistics stats2 = new Statistics("Julian",6000,"31-03-2019");

    @BeforeEach
    public void setUp(){
        controller.setStatisticsRepository(statisticsRepository);
    }

}
