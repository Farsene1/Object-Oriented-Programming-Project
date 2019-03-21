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

    public List<Vehicle> getAllVehicles(User user){
        return restfulClient.getAllVehicles(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return foodfootprint + amount of meals eaten
     */
    public void sendMeal(User user, int amount){
        user.setFoodFootprint(amount + user.getFoodFootprint());
        restfulClient.activity(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return transportfootprint + amount of kilometers driven
     */
    public void sendTransport(User user, int amount){
        user.setTransportFootprint(amount + user.getTransportFootprint());
        restfulClient.activity(user);
    }

    /**
     *
     * @param user
     * @param amount
     * @return waterfootprint + amount of liters of water wasted
     */
    public void sendWater(User user, int amount){
        user.setWaterFootprint(amount + user.getWaterFootprint());
        restfulClient.activity(user);
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
