package classes;

public class Vehicle {
    private String  username;
    private String type;
    private int distance;
    private int score;
    private  String date;


        public Vehicle(){

        }

       public Vehicle(String username, String type,int distance,int score,String date){
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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
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

       public int calculator(String type, int distance){
        int score=0;
        if(type.equals("Train")){
            score =Math.round(50*100/distance) ;
        }
        if(type.equals("Car")){
            score=Math.round(30*100/distance);
        }
        if(type.equals("Bicycle")){
            score=Math.round(150*100/distance);
        }
        if(type.equals("Airplane")){
            score=Math.round(40*100/distance);
        }
        return score;
    }

}
