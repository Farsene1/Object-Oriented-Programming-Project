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

<<<<<<< .merge_file_hY4tGb
    public List<Activity> sendFood(Activity activity){
=======
    public List<Activity> addActivity(Activity activity){
>>>>>>> .merge_file_WzMnJ5
        return restfulClient.addActivity(activity);
    }

//    public List<Transport> getAllVehicles(User user){
//        return restfulClient.getAllVehicles(user);
//    }

    /**
     *
     * @param user
     * @param amount
     * @return foodfootprint + amount of meals eaten
     */
    public void sendMeal(User user, int amount){
        user.setFoodScore(amount + user.getFoodScore());
<<<<<<< .merge_file_hY4tGb
=======
        user.setPolarScore(user.getPolarScore() + amount);
>>>>>>> .merge_file_WzMnJ5
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
<<<<<<< .merge_file_hY4tGb
=======
        user.setPolarScore(user.getPolarScore() + amount);
>>>>>>> .merge_file_WzMnJ5
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
<<<<<<< .merge_file_hY4tGb
=======
        user.setPolarScore(user.getPolarScore() + amount);
>>>>>>> .merge_file_WzMnJ5
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
