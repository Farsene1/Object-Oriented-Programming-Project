package classes;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.List;

/**
 * Controller class.
 */
public class Controller {
    /**
     * RestfulClient .
     */
    private RestfulClient restfulClient;

    /**
     * Construcgtor.
     */
    public Controller() {
        restfulClient = new RestfulClient();
    }

    /**
     * SignUp metrhod.
     *
     * @param user user parameter.
     * @return returns a string.
     */
    public String signUp(final User user) {
        return restfulClient.postEntity(user);
    }

    /**
     * Returns a string for login.
     *
     * @param user user paramter.
     * @return returns a string.
     */
    public String login(final User user) {
        return restfulClient.login(user);
    }

    /**
     * Gets updates for a user.
     *
     * @param user user parameter.
     * @return returns the user.
     */
    public User getUpdates(final User user) {
        User result = restfulClient.getUpdates(user);
        return result;
    }

    /**
     * Returns a list of activities.
     *
     * @param user paramter user.
     * @return List<Activity < / Activity>.
     */
    public List<Activity> getAllActivities(final User user) {
        return restfulClient.getAllActivities(user);
    }

    /**
     * Returns a list of activities .
     *
     * @param activity activity parameter.
     * @return returns a list.
     */
    public List<Activity> sendFood(final Activity activity) {
        return restfulClient.addActivity(activity);
    }

    /**
     * Sends a badge to the user.
     *
     * @param user  use rparameter.
     * @param badge badge parameter.
     */
    public void sendBadge(User user, int badge) {
        user.setBadge(badge);
        restfulClient.badge(user);
    }

    /**
     * Returns a list of statistics.
     *
     * @param username username parameter.
     * @return list.
     */
    public List<classes.Statistics> getStatistics(final String username) {
        return this.restfulClient.getAllStatistics(username);
    }

    /**
     * Returns a list of statistics by type.
     *
     * @param username parameter username.
     * @param type     type parameter
     * @return list
     */
    public List<Statistics> getStatsByType(final String username, final String type) {
        return this.restfulClient.getStatsByType(username, type);
    }

    /**
     * Sends a meal to the user.
     *
     * @param user   user parameter.
     * @param amount amount parameter.
     * @return foodfootprint amount of meals eaten.
     */
    public void sendMeal(final User user, final int amount) {
        user.setFoodScore(amount + user.getFoodScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     * Sends transport.
     *
     * @param user   user parameter.
     * @param amount amount parameter.
     * @return transportfootprint amount of kilometers driven.
     */
    public void sendTransport(final User user, final int amount) {
        user.setTransportScore(amount + user.getTransportScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     * Sends electricity object.
     *
     * @param user   user parameter.
     * @param amount amount parameter.
     * @return electricity amount of liters of water wasted.
     */
    public void sendElectricity(final User user, final int amount) {
        user.setElectricityScore(amount + user.getElectricityScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     * Returns a string response.
     * @param friendRequest friend request parameter.
     * @return string.
     */
    public String sayYes(final FriendRequest friendRequest) {
        return restfulClient.respond(friendRequest);
    }

    /**
     * Returns a string response for no.
     * @param friendRequest friend request parameter.
     * @return string.
     */
    public String sayNo(final FriendRequest friendRequest) {
        return restfulClient.fakeRespond(friendRequest);
    }

    /**
     * Gets all friends.
     * @param user user parameter.
     * @return returns a list.
     */
    public List<User> getAllFriends(final User user) {
        return restfulClient.getAllFriends(user);
    }

    /**
     * Returns a list of friend Requests.
     * @param user parameter user.
     * @return list.
     */
    public List<FriendRequest> getAllRequests(User user) {
        return restfulClient.getAllFriendRequests(user);
    }

    /**
     * Returns a list of uisers.
     * @return list.
     */
    public List<User> get10Users() {
        return this.restfulClient.get10Users();
    }


    /**
     * This method checks for a valid email.
     *
     * @param email
     * @return boolean
     */
    public static boolean checkEmail(final String email) {
        boolean emailValid = EmailValidator.getInstance().isValid(email);
        return emailValid;
    }

    /**
     * Returns restufl.
     * @return restfulClient.
     */
    public RestfulClient getRestfulClient() {
        return restfulClient;
    }

    /**
     * Sets restful.
     * @param restfulClient restful parameter.
     */
    public void setRestfulClient(final RestfulClient restfulClient) {
        this.restfulClient = restfulClient;
    }
}
