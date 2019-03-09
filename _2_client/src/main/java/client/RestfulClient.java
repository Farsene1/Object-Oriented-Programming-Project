package client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestfulClient {
    RestTemplate restTemplate;

    public RestfulClient() {
        restTemplate = new RestTemplate();
    }

    /**
     * get Entity
     */
    public ResponseEntity<User> getEntity() {
        System.out.println("Beginning /GET request!");
        String getUrl = "http://localhost:8080/get?username=Florentin&hash=abcdef";
        ResponseEntity<User> getResponse = restTemplate.getForEntity(getUrl, User.class); // User user = restTemplate.getForObject(getUrl, User.class); WHICH ONE IS BETTER? // DIFFERENT RESPONSES
        System.out.println(getResponse.toString());
        return getResponse;
    }

    /**
     * this method sends a registration request and receives a message - POSITIVE OR NEGATIVE -
     * @param user
     * @return
     */
    public ResponseEntity<String> postEntity(User user){
        System.out.println("Beginning /POST request");
        String postUrl = "http://localhost:8080/post";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for Post Request: " + postResponse.getBody());
        return postResponse;
    }

    /**
     * this method sends a registration request and receives a message - POSITIVE OR NEGATIVE -
     * @param user
     * @return
     */
    public String login(User user){
        System.out.println("Beginning /login request");
        String postUrl = "http://localhost:8080/login";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for Post Request: " + postResponse.getBody());
        return postResponse.getBody();
    }

}