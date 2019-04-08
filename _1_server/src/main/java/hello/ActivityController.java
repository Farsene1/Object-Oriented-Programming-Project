package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * activity controller.
 */
@RestController
public class ActivityController {


    /**
     * autowiring activities repo.
     */
    @Autowired
    private ActivityRepository activityRepository;

    /**
     * autowiring statistics repo.
     */
    @Autowired
    private StatisticsRepository statisticsRepository;


    /**
     * updates activities for a user.
     *
     * @param user that needs their activites updated
     * @return List of Activity objects
     */
    @RequestMapping(value = "/firstactivities", method = RequestMethod.POST)
    public List<Activity> getUpdatesActivities(@RequestBody final User user) {
        return this.activityRepository
                .findActivitiesByUser(user.getUsername());
    }

    /**
     * addActivity.
     * @param activity that is added.
     * @return list.
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<Activity> addToActivitiesTable(
            @RequestBody final Activity activity) {

        this.activityRepository.save(activity);
        System.out.println("activities table updates");

        //updating statistics for type ALL
        Integer sum = this.activityRepository
                .totalFootprint(activity.getUsername(), activity.getDate());

        Statistics s1 = new Statistics(
                activity.getUsername(), sum, activity.getDate());
        s1.setType("ALL");

        Statistics stats = this.statisticsRepository
                .findStatisticByDateAndType(activity.getDate(), "ALL");

        if (stats == null) {
            this.statisticsRepository.save(s1);
        } else {
            this.statisticsRepository
                    .updateStatistic(sum, activity.getUsername(),
                            "ALL", activity.getDate());
        }

        //updating statistics for the type
        Integer sumFood = this.activityRepository
                .totalScoreByCategory(activity.getUsername(),
                        activity.getDate(), activity.getCategory());

        Statistics sfood = new Statistics(
                activity.getUsername(), sumFood, activity.getDate());

        int category = activity.getCategory();
        if (category  == 1) {
            sfood.setType("FOOD");
        } else if (category  == 2) {
            sfood.setType("TRANSPORT");
        } else if (category  == 3) {
            sfood.setType("ELECTRICITY");
        }
        Statistics statsrepo = this.statisticsRepository
                .findStatisticByDateAndType(activity.getDate(),
                        sfood.getType());

        if (statsrepo == null) {
            this.statisticsRepository.save(sfood);
        } else {
            this.statisticsRepository
                    .updateStatistic(sumFood, activity.getUsername(),
                            sfood.getType(), activity.getDate());
        }
        return this.activityRepository
                .findActivitiesByUser(activity.getUsername());
    }

    /**
     * setting the repo.
     *
     * @param activityRepository2 activity repository.
     */
    public void setActivityRepository(
            final ActivityRepository activityRepository2) {
        this.activityRepository = activityRepository2;
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
