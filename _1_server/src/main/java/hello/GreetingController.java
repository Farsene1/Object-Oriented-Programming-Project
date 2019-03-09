package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String getRootPath(){
        List<User> users = this.userRepository.findAllUsers();
        for(User u  : users){
            System.out.println(u.toString());
        }
        return "this is the default page";
    }

    /**
     * this is the registration method - checks if the registration is possible
     * @param user
     * @return the message
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody User user){
        List<User> users = this.userRepository.findUserByUsername(user.getUsername());
        if(users.size() == 0){
            this.userRepository.save(user);
            return "/POST successful";
        }else{
            return "/POST failed";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user){
        List<User> users = this.userRepository.findUserByUsername(user.getUsername());
        System.out.println(users.get(0).toString());
        String hash1 = users.get(0).getHash();
        String hash2 = user.getHash();
        if(users.size() > 0 && hash1.equals(hash2)){
            return "POSITIVE";
        }else{
            return "NEGATIVE";
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="username", defaultValue = "anonymous") String username,
                         @RequestParam(value="hash",defaultValue = "0") String hash) {
        String info = String.format("/GET REQUEST info: username=%s, hash=%s",username, hash);
        System.out.println(info);
        return new User(username, hash);
    }

}