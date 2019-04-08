package classes;


public class Electricity {

    private int heat_hrs;
    private int light_hrs;
    private boolean solar;
    private int score;

    public Electricity(){

    }

    public Electricity(int heat_hrs, int light_hrs, boolean solar) {
        this.heat_hrs = heat_hrs;
        this.light_hrs = light_hrs;
        this.solar = solar;
    }

    public int getHeat_hrs() {
        return heat_hrs;
    }

    public void setHeat_hrs(int hrs) {
        this.heat_hrs = hrs;
    }

    public int getLight_hrs() {
        return light_hrs;
    }

    public void setLight_hrs(int hrs) {
        this.light_hrs = hrs;
    }

    public boolean getSolar() {
        return solar;
    }

    public void setSolar(boolean solar) {
        this.solar = solar;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
