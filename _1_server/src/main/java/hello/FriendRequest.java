package hello;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class FriendRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username1;
    private String username2;
    private boolean accepted = false;

    public FriendRequest(String username1, String username2) {
        this.username1 = username1;
        this.username2 = username2;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername1() {
        return username1;
    }

    public String getUsername2() {
        return username2;
    }

    public boolean isAccepted() {
        return accepted;
    }
}
