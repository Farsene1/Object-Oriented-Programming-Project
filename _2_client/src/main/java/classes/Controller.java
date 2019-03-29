package classes;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.List;

public class Controller {

    private RestfulClient restfulClient;

    public Controller(){
        restfulClient = new RestfulClient();
    }

    public String signUp(User user){
        return restfulClient.postEntity(user);
    }

    public String login(User user){
        return restfulClient.login(user);
    }

    public User getUpdates(User user){
        User result = restfulClient.getUpdates(user);
        return result;
    }

    public List<Activity> getAllActivities(User user){
        return restfulClient.getAllActivities(user);
    }

    public List<Activity> sendFood(Activity activity){
        return restfulClient.addActivity(activity);
    }

    /**
     *
     * @param user
     * @param badge
     */
    public void sendBadge(User user, int badge){
        user.setBadge(badge);
        restfulClient.badge(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return foodfootprint + amount of meals eaten
     */
    public void sendMeal(User user, int amount){
        user.setFoodScore(amount + user.getFoodScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return transportfootprint + amount of kilometers driven
     */
    public void sendTransport(User user, int amount){
        user.setTransportScore(amount + user.getTransportScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return electricity + amount of liters of water wasted
     */
    public void sendElectricity(User user, int amount){
        user.setElectricityScore(amount + user.getElectricityScore());
        user.setPolarScore(user.getPolarScore() + amount);
        restfulClient.activity(user);
    }

    /**
     *
     * @param friendRequest
     * @return
     */
    public String sayYes(FriendRequest friendRequest) {
        return restfulClient.respond(friendRequest);
    }

    /**
     *
     * @param friendRequest
     * @return
     */
    public String sayNo(FriendRequest friendRequest) {
        return restfulClient.fakeRespond(friendRequest);
    }

    /**
     *
     * @param user
     * @return
     */
    public List<User> getAllFriends(User user) {
        return restfulClient.getAllFriends(user);
    }

    /**
     *
     * @param user
     * @return
     */
    public List<FriendRequest> getAllRequests(User user){
        return restfulClient.getAllFriendRequests(user);
    }

    /**
     * This method checks for a valid email
     * @param email
     * @return boolean
     */
    public static boolean checkEmail(String email){
        boolean emailValid = EmailValidator.getInstance().isValid(email);
        return emailValid;
    }

    public RestfulClient getRestfulClient() {
        return restfulClient;
    }

    public void setRestfulClient(RestfulClient restfulClient) {
        this.restfulClient = restfulClient;
    }
}
