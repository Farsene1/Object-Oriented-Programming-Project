package classes;


import java.util.Date;

public class User {

	private String username;
	private String hash;
	private Integer foodFootprint = 0;
	private Integer waterFootprint = 0;
	private Integer transportFootprint = 0;
	private Integer polarScore = 0;
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