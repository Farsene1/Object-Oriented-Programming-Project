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

    /**
     * method that needs to be tested - waiting for @HASHIM to call it in the GUI
     *      * @param user
     * @return
     */
    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    public User addActivity(@RequestBody User user){
        List<User> temp = this.userRepository.findUserByUsername(user.getUsername());

        User u = temp.get(0);
        u.setFoodFootprint(u.getFoodFootprint() + user.getFoodFootprint());
        u.setTransportFootprint(u.getTransportFootprint() + user.getTransportFootprint());
        u.setFoodFootprint(u.getWaterFootprint() + user.getWaterFootprint());

        this.userRepository.updateActivity(user.getUsername(),user.getWaterFootprint(),
                user.getWaterFootprint(), user.getTransportFootprint(), user.getPolarScore(), user.getDate());
        List<User> users = this.userRepository.findUserByUsername(user.getUsername());
        return users.get(0);
    }

    /**
     *
     * @param username
     * @param hash
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="username", defaultValue = "anonymous") String username,
                         @RequestParam(value="hash",defaultValue = "0") String hash) {
        String info = String.format("/GET REQUEST info: username=%s, hash=%s",username, hash);
        System.out.println(info);
        return new User(username, hash);
    }

}