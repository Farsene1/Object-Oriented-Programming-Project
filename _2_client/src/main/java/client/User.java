package client;



public class User {

<<<<<<< HEAD
	//private Long id;


	private String username;

	private String hash;

	public User(String username, String hash) {
		this.username = username;
		this.hash = hash;
=======
	private String username;
	private String hash;
	
	public User(){
		
	}
	
	public User(String username, String hash){
		this.username = username;
		this.hash=hash;
>>>>>>> BRANCH_FIX
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
<<<<<<< HEAD
				", username='" + username + '\'' +
=======
				"username='" + username + '\'' +
>>>>>>> BRANCH_FIX
				", hash='" + hash + '\'' +
				'}';
	}
}