package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String getRootPath(){
        return "this is the default page";
    }

    @RequestMapping("/add")
    public String addToDatabase(@RequestParam(value="username", defaultValue = "anonymous") String username,
                                @RequestParam(value="hash",defaultValue = "0") String hash){
        User n = new User(username, hash);
        this.userRepository.save(n);
        return "SUCCESS";
    }

    @RequestMapping("/findall")
    public void getAllUsers() {
        SQLConnector con = new SQLConnector();
        con.getAllTuples();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="username", defaultValue = "anonymous") String username,
                         @RequestParam(value="hash",defaultValue = "0") String hash) {
        String info = String.format("/GET REQUEST info: username=%s, hash=%s",username, hash);
        System.out.println(info);
        return new User(username, hash);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody User user){
        this.userRepository.save(user);
        return "/POST successful";
    }
}