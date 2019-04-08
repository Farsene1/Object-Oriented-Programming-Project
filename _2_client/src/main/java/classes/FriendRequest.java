package classes;


/**
 * Friend Request ClaSS.
 */
public class FriendRequest {

    /**
     * Variables.
     */
    private Integer id;
    private String sender;
    private String receiver;
    private boolean accepted = false;

    /**
     * Empty Constructor.
     */
    public FriendRequest() {
    }


    /**
     * FriendRequst constructor.
     *
     * @param sender   paramter sender.
     * @param receiver parameter receiver.
     */
    public FriendRequest(final String sender, final String receiver) {
        this.sender = sender;
        this.receiver = receiver;

    }


    /**
     * Returns the id.
     *
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets ID.
     *
     * @param id parameter id.
     */
    public void setId(final Integer id) {
        this.id = id;
    }


    /**
     * sETS Sender.
     *
     * @param sender parameter sender.
     */
    public void setSender(final String sender) {
        this.sender = sender;
    }

    /**
     * Sets receiver.
     *
     * @param receiver parameter Receiver.
     */
    public void setReceiver(final String receiver) {
        this.receiver = receiver;
    }


    /**
     * Sets accepted.
     *
     * @param accepted accepted parameter.
     */
    public void setAccepted(final boolean accepted) {
        this.accepted = accepted;
    }

    /**
     * Gets Sender.
     *
     * @return sender.
     */
    public String getSender() {
        return sender;
    }

    /**
     * Gets receiver.
     *
     * @return reciver.
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Gets accepted.
     *
     * @return accepted.
     */
    public boolean isAccepted() {
        return accepted;
    }
}

