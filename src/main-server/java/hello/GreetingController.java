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

    /**
     * root path
     * @return a String
     */
    @RequestMapping("/")
    public String getRootPath(){
        return "this is the default page";
    }

    /**
     * /get path - request for
     * @param id
     * @param name
     * @param age
     * @return an User object
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="id", defaultValue="0") long id,
                         @RequestParam(value="name", defaultValue = "anonymous") String name,
                         @RequestParam(value="age",defaultValue = "0") int age) {
        String info = String.format("/GET REQUEST info: id=%d, name=%s, age=%d",id,name,age);
        System.out.println(info);
        return new User(id,name,age);
    }

    /**
     * /post path
     * @param user
     * @return String as response
     */
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
