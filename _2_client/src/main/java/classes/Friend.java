package classes;

public class Friend {
    String username;
    int polarscore;


    public Friend(){}


    public Friend(String username,int polarscore){
        this.username=username;
        this.polarscore=polarscore;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPolarscore() {
        return polarscore;
    }

    public void setPolarscore(int polarscore) {
        this.polarscore = polarscore;
    }


}


