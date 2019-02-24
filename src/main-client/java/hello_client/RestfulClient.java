package hello_client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestfulClient {
    RestTemplate restTemplate;

    public RestfulClient(){
        restTemplate = new RestTemplate();
    }
    /**
     * get Entity
     */
    public void getEntity() {
        System.out.println("Beginning /GET request!");
        String getUrl = "http://localhost:8080/get?id=1&name=Florentin&age=19";
        ResponseEntity<User> getResponse = restTemplate.getForEntity(getUrl, User.class); // User user = restTemplate.getForObject(getUrl, User.class); WHICH ONE IS BETTER? // DIFFERENT RESPONSES
        System.out.println(getResponse.toString());
    }

    public void postEntity(User user){
        System.out.println("Beginning /POST request");
        String postUrl = "http://localhost:8080/post";
        ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, user, String.class);
        System.out.println("Response for Post Request: " + postResponse.getBody());
    }

    public void deleteentity(User user){
        System.out.println("Beginning /DELETE request");
        String deleteUrl = String.format("http://localhost:8080/delete?id=%d&name=%s&age=%d",user.getId(),user.getName(),user.getAge());
        String result = restTemplate.delete(deleteUrl);
    }

}