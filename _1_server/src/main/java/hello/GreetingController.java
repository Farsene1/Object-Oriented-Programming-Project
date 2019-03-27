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
     * default path for testing.
     *
     * @return String
     */
    @RequestMapping("/")
    public String getRootPath() {
        return "this is the default page";
    }

    /**
     * addActivity
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<Activity> addToActivitiesTable(@RequestBody Activity activity) {
        this.activityRepository.save(activity);
        System.out.println("activities table updates");
        return this.activityRepository.findActivitiesByUser(activity.getUsername());
    }

    /**
     * @param user
     * @return List of Activity objects
     */
    @RequestMapping(value = "/firstactivities", method = RequestMethod.POST)
    public List<Activity> getUpdatesActivities(@RequestBody User user) {
        return this.activityRepository.findActivitiesByUser(user.getUsername());
    }

    /**
     * this is the registration method - checks if the registration is possible.
     *
     * @param user
     * @return the message
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody User user) {
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
     * @param user
     * @return String
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {
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
     * waiting for @HASHIM to call it in the GUI.
     * * @param user
     *
     * @return the current user
     */
    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    public String addActivity(@RequestBody User user) {
        System.out.println("No pain no gain");
        this.userRepository.updateActivity(user.getFoodScore(), user.getTransportScore(),
                user.getElectricityScore(), user.getPolarScore(), user.getUsername());
        return "OK";
    }

    /**
     * method for getting the most recent updates.
     */
    @RequestMapping(value = "/requestforupdate", method = RequestMethod.POST)
    public User getUpdates(@RequestBody User user) {
        List<User> users = this.userRepository
                .findUserByUsername(user.getUsername());
        return users.get(0);
    }

    /**
     * just a default method.
     *
     * @param username
     * @param hash
     * @return User
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value = "username",
            defaultValue = "anonymous")
                                 String username,
                         @RequestParam(value = "hash", defaultValue = "0")
                                 String hash) {
        String info = String.format(
                "/GET REQUEST info: username=%s, hash=%s", username, hash);
        System.out.println(info);
        return new User(username, hash);
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
     * @param userRepository
     */
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * setting the repo.
     *
     * @param activityRepository
     */
    public void setActivityRepository(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }
}
