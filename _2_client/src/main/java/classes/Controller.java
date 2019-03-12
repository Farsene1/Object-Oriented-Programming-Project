package classes;

import classes.RestfulClient;
import classes.User;

public class Controller {

    private RestfulClient restfulClient;

    public String signUp(User user){
        return restfulClient.postEntity(user).getBody();
    }

    // methods to be implemented in the restful client class
    // Restful client will be called through this Controller class
    public String login(User user){
        return restfulClient.login(user);
    }

    public void sendData(User user){

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
}
