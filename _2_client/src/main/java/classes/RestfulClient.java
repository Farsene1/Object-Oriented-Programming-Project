package classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * RestfulClient class.
 */
public class RestfulClient {
    /**
     * Rest template variable.
     */
    RestTemplate restTemplate;

    /**
     * RestfulClient Constructor.
     */
    public RestfulClient() {
        restTemplate = new RestTemplate();
    }

    /**
     * Gets entity .
     *
     * @return returns a user.
     */
    public User getEntity() {
        System.out.println("Beginning /GET request!");
        String getUrl = "http://localhost:8080/"
                + "get?username=Florentin&hash=abcdef";
        User getResponse = restTemplate.getForObject(getUrl, User.class);
        System.out.println(getResponse.toString());
        return getResponse;
    }

    /**
     * method for leaderboard.
     *
     * @return list.
     */
    public List<User> get10Users() {
        String url = "http://localhost:8080/leaderboard";
        List<User> res = restTemplate.getForObject(url, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = mapper.convertValue(
                res, new TypeReference<List<User>>() {
                });
        return users;
    }

    /**
     * Returns a list of activities.
     *
     * @param user user parameter.
     * @return list.
     */
    public List<Activity> getAllActivities(final User user) {
        String url = "http://localhost:8080/firstactivities";
        List<Activity> res = restTemplate.postForObject(url, user, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<Activity> activities = mapper.convertValue(
                res, new TypeReference<List<Activity>>() {
                });
        return activities;
    }

    /**
     * A list of activities.
     *
     * @param activity activity parameter.
     * @return activities.
     */
    public List<Activity> addActivity(final Activity activity) {
        String url = "http://localhost:8080/test";
        List<Activity> res = (List<Activity>) restTemplate.postForObject(
                url, activity, List.class);
        System.out.println("Response: " + res.toString());
        ObjectMapper mapper = new ObjectMapper();
        List<Activity> activities = mapper.convertValue(
                res, new TypeReference<List<Activity>>() {
                });
        return activities;
    }

    /**
     * this method sends a registration request and receives a message
     * POSITIVE OR NEGATIVE.
     *
     * @param user user parameter.
     * @return a string
     */
    public String postEntity(final User user) {
        System.out.println("Beginning /POST request");
        String postUrl = "http://localhost:8080/post";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, user, String.class);
        System.out.println("Response for Post Request: "
                + postResponse.getBody());
        return postResponse.getBody();
    }

    /**
     * this method sends a registration request and receives a message
     * POSITIVE OR NEGATIVE.
     *
     * @param user user parameter.
     * @return a string.
     */
    public String login(final User user) {
        System.out.println("Beginning /login request");
        String postUrl = "http://localhost:8080/login";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, user, String.class);
        System.out.println("Response for Post Request: "
                + postResponse.getBody());
        return postResponse.getBody();
    }

