package classes;

/**
 * Electricity object Class.
 */
public class Electricity {
    /**
     * Heat Hours.
     */
    private int heatHours;
    /**
     * light Hours.
     */
    private int lightHours;
    /**
     * Solar variable.
     */
    private boolean solar;
    /**
     * Score.
     */
    private int score;

    /**
     * Empty Constructor.
     */
    public Electricity() {

    }

    /**
     * Object electricity constructor.
     *
     * @param heatHours  heathours parameter.
     * @param lightHours light Hours parameter.
     * @param solar      solar hours parameter.
     */
    public Electricity(final int heatHours, final int lightHours, final boolean solar) {
        this.heatHours = heatHours;
        this.lightHours = lightHours;
        this.solar = solar;
    }

    /**
     * Gets heat hours.
     *
     * @return heat hours.
     */
    public int getheatHours() {
        return heatHours;
    }

    /**
     * SSets heat hours.
     *
     * @param hrs hours.
     */
    public void setheatHours(final int hrs) {
        this.heatHours = hrs;
    }

    /**
     * Gets light Hours.
     *
     * @return returns lightHours.
     */
    public int getlightHours() {
        return lightHours;
    }

    /**
     * Sets lightHours.
     *
     * @param hrs hours parameter.
     */
    public void setlightHours(final int hrs) {
        this.lightHours = hrs;
    }

    /**
     * Gets solar option.
     *
     * @return solar.
     */
    public boolean getSolar() {
        return solar;
    }

    /**
     * Sets solar.
     *
     * @param solar solar param.
     */
    public void setSolar(final boolean solar) {
        this.solar = solar;
    }

    /**
     * Gets score.
     *
     * @return returns score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score score parameter.
     */
    public void setScore(final int score) {
        this.score = score;
    }

}
