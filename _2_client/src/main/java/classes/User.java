package classes;


import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Set;

/**
 * User table entity generated.
 */
public class User implements Serializable {
    /**
     * Primary key id generated.
     *
     * @param id id parameter.
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
    /**
     * Sets activity.
     */
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
     * @param username username parameter.
     * @param hash hash parameter.
     */
    public User(final String username, final String hash) {
        this.username = username;
        this.hash = hash;
    }

    /**
     * Getter for username.
     * @return  username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username.
     *
     * @param username username parameter.
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Returns a string for hash.
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Setter for hash.
     *
     * @param hash hash parameter.
     */
    public void setHash(final String hash) {
        this.hash = hash;
    }

    /**
     * Getter for food score.
     * @return food
     */
    public Integer getFoodScore() {
        return food;
    }

    /**
     * setter for food.
     * @param food  food paramter.
     */
    public void setFoodScore(final Integer food) {
        this.food = food;
    }

    /**
     * GETS electricity score.
     * @return electricity
     */
    public Integer getElectricityScore() {
        return electricity;
    }

    /**
     * Setter for waterFootprint.
     *
     * @param electricity electricity parameter.
     */
    public void setElectricityScore(final Integer electricity) {
        this.electricity = electricity;
    }

    /**
     * Getter for transportFootprint.
     * @return  transport.
     */
    public Integer getTransportScore() {
        return transport;
    }

    /**
     * Setter for transportFootprint.
     *
     * @param transport transport parameter.
     */
    public void setTransportScore(final Integer transport) {
        this.transport = transport;
    }

    /**
     * Gets  polar score.
     * @return polarScore.
     */
    public Integer getPolarScore() {
        return polarScore;
    }

    /**
     * Setter for polarScore.
     *
     * @param polarScore poalr score parameter.
     */
    public void setPolarScore(final Integer polarScore) {
        this.polarScore = polarScore;
    }

    /**
     * Gets the badge.
     * @return badge
     */

    public Integer getBadge() {
        return badge;
    }

    /**
     * Sets the badge.
     * @param badge badge parameter.
     */
    public void setBadge(final Integer badge) {
        this.badge = badge;
    }

    /**
     * To string method.
     * @return string
     */
    @Override
    public String toString() {
        return "User{" + "username='" + username
                + '\'' + ", hash='" + hash + '\'' + ", " + "badge= " + badge + "}";
    }

    //
}