package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        RestfulClient restfulClient = new RestfulClient();

        restfulClient.getEntity();

        User user1 = new User(1, "Florentin", 19);
        User user2 = new User(2, "Hashim", 17);
        User user3 = new User(3, "Tijs", 19);
        restfulClient.postEntity(user1);
        restfulClient.postEntity(user2);
        restfulClient.postEntity(user3);
    }
}
