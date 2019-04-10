import classes.Transport;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {


    //Getters Testing

    @Test
    public void getUsername() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        Transport transport1 = new Transport();
        assertEquals("user", transport.getUsername());
    }

    @Test
    public void getType() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        assertEquals("car", transport.getType());
    }


    @Test
    public void getDistance() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        assertEquals(14, transport.getDistance(), 0);
    }

    @Test
    public void getScore() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        assertEquals(-350, transport.getScore());
    }


    @Test
    public void getDate() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        assertEquals("10/5", transport.getDate());
    }

    //Setters Testing


    @Test
    public void SetUsername() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        transport.setUsername("kostas");
        assertEquals("kostas", transport.getUsername());
    }

    @Test
    public void SetType() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        transport.setType("train");
        assertEquals("train", transport.getType());
    }

    @Test
    public void SetDistance() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        transport.setDistance(16);
        assertEquals(16, transport.getDistance(), 0);
    }

    @Test
    public void SetScore() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        transport.setScore(16);
        assertEquals(16, transport.getScore());
    }

    @Test
    public void SetDate() {
        Transport transport = new Transport("user", "car", 14, -350, "10/5");
        transport.setDate("10/4");
        assertEquals("10/4", transport.getDate());
    }

}
