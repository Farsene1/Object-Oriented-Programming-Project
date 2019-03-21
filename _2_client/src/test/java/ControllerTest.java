//import classes.Activity;
//import classes.Controller;
//import classes.RestfulClient;
//import classes.User;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.ArrayList;
//
//import static classes.Controller.checkEmail;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//public class ControllerTest {
//
//    private User user;
//
//    @Autowired
//    private Controller controller;
//
//    @MockBean
//    private RestfulClient restfulClient = Mockito.mock(RestfulClient.class);
//
//
//    @Before
//    public void setUp(){
//        controller = new Controller();
//        controller.setRestfulClient(restfulClient);
//        user = new User("admin","root");
//        controller.getRestfulClient();
//    }
//
//    @Test
//    public void getUpdatesTest(){
//        Mockito.when(restfulClient.getUpdates(user)).thenReturn(user);
//        assertEquals(user.getUsername(),controller.getUpdates(user).getUsername());
//    }
//
//    @Test
//    public void getAllActivitiesTest(){
//        Mockito.when(restfulClient.getAllActivities(user)).thenReturn(new ArrayList<>());
//        assertEquals(0,controller.getAllActivities(user).size());
//    }
//
//    @Test
//    public void sendFoodTest(){
//        Activity a = new Activity();
//        Mockito.when(restfulClient.addActivity(a)).thenReturn(new ArrayList<>());
//        assertEquals(0,controller.sendFood(a).size());
//    }
//
//    @Test
//    public void signUpTest(){
//        Mockito.when(restfulClient.postEntity(user)).thenReturn("OK");
//        assertEquals("OK", controller.signUp(user));
//    }
//
//    @Test
//    public void loginTest(){
//        Mockito.when(restfulClient.login(user)).thenReturn("OK");
//        assertEquals("OK",controller.login(user));
//    }
//
//    @Test
//    public void sendMealTest(){
//        Mockito.when(restfulClient.activity(user)).thenReturn("OK");
//        controller.sendMeal(user,12);
//    }
//
//    @Test
//    public void sendTest(){
//        controller.sendWater(user,10);
//        controller.sendTransport(user,10);
//    }
//
//    @Test
//    public void checkEmailTest(){
//        String email1 = "sfss";
//        String email2= "sayfgmaul@gmail.com";
//        assertEquals(checkEmail(email1), false);
//        assertEquals(checkEmail(email2), true);
//        assertTrue(checkEmail("email@email.com"));
//    }
//
//}
