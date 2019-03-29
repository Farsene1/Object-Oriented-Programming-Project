package hello;

import javax.persistence.*;

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
    public Statistics() { }
    /**
     * @param score
     * @param date
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
    public Integer getId() {return id;}
    /**
     * set id.
     *
     * @param id
     */
    public void setId(Integer id){this.id = id;}
    /**
     * getUsername.
     *
     * @return username.
     */
    public String getUsername(){return username;}
    /**
     * set username.
     *
     * @param username
     */
    public void setUsername(String username){this.username = username;}
    /**
     * getScore.
     *
     * @return score.
     */
    public Integer getScore(){return score;}
    /**
     * set score.
     *
     * @param score
     */
    public void setScore(Integer score){this.score = score;}
    /**
     * getDate.
     *
     * @return date.
     */
    public String getDate(){return date;}
    /**
     * set date.
     *
     * @param date
     */
    public void setDate(String date){this.date = date;}

    public String toString(){
        return "Statistics("
                + ", username='" + username + '\''
                + ", score='" + score + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
