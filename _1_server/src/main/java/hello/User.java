package hello;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "users")
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	private String username;
	private String hash;
	private Integer foodFootprint;
	private Integer waterFootprint;
	private Integer transportFootprint;
	private Integer polarScore;
	private Date date;

	public User(){}

	public User(String username, String hash){
		this.username = username;
		this.hash=hash;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Integer getFoodFootprint() {
		return foodFootprint;
	}

	public void setFoodFootprint(Integer foodFootprint) {
		this.foodFootprint = foodFootprint;
	}

	public Integer getWaterFootprint() {
		return waterFootprint;
	}

	public void setWaterFootprint(Integer waterFootprint) {
		this.waterFootprint = waterFootprint;
	}

	public Integer getTransportFootprint() {
		return transportFootprint;
	}

	public void setTransportFootprint(Integer transportFootprint) {
		this.transportFootprint = transportFootprint;
	}

	public Integer getPolarScore() {
		return polarScore;
	}

	public void setPolarScore(Integer polarScore) {
		this.polarScore = polarScore;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", hash='" + hash + '\'' +
				'}';
	}
}