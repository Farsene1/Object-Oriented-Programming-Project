package classes;

/**
 * Transport class.
 */
public class Transport {
    /**
     * Variables.
     */
    private String username;
    private String type;
    private double distance;
    private int score;
    private String date;

    /**
     * Empty Constructor.
     */
    public Transport() {

    }

    /**
     * Transport Object Constructor.
     *
     * @param username user name parameter
     * @param type     type parameter
     * @param distance distance
     * @param score    score
     * @param date     date
     */
    public Transport(final String username,
                     final String type,
                     final double distance,
                     final int score,
                     final String date) {
        this.username = username;
        this.type = type;
        this.distance = distance;
        this.score = score;
        this.date = date;


    }

    /**
     * Get username.
     *
     * @return returns username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username username parameter
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * GETS TYPE.
     *
     * @return returns type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type type parameter.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets distance.
     *
     * @return gets distance.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * sets distance.
     *
     * @param distance distance parameter
     */
    public void setDistance(final double distance) {
        this.distance = distance;
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
     * sets score.
     *
     * @param score score parameter.
     */
    public void setScore(final int score) {
        this.score = score;
    }

    /**
     * Gets date.
     *
     * @return returns date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date date parameter.
     */
    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * Calulations for score.
     *
     * @param type     parameter type
     * @param distance distance parameter
     * @return returns a score.
     */
    public int calculator(final String type, final double distance) {
        int score = 0;
        if (type.equals("Train")) {
            score = (int) Math.round(10 * distance);
        }
        if (type.equals("Car")) {
            score = (int) Math.round(-25 * distance);
        }
        if (type.equals("Bicycle")) {
            score = (int) Math.round(150 * distance);
        }
        if (type.equals("Airplane")) {
            score = (int) Math.round(-30 * distance);
        }
        if (type.equals("Walking")) {
            score = (int) Math.round(200 * distance);
        }
        return score;
    }

}
