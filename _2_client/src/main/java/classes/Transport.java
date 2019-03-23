package classes;

public class Transport {
    private String  username;
    private String type;
    private double distance;
    private int score;
    private  String date;


        public Transport(){

        }

       public Transport(String username, String type, double distance, int score, String date){
            this.username=username;
            this.type=type;
            this.distance=distance;
            this.score=score;
            this.date=date;



       }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

       public int calculator(String type,double distance){
        int score=0;
        if(type.equals("Train")){
            score=(int) Math.round(50*100/distance);
        }
        if(type.equals("Car")){
            score=(int) Math.round(30*100/distance);
        }
        if(type.equals("Bicycle")){
            score=(int) Math.round(150*100/distance);
        }
        if(type.equals("Airplane")){
            score=(int) Math.round(40*100/distance);
        }
        if(type.equals("Walking")){
            score=(int) Math.round(200*100/distance);
        }
        return score;
    }

}
