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

     * @return response list.
     */
    @RequestMapping("/friends")
    public List<User> getAllFriends(@RequestBody User user) {
        List<String> temp = friendshipRepository.getAllFriends(user.getUsername());
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
        List<String> l1 = this.friendshipRepository.getAllFriends(friendRequest.getSender());
        List<FriendRequest> l2 = this.friendRequestRepository.findAllRequestsFor(friendRequest.getSender());
        List<FriendRequest> l3 = this.friendRequestRepository.findAllRequestsFor(friendRequest.getReceiver());

        boolean ok = true;

        if(friendRequest.getSender().equals(friendRequest.getReceiver())) {
            ok = false;
        }

        if(l1.contains(friendRequest.getReceiver())){
            ok = false;
        }

        for(FriendRequest f : l2){
            if(f.getSender().equals(friendRequest.getReceiver())){
                ok = false;
            }
        }

        for(FriendRequest f : l3){
            if(f.getSender().equals(friendRequest.getSender())){
                ok = false;
            }
        }

        if(ok == true){
            this.friendRequestRepository.save(friendRequest);
        } else System.out.println("Request cannot be sent: error");

        return "SENT";
    }

    /**
     * method for getting all the friendRequests.
     */
    @RequestMapping("/getallrequests")
    public List<FriendRequest> getAllRequest(@RequestBody User user) {
        List<FriendRequest> list = friendRequestRepository.findAllRequestsFor(user.getUsername());
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

    /**
     * this method sets the request answer to true so that it will not appear in the incoming requests.
     * @param friendRequest
     */
    @RequestMapping("/fakeresponse")
    public String fakeRespond(@RequestBody FriendRequest friendRequest) {
        friendRequestRepository.respond(true, friendRequest.getSender(), friendRequest.getReceiver());
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
