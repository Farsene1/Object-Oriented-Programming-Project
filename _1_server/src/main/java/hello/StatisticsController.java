package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatisticsController {
    /**
     * autowiring statistics repo.
     */
    @Autowired
    private StatisticsRepository statisticsRepository;

    /**
     * returns a list for statistics.
     *
     * @return List
     */
    @RequestMapping(value = "/statistics",
            method = RequestMethod.POST)
    public List<Statistics> getAllStats(@RequestBody final String username) {
        return statisticsRepository.findStatisticsByUsername(username);
    }

    /**
     * gets all stats by type.
     *
     * @param username username parameter.
     * @param type     type parameter.
     * @return list.x
     */
    @RequestMapping(value = "/stats", method = RequestMethod.POST)
    public List<Statistics> getAllStatsByType(@RequestParam(value = "username",
            defaultValue = "anonymous") String username, @RequestBody String type) {
        return statisticsRepository.findStatisticsByUsernameAndType(username, type);
    }

    /**
     * setter.
     *
     * @param statisticsRepository setter for statistics repo.
     */
    public void setStatisticsRepository(
            final StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }
}
