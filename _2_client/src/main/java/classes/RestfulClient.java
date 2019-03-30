package classes;

import client.Statistics;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestfulClient {
    RestTemplate restTemplate;

    public RestfulClient() {
        restTemplate = new RestTemplate();
    }

    /**
     * get Entity
     */
    public User getEntity() {
        System.out.println("Beginning /GET request!");
        String getUrl = "http://localhost:8080/get?username=Florentin&hash=abcdef";
        User getResponse = restTemplate.getForObject(getUrl, User.class); // User user = restTemplate.getForObject(getUrl, User.class); WHICH ONE IS BETTER? // DIFFERENT RESPONSES
        System.out.println(getResponse.toString());
        return getResponse;
    }

    /**
     * method for leaderboard.
     * @return list.
     */
    public List<User> get10Users(){
        String url = "http://localhost:8080/leaderboard";
        List<User> res = restTemplate.getForObject(url, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = mapper.convertValue(res, new TypeReference<List<User>>() {
        });
        return users;
    }

    /**
     * get all activities
     */
    public List<Activity> getAllActivities(User user) {
        String url = "http://localhost:8080/firstactivities";
        List<Activity> res = restTemplate.postForObject(url, user, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<Activity> activities = mapper.convertValue(res, new TypeReference<List<Activity>>() {
        });
        return activities;
    }

    /**
     * @param activity
     * @return
     */
    public List<Activity> addActivity(Activity activity) {
        String url = "http://localhost:8080/test";
        List<Activity> res = (List<Activity>) restTemplate.postForObject(url, activity, List.class);
        System.out.println("Response: " + res.toString());
        ObjectMapper mapper = new ObjectMapper();
        List<Activity> activities = mapper.convertValue(res, new TypeReference<List<Activity>>() {
        });
        return activities;
    }

    /**
     * this method sends a registration request and receives a message - POSITIVE OR NEGATIVE -
     *
     * @param user
     * @return
     */
    public String postEntity(User user) {
        System.out.println("Beginning /POST request");
        String postUrl = "http://localhost:8080/post";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for Post Request: " + postResponse.getBody());
        return postResponse.getBody();
    }

    /**
     * this method sends a registration request and receives a message - POSITIVE OR NEGATIVE -
     *
     * @param user
     * @return
     */
    public String login(User user) {
        System.out.println("Beginning /login request");
        String postUrl = "http://localhost:8080/login";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for Post Request: " + postResponse.getBody());
        return postResponse.getBody();
    }

    /**
     * @param user
     * @return
     */
    public String activity(User user) {
        System.out.println("beginning /activity request");
        String postUrl = "http://localhost:8080/activity";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    public String badge(User user){
        System.out.println("beginning /updateBadge request");
        String postUrl = "http://localhost:8080/updateBadge";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    /**
     * @param user
     * @return
     */
    public User getUpdates(User user) {
        System.out.println("Beginning /requestforupdate request");
        String postUrl = "http://localhost:8080/requestforupdate";
        ResponseEntity<User> getUpdate = restTemplate.postForEntity(postUrl, user, User.class);
        System.out.println("Response for Post Request: " + getUpdate.getBody());
        return getUpdate.getBody();
    }

    /**
     * method for getting all the friends.
     */
    public List<User> getAllFriends(User user){
        String url = "http://localhost:8080/friendship/friends";
        List<User> res = restTemplate.postForObject(url, user, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<User> result = mapper.convertValue(res, new TypeReference<List<User>>(){});
        return result;
    }

    /**
     * method for getting all the friend requests.
     */
    public List<FriendRequest> getAllFriendRequests(User user){
        String url = "http://localhost:8080/friendship/getallrequests";
        List<FriendRequest> res = restTemplate.postForObject(url, user, List.class);
        System.out.println(res);
        ObjectMapper mapper = new ObjectMapper();
        List<FriendRequest> result = mapper.convertValue(res, new TypeReference<List<FriendRequest>>(){});
        return result;
    }

    /**
     * method for making a request.
     */
    public String sendFriendRequest(FriendRequest friendRequest) {
        System.out.println("beginning /activity request");
        String postUrl = "http://localhost:8080/friendship/request";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, friendRequest, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    /**
     * method for positively replying to a friend request.
     */
    public String respond(FriendRequest friendRequest) {
        String postUrl = "http://localhost:8080/friendship/respond";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, friendRequest, String.class);
        return postResponse.getBody();
    }

    /**
     * method for negatively replying to the friend request.
     */
    public String fakeRespond(FriendRequest friendRequest) {
        String postUrl = "http://localhost:8080/friendship/fakeresponse";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, friendRequest, String.class);
        return postResponse.getBody();
    }

    /**
     * @param restTemplate
     */
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Statistics> getAllStatistics(String username) {
        String url = "http://localhost:8080/statistics";
        List<Statistics> res = restTemplate.postForObject(url, username, List.class);
        System.out.println(res);
        ObjectMapper mapper = new ObjectMapper();
        List<Statistics> result = mapper.convertValue(res, new TypeReference<List<Statistics>>(){});
        return result;
    }
}