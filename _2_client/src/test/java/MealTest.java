import classes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealTest {

    private Meal meal;

    @Test
    public void testAll(){
        meal = new Meal("food","vegan");
        assertEquals("vegan",meal.getFoodType());
        assertEquals("food", meal.getFood());
    }

    @Test
    public void testSetters(){
        meal = new Meal();
        meal.setFoodType("meat");
        meal.setFood("food");
        assertEquals("meat",meal.getFoodType());
        assertEquals("food", meal.getFood());
    }

}
