package hello;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "users")
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	private String username;
	private String hash;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "activity")
	private List<Activity> activities;

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

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", hash='" + hash + '\'' +
				'}';
	}
}