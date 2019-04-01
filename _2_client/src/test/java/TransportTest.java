import classes.Transport;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {


    //Getters Testing

    @Test
    public void getUsername() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        assertEquals("user", transport.getUsername());
    }

    @Test
    public void getType() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        assertEquals("car", transport.getType());
    }


    @Test
    public void getDistance() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        assertEquals(14, transport.getDistance(), 0);
    }

    @Test
    public void getScore() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        assertEquals(4, transport.getScore());
    }



    @Test
    public void getDate() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        assertEquals("10/5", transport.getDate());
    }

    //Setters Testing



    @Test
    public void SetUsername() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        transport.setUsername("kostas");
        assertEquals("kostas", transport.getUsername());
    }

    @Test
    public void SetType() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        transport.setType("train");
        assertEquals("train", transport.getType());
    }

    @Test
    public void SetDistance() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        transport.setDistance(16);
        assertEquals(16, transport.getDistance(), 0);
    }

    @Test
    public void SetScore() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        transport.setScore(16);
        assertEquals(16, transport.getScore());
    }

    @Test
    public void SetDate() {
        Transport transport = new Transport("user","car",14,-350,"10/5");
        transport.setDate("10/4");
        assertEquals("10/4", transport.getDate());
    }
    //Calculator Testing
    @Test
    public void CalculatorTrain(){
        Transport transport = new Transport("user","Train",14,-350,"10/5");
        transport.setScore(transport.calculator(transport.getType(), transport.getDistance()));
        assertEquals(357, transport.getScore());
    }

    @Test
    public void CalculatorCar(){
        Transport transport = new Transport("user","Car",14,-350,"10/5");
        transport.setScore(transport.calculator(transport.getType(), transport.getDistance()));
        assertEquals(214, transport.getScore());
    }
    @Test
    public void CalculatorBicycle(){
        Transport transport = new Transport("user","Bicycle",14,-350,"10/5");
        transport.setScore(transport.calculator(transport.getType(), transport.getDistance()));
        assertEquals(1071, transport.getScore());
    }

    @Test
    public void CalculatorAirplane(){
        Transport transport = new Transport("user","Airplane",14,-350,"10/5");
        transport.setScore(transport.calculator(transport.getType(), transport.getDistance()));
        assertEquals(286, transport.getScore());
    }

    @Test
    public void CalculatorNull(){
        Transport transport = new Transport("user","",14,-350,"10/5");
        transport.setScore(transport.calculator(transport.getType(), transport.getDistance()));
        assertEquals(0, transport.getScore());
    }

}
