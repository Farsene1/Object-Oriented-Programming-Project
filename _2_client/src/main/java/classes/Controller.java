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
}
