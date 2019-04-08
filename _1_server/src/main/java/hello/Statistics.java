package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
     *
     * @param score2    score parameter.
     * @param date2     date paramater.
     * @param username2 username parameter.
     */
    public Statistics(final String username2,
                      final Integer score2,
                      final String date2) {
        this.username = username2;
        this.score = score2;
        this.date = date2;
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
     * @param id2 parameter id.
     */
    public void setId(final Integer id2) {
        this.id = id2;
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
     * @param username2 username parameter.
     */
    public void setUsername(final String username2) {
        this.username = username2;
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
     * @param score2 score parameter.
     */
    public void setScore(final Integer score2) {
        this.score = score2;
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
     * @param date2 date parameter.
     */
    public void setDate(final String date2) {
        this.date = date2;
    }

    /**
     * Get type method.
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type method.
     * @param type2 type parameter.
     */
    public void setType(final String type2) {
        this.type = type2;
    }

    /**
     * to string method.
     *
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
