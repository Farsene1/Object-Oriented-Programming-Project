package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * class that handles connections
 * regarding the friends feature.
 */
@RestController
@RequestMapping("/friendship")
public class FriendshipController {

    /**
     * friendshipRepository.
     */
    @Autowired
    private FriendshipRepository friendshipRepository;

    /**
     * friendRequestRepository.
     */
    @Autowired
    private FriendRequestRepository friendRequestRepository;

    /**
     * userRepository.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * method for getting all the friends in the database.
     * @param username
     * @return response list.
     */
    @RequestMapping("/friends")
    public List<User> getAllFriends(@RequestBody String username) {
        List<String> temp = friendshipRepository.getAllFriends(username);
        List<User> result = new ArrayList<User>();
        for (String s : temp) {
            result.add(userRepository.findUserByUsername(s).get(0));
        }
        return result;
    }

    /**
     * method for making a friend request.
     * @param friendRequest
     * @return response.
     */
    @RequestMapping("/request")
    public String makeRequest(@RequestBody FriendRequest friendRequest) {
        this.friendRequestRepository.save(friendRequest);
        return "SENT";
    }

    /**
     * method for getting all the friendRequests.
     */
    @RequestMapping("/getallrequests")
    public List<String> getAllRequest(@RequestBody String username) {
        List<String> list = friendRequestRepository.findAllRequestsFor(username);
        return list;
    }

    /**
     * method for responding to a friendRequest. TO BE CHANGED LATER, depending on GUI.
     */
    @RequestMapping("/respond")
    public String respond(@RequestBody FriendRequest friendRequest) {
        friendRequestRepository.respond(true, friendRequest.getSender(), friendRequest.getReceiver());
        this.friendshipRepository.save(new Friendship(friendRequest.getSender(), friendRequest.getReceiver()));
        this.friendshipRepository.save(new Friendship(friendRequest.getReceiver(), friendRequest.getSender()));
        return "OK";
    }

    public void setFriendshipRepository(FriendshipRepository friendshipRepository) {
        this.friendshipRepository = friendshipRepository;
    }

    public void setFriendRequestRepository(FriendRequestRepository friendRequestRepository) {
        this.friendRequestRepository = friendRequestRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
