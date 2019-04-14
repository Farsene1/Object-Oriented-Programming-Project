package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * This is the Rest Controller.
 */
@RestController
public class UserController {

    /**
     * * autowiring the userRepo.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * friendshipRepository.
     */
    @Autowired
    private FriendshipRepository friendshipRepository;

    /**
     * friendRequestRepository.
     */
    @Autowired
    private FriendRequestRepository friendRequestRepository;

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
     * updates the scores of the user in db.
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
     * this adds solar panels to user.
     *
     * @param user that added solar panels or deleted them.
     * @return message.
     */
    @RequestMapping(value = "/addsolar", method = RequestMethod.POST)
    public String addSolarPanel(@RequestBody final User user) {
        this.userRepository.addSolarPanels(user.getUsername(), user.isSolar());
        return "added solar panels";
    }

    /**
     * method for getting the most recent updates.
     *
     * @param user that gets updates from the database.
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
     * this method gets all the users whose usenames start with regex.
     *
     * @param regex regular expression.
     * @return list.
     */
    @RequestMapping(value = "/regex", method = RequestMethod.POST)
    public List<String> getUsernamesLike(@RequestBody final String regex) {
        return this.userRepository.findByRegex(regex);
    }

    /**
     * this method gets all the users whose usenames start with regex.
     *
     * @param regex regular expression.
     * @return list.
     */
    @RequestMapping(value = "/regex2", method = RequestMethod.POST)
    public List<String> getUsernamesLike2(
            @RequestBody final String regex,
            @RequestParam(value = "username", defaultValue = "anonymous") final String username) {
        List<String> all = new ArrayList<String>(
                this.userRepository.findByRegex(regex));
        List<String> l1 =
                this.friendshipRepository.getAllFriends(username);

        for (String s : l1) {
            if (all.contains(s)) {
                all.remove(s);
            }
        }
        List<FriendRequest> l2 =
                this.friendRequestRepository.findAllRequestsFor(username);

        for (FriendRequest f : l2) {
            if (all.contains(f.getSender())) {
                all.remove(f.getSender());
            }
        }
        List<FriendRequest> l3 =
                this.friendRequestRepository.findAllRequestsSentBy(username);

        for (FriendRequest f : l3) {
            if (all.contains(f.getReceiver())) {
                all.remove(f.getReceiver());
            }
        }
        return all;
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
     * @param userRepository2 user repository.
     */
    public void setUserRepository(final UserRepository userRepository2) {
        this.userRepository = userRepository2;
    }

    /**
     * just another setter.
     *
     * @param friendshipRepository2 friendship repository.
     */
    public void setFriendshipRepository(FriendshipRepository friendshipRepository2) {
        this.friendshipRepository = friendshipRepository2;
    }

    /**
     * another setter.
     *
     * @param friendRequestRepository2 friendrequest repository.
     */
    public void setFriendRequestRepository(FriendRequestRepository friendRequestRepository2) {
        this.friendRequestRepository = friendRequestRepository2;
    }
}
