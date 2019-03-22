package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/friendship")
public class FriendshipController {

    @Autowired
    private FriendshipRepository friendshipRepository;

    @Autowired
    private FriendRequestRepository friendRequestRepository;

    /**
     * method for getting all the friends in the database.
     * @param username
     * @return response list.
     */
    @RequestMapping("/friends")
    public List<String> getAllFriends(@RequestBody String username){
        List<String> result = friendshipRepository.getAllFriends(username);
        return result;
    }

    /**
     * method for making a friend request.
     * @param friendRequest
     * @return response.
     */
    @RequestMapping("/request")
    public String makeRequest(@RequestBody FriendRequest friendRequest){
        this.friendRequestRepository.save(friendRequest);
        return "FRIEND REQUEST SENT";
    }

    /**
     * method for getting all the friendRequests.
     */
    @RequestMapping("/getallrequests")
    public List<String> getAllRequest(@RequestBody String username){
        List<String> list = friendRequestRepository.findAllRequestsFor(username);
        return list;
    }

    /**
     * method for responding to a friendRequest
     */
    @RequestMapping("/respond")
    public String respond(@RequestBody FriendRequest friendRequest){
        friendRequestRepository.respond(true, friendRequest.getUsername1(), friendRequest.getUsername2());
        this.friendshipRepository.save(new Friendship(friendRequest.getUsername1(), friendRequest.getUsername2()));
        this.friendshipRepository.save(new Friendship(friendRequest.getUsername2(), friendRequest.getUsername1()));
        return "OK";
    }
}
