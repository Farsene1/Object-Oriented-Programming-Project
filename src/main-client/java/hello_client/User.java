package hello_client;

public class User {
	private long id;
	private String name;
	private int age;
	
	public User(){
		
	}
	
	public User(long id, String name, int  age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
 
	public long getId() {
		return id;
	}
 
	public void setId(long id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String info = String.format("User Info: id = %d, name = %s, age = %d", id, name, age);
		return info;
	}

	public boolean equals(Object other){
		if(this == other){
			return true;
		}else if (other instanceof User){
			User that = (User) other;
			if(this.id == that.id && this.name.equals(that.name) && this.age == that.age){
				return true;
			}
			return false;
		}
		return false;
	}
 
}