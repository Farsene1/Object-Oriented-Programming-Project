
import client.*;
import javafx.scene.layout.HBox;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AchievementsTest {

    /**
     * Declare HBoxes for testing.
     */
    HBox polarBox;
    HBox foodBox;
    HBox transportBox;
    HBox electricityBox;

    /**
     * Test method for class PolarAchievements - getPolarBox.
     */
    @Test
    public void testGetPolarBox(){
     setPolarBox(polarBox);
     assertEquals(polarBox, AchievementsPolar.getPolarBox());
    }

    /**
     * Test method for class FoodAchievements - getFoodBox.
     */
    @Test
    public void testGetFoodBox(){
        setFoodBox(foodBox);
        assertEquals(foodBox, AchievementsFood.getFoodBox());
    }

    /**
     * Test method for class TransportAchievements - getTransportBox.
     */
    @Test
    public void testGetTransportBox(){
        setTransportBox(transportBox);
        assertEquals(transportBox, AchievementsTransport.getTransportBox());
    }

    /**
     * Test method for class ElectricityAchievements - getElectricityBox.
     */
    @Test
    public void testGetElectricityBox(){
        setElectricityBox(electricityBox);
        assertEquals(electricityBox, AchievementsElectricity.getElectricityBox());
    }

    /**
     * Setting HBoxes for testing.
     */
    public void setPolarBox(HBox polarBox) {
        this.polarBox = polarBox;
    }
    public void setFoodBox(HBox foodBox) {
        this.foodBox = foodBox;
    }
    public void setTransportBox(HBox transportBox) {
        this.transportBox = transportBox;
    }
    public void setElectricityBox(HBox electricityBox) {
        this.electricityBox = electricityBox;
    }
}
