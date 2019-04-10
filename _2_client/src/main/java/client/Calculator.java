package client;

public class Calculator {
    // All values are loosely based on this calculator
    // https://www.carbonfootprint.com/calculator.aspx
    // Fod data taken from
    // http://www.greeneatz.com/foods-carbon-footprint.html
    // 1 pt is approximately 10 grams of CO2
    public static int lightscoreCalc(final int light_kWh, final boolean solar) {
        int lightscore;
        if (solar) {
            //1.5x multiplier bonus for solar panels
            lightscore = (int) Math.round(light_kWh * (46*1.5));
        }
        else {
            lightscore = light_kWh * -46;
        }
        return lightscore;
    }

    public static int htScoreCalc(int heat_kWh) {
        int htScore = -23 * heat_kWh;
        return htScore;
    }

    public static int meatScoreCalc(int grams) {
        return (int) Math.round(-0.05 * grams);
    }

    public static int transportCalc(final String type, final double distance) {
        int score = 0;
        if (type.equals("Train")) {
            // Footprint of negative effect of going by train compensated by positive effect of not going by car
            score = (int) Math.round(-4 * distance + 20 * distance);
        }
        if (type.equals("Car")) {
            score = (int) Math.round(-20 * distance);
        }
        if (type.equals("Bicycle")) {
            score = (int) Math.round(22 * distance);
        }
        if (type.equals("Airplane")) {
            score = (int) Math.round(-100 * distance);
        }
        if (type.equals("Walking")) {
            score = (int) Math.round(22 * distance);
        }
        return score;
    }
}
