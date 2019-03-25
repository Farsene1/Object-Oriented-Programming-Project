package classes;

public class FriendRequest {
    String sender;
    String receiver;
    boolean accept;


    public FriendRequest(){

    }
    public FriendRequest(String sender,String receiver,boolean accept){
        this.sender= sender;
        this.receiver=receiver;
        this.accept=accept;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }
}

