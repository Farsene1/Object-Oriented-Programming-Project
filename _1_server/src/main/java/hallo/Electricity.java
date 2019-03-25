package hallo;

import javax.persistence.*;

/**
 * table electricity.
 */
@Table(name = "electricity")
@Entity
public class Electricity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    /**
     * id.
     */
    private Integer id;

    /**
     * username.
     */
    private String username;

    /**
     * heating hours.
     */
    private Integer heatingHrs;

    /**
     * light hours.
     */
    private Integer lightHrs;

    /**
     * solar panels.
     */
    boolean solarPanels;

    /**
     * date string.
     */
    private String date;

    /**
     * score.
     */
    private Integer score;

    /**
     * default constructor.
     */
    public Electricity() {
    }

    /**
     * actual constructor.
     *
     * @param username
     * @param heatingHrs
     * @param lightHrs
     * @param solarPanels
     * @param date
     * @param score
     */
    public Electricity(String username, Integer heatingHrs, Integer lightHrs,
                       boolean solarPanels, String date, int score) {
        this.username = username;
        this.heatingHrs = heatingHrs;
        this.lightHrs = lightHrs;
        this.solarPanels = solarPanels;
        this.date = date;
        this.score = score;
    }

    /**
     * @return int.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return int.
     */
    public Integer getHeatingHrs() {
        return heatingHrs;
    }

    /**
     * @param heatingHrs
     */
    public void setHeatingHrs(Integer heatingHrs) {
        this.heatingHrs = heatingHrs;
    }

    /**
     * @return int.
     */
    public Integer getLightHrs() {
        return lightHrs;
    }

    /**
     * @param lightHrs
     */
    public void setLightHrs(Integer lightHrs) {
        this.lightHrs = lightHrs;
    }

    /**
     * @return boolean.
     */
    public Boolean getSolarPanels() {
        return solarPanels;
    }

    /**
     * @param solarPanels
     */
    public void setSolarPanels(boolean solarPanels) {
        this.solarPanels = solarPanels;
    }

    /**
     * @return String.
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return int.
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return String of obj.
     */
    public String toString() {
        return "Food{" + "username='" + username
                + '\'' + ", heatingHrs='" + heatingHrs + '\''
                + '\'' + ", lightHrs='" + lightHrs + '\''
                + '\'' + ", solarPanels='" + solarPanels + '\''
                + '\'' + ", date='" + date + '\''
                + '\'' + ", score='" + score + '\''
                + '}';
    }
}


