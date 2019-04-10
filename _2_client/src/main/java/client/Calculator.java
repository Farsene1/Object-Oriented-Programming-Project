package client;

public class Calculator {
    // All values are loosely based on this calculator
    // https://www.carbonfootprint.com/calculator.aspx
    // Fod data taken from
    // http://www.greeneatz.com/foods-carbon-footprint.html
    // 1 pt is approximately 10 grams of CO2

    /**
     * Calculator score.
     *
     * @param lightkWh parameter light.
     * @param solar    solar paramater boolean.
     * @return htScore return int for score.
     */
    public static int lightscoreCalc(final int lightkWh, final boolean solar) {
        int lightscore;
        if (solar) {
            //1.5x multiplier bonus for solar panels
            lightscore = (int) Math.round(lightkWh * (46 * 1.5));
        } else {
            lightscore = lightkWh * -46;
        }
        return lightscore;
    }

    /**
     * Heat score.
     *
     * @param heatkWh heat kwh parameter.
     * @return htScore
     */
    public static int htScoreCalc(int heatkWh) {
        int htScore = -23 * heatkWh;
        return htScore;
    }

    /**
     * Meat score calculator.
     *
     * @param grams grams parameter.
     * @return return int
     */
    public static int meatScoreCalc(int grams) {
        return (int) Math.round(-0.05 * grams);
    }

    /**
     * transport calc.
     *
     * @param type     type parameter.
     * @param distance distance parameter.
     * @return score
     */
    public static int transportCalc(final String type, final double distance) {
        int score = 0;
        if (type.equals("Train")) {
            // Footprint of negative effect
            // of going by train compensated
            // by positive effect of not going by car
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
