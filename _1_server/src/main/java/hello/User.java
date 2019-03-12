package hello;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *User table entity generated.
 *
 */
@Table(name = "users")
@Entity
public class User implements Serializable {
	/**
	 *Primary key id generated.
	 *
	 * @param id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", unique = true, nullable = false)
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
	private Integer food_footprint = 0;
	/**
	 * Attribute waterFootprint declared as type integer.
	 */
	private Integer waterFootprint = 0;
	/**
	 * Attribute transportFootprint declared as type integer.
	 */
	private Integer transportFootprint = 0;
	/**
	 * Attribute polarScore declared as type integer.
	 */
	private Integer polarScore = 0;
	/**
	 * Attribute date declared as type timestamp.
	 */
	private Date date;

	/**
	 * Empty constructor declaration for user.
	 */
	public User() {
	}

	/**
	 * Constructor declaration for user.
	 * @param username
	 * @param hash
	 */
	public User(String username, String hash) {
//	public User(String username, String hash, Integer foodFootprint, Integer waterFootprint,
//				Integer transportFootprint, Date date) {
		this.username = username;
		this.hash = hash;
//		this.food_footprint = foodFootprint;
//		this.waterFootprint = waterFootprint;
//		this.transportFootprint = transportFootprint;
//		this.date = date;
	}

	public Integer getId(){return id;}
	public void setId(Integer id){this.id = id;}

	/**
	 * Getter for username.
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Setter for username.
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
	 * @param hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	/**
	 * Getter for foodFootprint.
	 */
	public Integer getFoodFootprint() {
		return food_footprint;
	}
	/**
	 * Setter for foodFootprint.
	 * @param foodFootprint
	 */
	public void setFoodFootprint(Integer foodFootprint) {
		this.food_footprint = foodFootprint;
	}
	/**
	 * Getter for waterFootprint.
	 */
	public Integer getWaterFootprint() {
		return waterFootprint;
	}
	/**
	 * Setter for waterFootprint.
	 * @param waterFootprint
	 */
	public void setWaterFootprint(Integer waterFootprint) {
		this.waterFootprint = waterFootprint;
	}
	/**
	 * Getter for transportFootprint.
	 */
	public Integer getTransportFootprint() {
		return transportFootprint;
	}
	/**
	 * Setter for transportFootprint.
	 * @param transportFootprint
	 */
	public void setTransportFootprint(Integer transportFootprint) {
		this.transportFootprint = transportFootprint;
	}
	/**
	 * Getter for polarScore.
	 */
	public Integer getPolarScore() {
		return polarScore;
	}
	/**
	 * Setter for polarScore.
	 * @param polarScore
	 */
	public void setPolarScore(Integer polarScore) {
		this.polarScore = polarScore;
	}
	/**
	 * Getter for date.
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Setter for date.
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 *toString method for user.
	 */
	@Override
	public String toString() {
		return "User{" + "username='" + username
				+ '\'' + ", hash='" + hash + '\'' + '}';
	}
}