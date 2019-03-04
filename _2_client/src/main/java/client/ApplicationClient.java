package client;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
public class ApplicationClient {

    public static void main(String[] args) {
        RestfulClient restfulClient = new RestfulClient();

        restfulClient.getEntity();

        User user1 = new User("Florentin", "123abc");
        User user2 = new User("Hashim","456def");

        restfulClient.postEntity(user1);
        restfulClient.postEntity(user2);
    }
}
