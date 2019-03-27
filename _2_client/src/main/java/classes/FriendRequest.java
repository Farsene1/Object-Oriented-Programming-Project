package classes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FriendRequest {


    private Integer id;
    private String sender;
    private String receiver;
    private boolean accepted = false;

    public FriendRequest() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FriendRequest(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;

    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }



    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public boolean isAccepted() {
        return accepted;
    }
}

