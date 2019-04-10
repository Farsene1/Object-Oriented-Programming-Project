import client.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest extends Calculator {

    @Test
    public void lightscoreCalcTest() {
        int score = lightscoreCalc(1, false);
        assertEquals(-46, score);
    }

    @Test
    public void lightscoreCalcTestSolar() {
        int score = lightscoreCalc(1, true);
        assertEquals(69, score);
    }

    @Test
    public void htScoreCalcTest() {
        int score = htScoreCalc(1);
        assertEquals(-23, score);
    }

    @Test
    public void meatScoreCalcTest() {
        int score = meatScoreCalc(100);
        assertEquals(-5, score);
    }

    @Test
    public void transportCalcTestTrain() {
        int score = transportCalc("Train", 1);
        assertEquals(16, score);
    }

    @Test
    public void transportCalcTestCar() {
        int score = transportCalc("Car", 1);
        assertEquals(-20, score);
    }

    @Test
    public void transportCalcTestAirplane() {
        int score = transportCalc("Airplane", 1);
        assertEquals(-100, score);
    }

    @Test
    public void transportCalcTestWalking() {
        int score = transportCalc("Walking", 1);
        assertEquals(22, score);
    }
}