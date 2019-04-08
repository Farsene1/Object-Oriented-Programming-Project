package hello;

import java.io.Serializable;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;


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
    private boolean solarpanels = false;
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
     * @param username2 username parameter.
     * @param hash2     hash parameter.
     */
    public User(final String username2, final String hash2) {
        this.username = username2;
        this.hash = hash2;
    }

    /**
     * get username.
     *
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username.
     *
     * @param username2 username parameter.
     */
    public void setUsername(final String username2) {
        this.username = username2;
    }

    /**
     * getter for hash.
     *
     * @return hash.
     */
    public String getHash() {
        return hash;
    }

    /**
     * Setter for hash.
     *
     * @param hash2 hash parameter.
     */
    public void setHash(final String hash2) {
        this.hash = hash2;
    }

    /**
     * get food score.
     *
     * @return food
     */
    public Integer getFoodScore() {
        return food;
    }

    /**
     * set food.
     *
     * @param food2 food score.
     */
    public void setFoodScore(final Integer food2) {
        this.food = food2;
    }

    /**
     * get electricity score.
     *
     * @return electric score.
     */
    public Integer getElectricityScore() {
        return electricity;
    }

    /**
     * Setter for waterFootprint.
     *
     * @param electricity2 electricity score.
     */
    public void setElectricityScore(final Integer electricity2) {
        this.electricity = electricity2;
    }

    /**
     * get transport score.
     *
     * @return transport score.
     */
    public Integer getTransportScore() {
        return transport;
    }

    /**
     * Setter for transportFootprint.
     *
     * @param transport2 transport score.
     */
    public void setTransportScore(final Integer transport2) {
        this.transport = transport2;
    }

    /**
     * get polar score.
     *
     * @return polar score.
     */
    public Integer getPolarScore() {
        return polarScore;
    }

    /**
     * Setter for polarScore.
     *
     * @param polarScore2 polar score parameter.
     */
    public void setPolarScore(final Integer polarScore2) {
        this.polarScore = polarScore2;
    }

    /**
     * get badge.
     *
     * @return returns badge.
     */

    public Integer getBadge() {
        return badge;
    }

    /**
     * sets badge.
     *
     * @param badge2 parameter.
     */
    public void setBadge(final Integer badge2) {
        this.badge = badge2;
    }

    /**
     * checks if the user has solar panels.
     *
     * @return true or false.
     */
    public boolean isSolar() {
        return solarpanels;
    }

    /**
     * sets to true or false.
     *
     * @param solarpanels2 value.
     */
    public void setSolar(final boolean solarpanels2) {
        this.solarpanels = solarpanels2;
    }

    /**
     * to string method.
     *
     * @return the string.
     */
    @Override
    public String toString() {
        return "User{" + "username='" + username
                + '\'' + ", hash='" + hash + '\'' + '}';
    }
}
