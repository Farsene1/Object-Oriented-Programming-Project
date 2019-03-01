package hello;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    /**
     * this is a temporary arraylist that stores the users
     * @toBeRepalcedLaterWithADatabase
     */
    private static ArrayList<User> users = new ArrayList<User>();

    @RequestMapping("/")
    public String getRootPath(){
        return "this is the default page";
    }
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="id", defaultValue="0") long id,
                             @RequestParam(value="email", defaultValue = "anonymous") String email,
                             @RequestParam(value="username",defaultValue = "anonymous") String username,
                         @RequestParam(value="password",defaultValue = "anonymous") String password) {
        String info = String.format("/GET REQUEST info: id=%d, email=%s, username=%s, password=%s",id,email,username, password);
        System.out.println(info);
        return new User(id,email, username, password);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody User user){
        users.add(user);
        System.out.println("/POST request info: " + user.toString());
        System.out.println("Adding to db -- this might take a while. Have a coffee!");
        System.out.println("Success!");
        System.out.println("Number of users in db = " + users.size());
        for(User u : users){
            System.out.println(u.toString());
        }
        return "/POST successfull";
    }
}
