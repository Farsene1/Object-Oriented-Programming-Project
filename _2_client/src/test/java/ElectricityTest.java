import classes.Electricity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Test
    public void getheatHours() {
        Electricity electricity = new Electricity(1,2,true);
        Electricity electricity1 = new Electricity();
        assertEquals(1, electricity.getheatHours());
    }

    @Test
    public void setHeat_hrs() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setheatHours(3);
        assertEquals(3, electricity.getheatHours());
    }

    @Test
    public void getlightHours() {
        Electricity electricity = new Electricity(1,2,true);
        assertEquals(2, electricity.getlightHours());
    }

    @Test
    public void setlightHours() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setlightHours(3);
        assertEquals(3, electricity.getlightHours());
    }

    @Test
    public void getSolar() {
        Electricity electricity = new Electricity(1,2,true);
        assertEquals(true, electricity.getSolar());
    }

    @Test
    public void setSolar() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setSolar(false);
        assertEquals(false, electricity.getSolar());
    }

    @Test
    public void getScore() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setScore(1);
        assertEquals(1, electricity.getScore());
    }

    @Test
    public void setScore() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setScore(1);
        assertEquals(1, electricity.getScore());
    }
}