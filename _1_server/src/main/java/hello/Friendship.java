package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



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

    /**
     * username1 attribute.
     */
    private String username1;

    /**
     * username2 attribute.
     */
    private String username2;

    /**
     * constructor for friendship.
     *
     * @param username1s username 1 parameter.
     * @param username2s username 2 parameter.
     */
    public Friendship(final String username1s, final String username2s) {
        this.username1 = username1s;
        this.username2 = username2s;
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
     * @param id2 id parameter.
     */
    public void setId(final Integer id2) {
        this.id = id2;
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
     * @param username1s parameter.
     */
    public void setUsername1(final String username1s) {
        this.username1 = username1s;
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
     * @param username2s username2 parameter.
     */
    public void setUsername2(final String username2s) {
        this.username2 = username2s;
    }
}
