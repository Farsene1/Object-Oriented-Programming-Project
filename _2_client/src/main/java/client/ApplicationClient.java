package client;

public class ApplicationClient {

    public static void main(String[] args) {
        RestfulClient restfulClient = new RestfulClient();

        restfulClient.getEntity();

<<<<<<< HEAD
//        User user1 = new User("Florentin", "123abc");
//        User user2 = new User("Hashim","456def");
//
//        restfulClient.postEntity(user1);
//        restfulClient.postEntity(user2);

=======
        User user1 = new User("Florentin", "123abc");
        User user2 = new User("Hashim","456def");

        restfulClient.postEntity(user1);
        restfulClient.postEntity(user2);
>>>>>>> BRANCH_FIX
    }
}
