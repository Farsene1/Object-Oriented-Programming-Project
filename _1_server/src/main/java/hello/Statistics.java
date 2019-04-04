package hello;

import javax.persistence.*;

/**
 * Statistics table.
 */
@Entity
@Table(name = "statistics")
/**
 * this is the statistics class, converted into table.
 */

public class Statistics {
    /**
     * id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
     * statistics constructor.
     * @param score score parameter.
     * @param date date paramater.
     * @param username  username parameter.
     */
    public Statistics(String username, Integer score, String date) {
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
     * @param id parameter id.
     */
    public void setId(Integer id) {
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
    public void setUsername(String username) {
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
    public void setScore(Integer score) {
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
     * @param date date parameter.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type type parameter.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * to string method.
     * @return string
     */
    public String toString() {
        return "Statistics("
                + ", username='" + username + '\''
                + ", score='" + score + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
