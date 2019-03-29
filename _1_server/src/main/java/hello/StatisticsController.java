package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * This is the Rest Controller.
 */
@RestController
public class StatisticsController {

    /**
     * * autowiring the statisticsRepo.
     */
    @Autowired
    private StatisticsRepository statisticsRepository;

    /**
     * * autowiring the activityRepo.
     */
    @Autowired
    private ActivityRepository activityRepository;

    /**
     * addTotalFoodFootprint
     */
    @RequestMapping(value = "/totalFood", method = RequestMethod.POST)
    public Integer addFoodToStatisticsTable(@RequestBody Statistics statistics) {
        this.statisticsRepository.save(statistics);
        System.out.println("statistics table updates");
        return this.activityRepository.totalFoodFootprint(statistics.getUsername(), statistics.getDate());
    }

    /**
     * addTotalTransportFootprint
     */
    @RequestMapping(value = "/totalTransport", method = RequestMethod.POST)
    public Integer addTransportToStatisticsTable(@RequestBody Statistics statistics) {
        this.statisticsRepository.save(statistics);
        System.out.println("statistics table updates");
        return this.activityRepository.totalTransportFootprint(statistics.getUsername(), statistics.getDate());
    }

    /**
     * addTotalElectricityFootprint
     */
    @RequestMapping(value = "/totalElectricity", method = RequestMethod.POST)
    public Integer addElectricityToStatisticsTable(@RequestBody Statistics statistics) {
        this.statisticsRepository.save(statistics);
        System.out.println("statistics table updates");
        return this.activityRepository.totalElectricityFootprint(statistics.getUsername(), statistics.getDate());
    }

    /**
     * addTotalFootprint
     */
    @RequestMapping(value = "/total", method = RequestMethod.POST)
    public Integer addTotalFootprintToStatisticsTable(@RequestBody Statistics statistics) {
        this.statisticsRepository.save(statistics);
        System.out.println("statistics table updates");
        return this.activityRepository.totalFootprint(statistics.getUsername(), statistics.getDate());
    }

    /**
     * just a setter.
     *
     * @param statisticsRepository
     */
    public void setStatisticsRepository(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }
}
