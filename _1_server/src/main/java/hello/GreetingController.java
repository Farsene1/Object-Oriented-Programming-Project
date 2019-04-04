package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * This is the Rest Controller.
 */
@RestController
public class GreetingController {

    /**
     * * autowiring the userRepo.
     */
    @Autowired
    private UserRepository userRepository;

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
     * default path for testing.
     *
     * @return String
     */
    @RequestMapping("/")
    public String getRootPath() {
        return "this is the default page";
    }

    /**
     * addActivity.
     *
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

        Statistics s = this.statisticsRepository
                .findStatisticByDateAndType(activity.getDate(), "ALL");

        if (s == null) {
            this.statisticsRepository.save(s1);
        } else {
            this.statisticsRepository
                    .updateStatistic(sum, activity.getUsername(), "ALL", activity.getDate());
        }

        //updating statistics for the type
        Integer sumFood = this.activityRepository
                .totalScoreByCategory(activity.getUsername(), activity.getDate(), activity.getCategory());

        Statistics sFood = new Statistics(
                activity.getUsername(), sumFood, activity.getDate());

        int c = activity.getCategory();
        if (c == 1) {
            sFood.setType("FOOD");
        } else if (c == 2) {
            sFood.setType("TRANSPORT");
        } else if (c == 3) {
            sFood.setType("ELECTRICITY");
        }
        Statistics sF = this.statisticsRepository
                .findStatisticByDateAndType(activity.getDate(), sFood.getType());

        if (sF == null) {
            this.statisticsRepository.save(sFood);
        } else {
            this.statisticsRepository
                    .updateStatistic(sumFood, activity.getUsername(), sFood.getType(), activity.getDate());
        }
        return this.activityRepository
                .findActivitiesByUser(activity.getUsername());
    }

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
     * this is the registration method - checks if the registration
     * is possible.
     *
     * @param user that wants to register.
     * @return the message
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody final User user) {
        List<User> users = this.userRepository
                .findUserByUsername(user.getUsername());
        if (users.size() == 0) {
            this.userRepository.save(user);
            return "/POST successful";
        } else {
            return "/POST failed";
        }
    }

    /**
     * method called for login request.
     *
     * @param user that wants to login.
     * @return String
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody final User user) {
        List<User> users = this.userRepository
                .findUserByUsername(user.getUsername());
        String hash2 = user.getHash();
        if (users.size() > 0 && users.get(0).getHash().equals(hash2)) {
            return "POSITIVE";
        } else {
            return "NEGATIVE";
        }
    }

    /**
     * update the badge for a user.
     *
     * @param user that has a badge.
     * @return res.
     */
    @RequestMapping(value = "/updateBadge")
    public String updateBadge(@RequestBody final User user) {
        this.userRepository.updateBadge(user.getBadge(), user.getUsername());
        return "OK";
    }

    /**
     * adds activity to a user.
     *
     * @param user that has an activity to be added.
     * @return the current user
     */
    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    public String addActivity(@RequestBody final User user) {
        System.out.println("No pain no gain");
        this.userRepository.updateActivity(user.getFoodScore(),
                user.getTransportScore(),
                user.getElectricityScore(),
                user.getPolarScore(),
                user.getUsername());
        return "OK";
    }

    /**
     * method for getting the most recent updates.
     *
     * @return user from db.
     */
    @RequestMapping(value = "/requestforupdate", method = RequestMethod.POST)
    public User getUpdates(@RequestBody final User user) {
        List<User> users = this.userRepository
                .findUserByUsername(user.getUsername());
        return users.get(0);
    }

    /**
     * just a default method.
     *
     * @param username username parameter.
     * @param hash     hash parameter.
     * @return User parameter.
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value = "username",
            defaultValue = "anonymous") final String username,
                         @RequestParam(value = "hash", defaultValue = "0") final String hash) {
        String info = String.format(
                "/GET REQUEST info: username=%s, hash=%s", username, hash);
        System.out.println(info);
        return new User(username, hash);
    }

    /**
     * leaderboard method.
     *
     * @return list.
     */
    @RequestMapping(value = "/leaderboard", method = RequestMethod.GET)
    public List<User> leaderboard() {
        return this.userRepository.getTopTen();
    }

    /**
     * default method for testing, dangerous to use.
     *
     * @return List
     */
    @RequestMapping(value = "/d398hasd98qhwd98qwhq9dhq8wdhw8whd",
            method = RequestMethod.GET)
    public List<User> getAll() {
        return userRepository.findAllUsers();
    }

    /**
     * just a setter.
     *
     * @param userRepository user repository.
     */
    public void setUserRepository(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * setting the repo.
     *
     * @param activityRepository activity repository.
     */
    public void setActivityRepository(
            final ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
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
