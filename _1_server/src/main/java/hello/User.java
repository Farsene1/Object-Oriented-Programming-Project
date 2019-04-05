package hello;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User table entity generated.
 */
@Table(name = "users")
@Entity
public class User implements Serializable {
    /**
     * Primary key id generated.
     *
     * @param id id parameter.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    /**
     * Attribute username declared as type string.
     */
    private String username;
    /**
     * Attribute hash declared as type string.
     */
    private String hash;
    /**
     * Attribute foodFootprint declared as type integer.
     */
    private Integer food = 0;
    /**
     * Attribute waterFootprint declared as type integer.
     */
    private Integer electricity = 0;
    /**
     * Attribute transportFootprint declared as type integer.
     */
    private Integer transport = 0;
    /**
     * attribute for solar panels.
     */
    private boolean solar_panels = false;
    /**
     * Attribute polarScore declared as type integer.
     */
    private Integer polarScore = 0;
    /**
     * Attribute date declared as type timestamp.
     */
    private Integer badge = 1;

    /**
     * Empty constructor declaration for user.
     */
    public User() {
    }

    /**
     * Constructor declaration for user.
     *
     * @param username username parameter.
     * @param hash hash parameter.
     */
    public User(String username, String hash) {
        this.username = username;
        this.hash = hash;
    }

    /**
     * get username.
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username.
     *
     * @param username username parameter.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * getter for hash.
     * @return hash.
     */
    public String getHash() {
        return hash;
    }

    /**
     * Setter for hash.
     *
     * @param hash hash parameter.
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * get food score.
     * @return food
     */
    public Integer getFoodScore() {
        return food;
    }

    /**
     * set food.
     * @param food food score.
     */
    public void setFoodScore(Integer food) {
        this.food = food;
    }

    /**
     * get electricity score.
     * @return electric score.
     */
    public Integer getElectricityScore() {
        return electricity;
    }

    /**
     * Setter for waterFootprint.
     *
     * @param electricity electricity score.
     */
    public void setElectricityScore(Integer electricity) {
        this.electricity = electricity;
    }

    /**
     * get transport score.
     * @return transport score.
     */
    public Integer getTransportScore() {
        return transport;
    }

    /**
     * Setter for transportFootprint.
     *
     * @param transport transport score.
     */
    public void setTransportScore(Integer transport) {
        this.transport = transport;
    }

    /**
     * get polar score.
     * @return polar score.
     */
    public Integer getPolarScore() {
        return polarScore;
    }

    /**
     * Setter for polarScore.
     *
     * @param polarScore polar score parameter.
     */
    public void setPolarScore(Integer polarScore) {
        this.polarScore = polarScore;
    }

    /**
     * get badge.
     * @return returns badge.
     */

    public Integer getBadge() {
        return badge;
    }

    /**
     * sets badge.
     * @param badge parameter.
     */
    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * checks if the user has solar panels.
     * @return true or false.
     */
    public boolean isSolar() {
        return solar_panels;
    }

    /**
     * sets to true or false.
     */
    public void setSolar(boolean solar_panels) {
        this.solar_panels = solar_panels;
    }

    /**
     * to string method.
     * @return the string.
     */


    @Override
    public String toString() {
        return "User{" + "username='" + username
                + '\'' + ", hash='" + hash + '\'' + '}';
    }
}