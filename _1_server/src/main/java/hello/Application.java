package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot app start.
 *
 * @author OOPP team
 */
@SpringBootApplication
public class Application {

    /**
     * here we start the springapplication.
     *
     * @param args main of the server.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
