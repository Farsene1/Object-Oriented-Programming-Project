package client;

public class Controller {

    private RestfulClient restfulClient;

    public void signUp(User user){
        restfulClient.postEntity(user);
    }

    // methods to be implemented in the restful client class
    // Restful client will be called through this Controller class
    public void login(User user){
    }

    public void sendData(User user){
    }
}
