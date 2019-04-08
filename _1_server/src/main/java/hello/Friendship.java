package hello;

import javax.persistence.*;

@Entity
@Table(name = "friendships")
public class Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username1;
    private String username2;

    public Friendship(String username1, String username2) {
        this.username1 = username1;
        this.username2 = username2;
    }

    @Override
    public String toString() {
        return "Friendship{" +
                "username1='" + username1 + '\'' +
                ", username2='" + username2 + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }
}
