package classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * User table entity generated.
 */
public class User implements Serializable {
    /**
     * Primary key id generated.
     *
     * @param id
     */
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
     * Attribute polarScore declared as type integer.
     */
    private Integer polarScore = 0;
    /**
     * Attribute date declared as type timestamp.
     */
    private Integer badge = 1;

    @OneToMany
    @JoinColumn(name = "userId")
    private Set<Activity> activities;

    /**
     * Empty constructor declaration for user.
     */
    public User() {
    }

    /**
     * Constructor declaration for user.
     *
     * @param username
     * @param hash
     */
    public User(String username, String hash) {
        this.username = username;
        this.hash = hash;
    }

    /**
     * Getter for username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username.
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for hash.
     */
    public String getHash() {
        return hash;
    }

    /**
     * Setter for hash.
     *
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Getter for foodFootprint.
     */
    public Integer getFoodScore() {
        return food;
    }

    /**
     *
     * @param food
     */
    public void setFoodScore(Integer food) {
        this.food = food;
    }

    /**
     * Getter for waterFootprint.
     */
    public Integer getElectricityScore() {
        return electricity;
    }

    /**
     * Setter for waterFootprint.
     *
     * @param electricity
     */
    public void setElectricityScore(Integer electricity) {
        this.electricity = electricity;
    }

    /**
     * Getter for transportFootprint.
     */
    public Integer getTransportScore() {
        return transport;
    }

    /**
     * Setter for transportFootprint.
     *
     * @param transport
     */
    public void setTransportScore(Integer transport) {
        this.transport = transport;
    }

    /**
     * Getter for polarScore.
     */
    public Integer getPolarScore() {
        return polarScore;
    }

    /**
     * Setter for polarScore.
     *
     * @param polarScore
     */
    public void setPolarScore(Integer polarScore) {
        this.polarScore = polarScore;
    }
    /**
     * Getter for date.
     */

    public Integer getBadge() {
        return badge;
    }

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * toString method for user.
     */
    @Override
    public String toString() {
        return "User{" + "username='" + username
                + '\'' + ", hash='" + hash + '\'' + ", " + "badge= " + badge + "}";
    }

    //
}