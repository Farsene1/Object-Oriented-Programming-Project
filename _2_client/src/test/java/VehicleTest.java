package classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {


    //Getters Testing

    @Test
    public void getUsername() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        assertEquals("user",vehicle.getUsername());
    }

    @Test
    public void getType() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        assertEquals("car",vehicle.getType());
    }


    @Test
    public void getDistance() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        assertEquals(14,vehicle.getDistance());
    }

    @Test
    public void getScore() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        assertEquals(4,vehicle.getScore());
    }



    @Test
    public void getDate() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        assertEquals("10/5",vehicle.getDate());
    }

    //Setters Testing



    @Test
    public void SetUsername() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        vehicle.setUsername("kostas");
        assertEquals("kostas",vehicle.getUsername());
    }

    @Test
    public void SetType() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        vehicle.setType("train");
        assertEquals("train",vehicle.getType());
    }

    @Test
    public void SetDistance() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        vehicle.setDistance(16);
        assertEquals(16,vehicle.getDistance());
    }

    @Test
    public void SetScore() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        vehicle.setScore(16);
        assertEquals(16,vehicle.getScore());
    }

    @Test
    public void SetDate() {
        Vehicle vehicle = new Vehicle("user","car",14,4,"10/5");
        vehicle.setDate("10/4");
        assertEquals("10/4",vehicle.getDate());
    }
    //Calculator Testing
    @Test
    public void CalculatorTrain(){
        Vehicle vehicle = new Vehicle("user","Train",14,4,"10/5");
        vehicle.setScore(vehicle.calculator(vehicle.getType(),vehicle.getDistance()));
        assertEquals(357,vehicle.getScore());
    }

    @Test
    public void CalculatorCar(){
        Vehicle vehicle = new Vehicle("user","Car",14,4,"10/5");
        vehicle.setScore(vehicle.calculator(vehicle.getType(),vehicle.getDistance()));
        assertEquals(214,vehicle.getScore());
    }
    @Test
    public void CalculatorBicycle(){
        Vehicle vehicle = new Vehicle("user","Bicycle",14,4,"10/5");
        vehicle.setScore(vehicle.calculator(vehicle.getType(),vehicle.getDistance()));
        assertEquals(1071,vehicle.getScore());
    }

    @Test
    public void CalculatorAirplane(){
        Vehicle vehicle = new Vehicle("user","Airplane",14,4,"10/5");
        vehicle.setScore(vehicle.calculator(vehicle.getType(),vehicle.getDistance()));
        assertEquals(285,vehicle.getScore());
    }

    @Test
    public void CalculatorNull(){
        Vehicle vehicle = new Vehicle("user","",14,4,"10/5");
        vehicle.setScore(vehicle.calculator(vehicle.getType(),vehicle.getDistance()));
        assertEquals(0,vehicle.getScore());
    }

}
