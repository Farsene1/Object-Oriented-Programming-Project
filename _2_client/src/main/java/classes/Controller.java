package classes;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private RestfulClient restfulClient;

    public Controller(){
        restfulClient = new RestfulClient();
    }

    public String signUp(User user){
        return restfulClient.postEntity(user).getBody();
    }

    // methods to be implemented in the restful client class
    // Restful client will be called through this Controller class
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

    public void sendData(User user){

    }

    public List<Activity> sendFood(Activity activity){
        return restfulClient.addActivity(activity);
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
    }

    /**
     *
     * @param user
     * @param amount
     * @return waterfootprint + amount of liters of water wasted
     */
    public void sendWater(User user, int amount){
        user.setWaterFootprint(amount + user.getWaterFootprint());
    }

    /**
     * This method checks for a valid email
     * @param email
     * @return
     */
    public static boolean checkEmail(String email){
        boolean emailValid = EmailValidator.getInstance().isValid(email);
        return emailValid;
    }
}
