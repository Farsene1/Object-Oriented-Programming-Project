package classes;

import java.io.Serializable;

/**
 * this is the statistics class, converted into table.
 */

public class Statistics implements Serializable {
    /**
     * id.
     */
    private Integer id;
    /**
     * username attr.
     */
    private String username;
    /**
     * type attr CAN BE -> ALL or FOOD or TRANSPORT or ELECTRICITY.
     */
    private String type;
    /**
     * score attr.
     */
    private Integer score;
    /**
     * date attr.
     */
    private String date;

    /**
     * default constructor.
     */
    public Statistics() {
    }

    /**
     * Stats constructor.
     *
     * @param score score parmater.
     * @param date  date parameter.
     */
    public Statistics(final String username, final Integer score, final String date) {
        this.username = username;
        this.score = score;
        this.date = date;
    }

    /**
     * getId.
     *
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id.
     *
     * @param id id parameter.
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * getUsername.
     *
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * set username.
     *
     * @param username username parameter.
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * getScore.
     *
     * @return score.
     */
    public Integer getScore() {
        return score;
    }

    /**
     * set score.
     *
     * @param score score parameter.
     */
    public void setScore(final Integer score) {
        this.score = score;
    }

    /**
     * getDate.
     *
     * @return date.
     */
    public String getDate() {
        return date;
    }

    /**
     * set date.
     *
     * @param date date paramter.
     */
    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * returns type.
     *
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * sets type.
     *
     * @param type type parameter.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * To string stats.
     *
     * @return returns a string.
     */
    public String toString() {
        return "Statistics("
                + ", username='" + username + '\''
                + ", score='" + score + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
