package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author OOPP server team.
 */
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
     * @param username for statistics.
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
            defaultValue = "anonymous") final String username,
                                              @RequestBody final String type) {
        return statisticsRepository
                .findStatisticsByUsernameAndType(username, type);
    }

    /**
     * setter.
     *
     * @param statisticsRepository2 setter for statistics repo.
     */
    public void setStatisticsRepository(
            final StatisticsRepository statisticsRepository2) {
        this.statisticsRepository = statisticsRepository2;
    }
}
