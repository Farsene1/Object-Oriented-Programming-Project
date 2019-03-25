import classes.Electricity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Test
    public void getHeat_hrs() {
        Electricity electricity = new Electricity(1,2,true);
        assertEquals(1, electricity.getHeat_hrs());
    }

    @Test
    public void setHeat_hrs() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setHeat_hrs(3);
        assertEquals(3, electricity.getHeat_hrs());
    }

    @Test
    public void getLight_hrs() {
        Electricity electricity = new Electricity(1,2,true);
        assertEquals(2, electricity.getLight_hrs());
    }

    @Test
    public void setLight_hrs() {
        Electricity electricity = new Electricity(1,2,true);
        electricity.setLight_hrs(3);
        assertEquals(3, electricity.getLight_hrs());
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