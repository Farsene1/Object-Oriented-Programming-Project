package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;




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
     * sender attribute.
     */
    private String sender;
    /**
     * receiver attribute.
     */
    private String receiver;
    /**
     * state attribute.
     */
    private boolean accepted = false;

    /**
     * empty constructor.
     */
    public FriendRequest() {
    }

    /**
     * friend request constructor.
     *
     * @param sender2   sender parameter.
     * @param receiver2 receiver parameter.
     */
    public FriendRequest(final String sender2, final String receiver2) {
        this.sender = sender2;
        this.receiver = receiver2;
    }

    /**
     * sets id.
     *
     * @param id2 parameter id.
     */
    public void setId(final Integer id2) {
        this.id = id2;
    }

    /**
     * sets sender.
     *
     * @param sender2 parameter sender.
     */
    public void setSender(final String sender2) {
        this.sender = sender2;
    }

    /**
     * sets receiver.
     *
     * @param receiver2 parameter receiver.
     */
    public void setReceiver(final String receiver2) {
        this.receiver = receiver2;
    }

    /**
     * sets accepted.
     *
     * @param accepted2 parameter accepted.
     */
    public void setAccepted(final boolean accepted2) {
        this.accepted = accepted2;
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
