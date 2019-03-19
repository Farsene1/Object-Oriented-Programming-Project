import hello.Food;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FoodTest {
    Food food1;

    @Before
    public void setUp(){food1 = new Food("Julian", "vegan", "19-03-2019", 500);}

    @Test
    public void constrTest(){assertEquals(true, food1 != null);}

    @Test
    public void getSetTest(){
        assertEquals("Julian", food1.getUsername());
        assertEquals("vegan", food1.getMealType());
        assertEquals("19-03-2019", food1.getDate());
        assertEquals((Integer) 500, food1.getScore());
        food1.setUsername(food1.getUsername());
        food1.setMealType("meal type");
        food1.setDate("20-03-2019");
        food1.setScore(500);
    }

    @Test
    public void toStringTest(){
        Food f = new Food();
        f.setId(1);
        assertEquals(f.getId()+0,1);

        assertTrue(food1.toString().contains("vegan"));
    }
}
