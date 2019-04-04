package hello;

import javax.persistence.*;

/**
 * ties this to the friendshipps table.
 */
@Entity
@Table(name = "friendships")
public class Friendship {
    /**
     * generating id for friendship.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username1;
    private String username2;

    /**
     * constructor for friendship.
     *
     * @param username1 username 1 paramter.
     * @param username2 username 2 parameter.
     */
    public Friendship(String username1, String username2) {
        this.username1 = username1;
        this.username2 = username2;
    }

    /**
     * To string method of friendship.
     *
     * @return return string.
     */
    @Override
    public String toString() {
        return "Friendship{"
                + "username1='" + username1
                + '\''
                + ", username2='" + username2
                + '\''
                + '}';
    }

    /**
     * Get id.
     *
     * @return returns id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * sets id.
     *
     * @param id id parameter.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get username1.
     *
     * @return username1
     */
    public String getUsername1() {
        return username1;
    }

    /**
     * sets username1.
     *
     * @param username1
     */
    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    /**
     * gets username2.
     *
     * @return return username2
     */
    public String getUsername2() {
        return username2;
    }

    /**
     * set username2.
     *
     * @param username2 username2 parameter.
     */
    public void setUsername2(String username2) {
        this.username2 = username2;
    }
}
