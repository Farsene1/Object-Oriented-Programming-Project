import hello.Statistics;
import hello.StatisticsController;
import hello.StatisticsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsControllerTest {

    @Autowired
    StatisticsController statisticsController = new StatisticsController();

    @MockBean
    private StatisticsRepository statisticsRepository = Mockito.mock(StatisticsRepository.class);

    @BeforeEach
    public void setUp(){
        statisticsController.setStatisticsRepository(statisticsRepository);
    }
    @Test
    public void getAllStatsTest(){
        Mockito.when(statisticsRepository.findStatisticsByUsername("admin"))
                .thenReturn(Arrays.asList(new Statistics(),new Statistics()));
        assertEquals(2, statisticsController.getAllStats("admin").size());
    }
}
