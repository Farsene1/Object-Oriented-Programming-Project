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
    public Statistics(){}
    /**
     * @param score
     * @param date
     */
    public Statistics(Integer score, String date){
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
                + ", score='" + score + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
