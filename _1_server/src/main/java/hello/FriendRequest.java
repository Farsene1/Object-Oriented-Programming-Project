package hello;


import javax.persistence.*;

/**
 * table name requests.
 */
@Entity
@Table(name = "requests")
public class FriendRequest {

    /**
     * id gets auto generated for friend request.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * variables.
     */
    private String sender;
    private String receiver;
    private boolean accepted = false;

    /**
     * empty constructor.
     */
    public FriendRequest() {
    }

    /**
     * friend request constructor.
     *
     * @param sender   sender parameter.
     * @param receiver receiver parameter.
     */
    public FriendRequest(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    /**
     * sets id.
     *
     * @param id parameter id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * sets sender.
     *
     * @param sender parameter sender.
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * sets receiver.
     *
     * @param receiver parameter receiver.
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * sets accepted.
     *
     * @param accepted parameter accepted.
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    /**
     * get ID.
     *
     * @return return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * gets sender.
     *
     * @return returns sender.
     */
    public String getSender() {
        return sender;
    }

    /**
     * gets receiver.
     *
     * @return receiver.
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * returns is accepted.
     *
     * @return accepted.
     */
    public boolean isAccepted() {
        return accepted;
    }
}