    /**
     * Returns a n activitiy string.
     *
     * @param user user parameter.
     * @return a string.
     */
    public String activity(final User user) {
        System.out.println("beginning /activity request");
        String postUrl = "http://localhost:8080/activity";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, user, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    /**
     * Returns a badge response.
     *
     * @param user parameter.
     * @return returns a string for a badge.
     */
    public String badge(final User user) {
        System.out.println("beginning /updateBadge request");
        String postUrl = "http://localhost:8080/updateBadge";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, user, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    /**
     * sets the solar panels attribute.
     *
     * @param user to be passed to the server.
     * @return the response for the post request.
     */
    public String setSolar(final User user) {
        String postUrl = "http://localhost:8080/addsolar";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, user, String.class);
        return postResponse.getBody();
    }

    /**
     * Gets update for a user.
     *
     * @param user user parameter.
     * @return returns a user.
     */
    public User getUpdates(final User user) {
        System.out.println("Beginning /requestforupdate request");
        String postUrl = "http://localhost:8080/requestforupdate";
        ResponseEntity<User> getUpdate = restTemplate.postForEntity(
                postUrl, user, User.class);
        System.out.println("Response for Post Request: "
                + getUpdate.getBody());
        return getUpdate.getBody();
    }

    /**
     * Gets all friends for a certain user.
     *
     * @param user user parameter.
     * @return returns a list of users.
     */
    public List<User> getAllFriends(final User user) {
        String url = "http://localhost:8080/friendship/friends";
        List<User> res = restTemplate.postForObject(url, user, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<User> result = mapper.convertValue(
                res, new TypeReference<List<User>>() {
                });
        return result;
    }

    /**
     * Gets a list of friend Requests for a certain user.
     *
     * @param user user parameter.
     * @return returns a list of friend requests.
     */
    public List<FriendRequest> getAllFriendRequests(final User user) {
        String url = "http://localhost:8080/friendship/getallrequests";
        List<FriendRequest> res = restTemplate.postForObject(
                url, user, List.class);
        System.out.println(res);
        ObjectMapper mapper = new ObjectMapper();
        List<FriendRequest> result = mapper.convertValue(
                res, new TypeReference<List<FriendRequest>>() {
                });
        return result;
    }

    /**
     * Returns a string for the send friend request.
     *
     * @param friendRequest friend request object.
     * @return returns a string.
     */
    public String sendFriendRequest(final FriendRequest friendRequest) {
        System.out.println("beginning /activity request");
        String postUrl = "http://localhost:8080/friendship/request";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, friendRequest, String.class);
        System.out.println("Response for get request");
        return postResponse.getBody();
    }

    /**
     * Returns a string response.
     *
     * @param friendRequest friend request object.
     * @return returns a string.
     */
    public String respond(final FriendRequest friendRequest) {
        String postUrl = "http://localhost:8080/friendship/respond";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, friendRequest, String.class);
        return postResponse.getBody();
    }

    /**
     * Returns a string. for the no reponse.
     *
     * @param friendRequest friend request parameter.
     * @return returns a stirng.
     */
    public String fakeRespond(final FriendRequest friendRequest) {
        String postUrl = "http://localhost:8080/friendship/fakeresponse";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(
                postUrl, friendRequest, String.class);
        return postResponse.getBody();
    }

    /**
     * Sets restTEMPLATE.
     *
     * @param restTemplate parameter restTemplate.
     */
    public void setRestTemplate(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Gives a list of statistics.
     *
     * @param username username parameter.
     * @return returns a list of statistics.
     */
    public List<classes.Statistics> getAllStatistics(final String username) {
        String url = "http://localhost:8080/statistics";
        List<classes.Statistics> res = restTemplate.postForObject(
                url, username, List.class);
        System.out.println(res);
        ObjectMapper mapper = new ObjectMapper();
        List<classes.Statistics> result = mapper.convertValue(
                res, new TypeReference<List<classes.Statistics>>() {
                });
        return result;
    }

    /**
     * Returns a list of statis by type.
     *
     * @param username username parameter.
     * @param type     type parmaeter.
     * @return stats.
     */
    public List<Statistics> getStatsByType(
            final String username, final String type) {
        String url = "http://localhost:8080/stats?username=" + username;
        List<classes.Statistics> res = restTemplate.postForObject(
                url, type, List.class);
        System.out.println(res);
        ObjectMapper mapper = new ObjectMapper();
        List<classes.Statistics> result = mapper.convertValue(
                res, new TypeReference<List<classes.Statistics>>() {
                });
        return result;
    }

    /**
     * returns people matching names.
     *
     * @param regex regualar expression.
     * @return list of usernames.
     */
    public List<String> findUsersByRegex(final String regex) {
        String url = "http://localhost:8080/regex";
        List<String> res = restTemplate.postForObject(url, regex, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<String> result = mapper.convertValue(
                res, new TypeReference<List<String>>() {
                });
        return result;
    }

    /**
     * returns people whose usernames match the patters.
     *
     * @param regex    the pattern.
     * @param username to identify who is calling the method.
     * @return the list of all people that can be added as friends.
     */
    public List<String> findUsersByRegex(final String regex,
                                         final String username) {
        String url = "http://localhost:8080/regex2?username=" + username;
        List<String> res = restTemplate.postForObject(url, regex, List.class);
        ObjectMapper mapper = new ObjectMapper();
        List<String> result = mapper.convertValue(
                res, new TypeReference<List<String>>() {
                });
        return result;
    }
}