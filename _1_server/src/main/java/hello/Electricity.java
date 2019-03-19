package hello;

import javax.persistence.*;

@Table(name = "electricity")
@Entity

public class Electricity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(unique = true)
    private String username;

    private Integer heatingHrs;
    private Integer lightHrs;
    boolean solarPanels;
    private String date;
    private Integer score;

    public Electricity(){}

    public Electricity(String username, Integer heatingHrs, Integer lightHrs, boolean solarPanels, String date, int score){
        this.username = username;
        this.heatingHrs = heatingHrs;
        this.lightHrs = lightHrs;
        this.solarPanels = solarPanels;
        this.date = date;
        this.score = score;
    }

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getUsername(){return username;}
    public void setUsername(String username){this.username = username;}

    public Integer getHeatingHrs(){return heatingHrs;}
    public void setHeatingHrs(Integer heatingHrs){this.heatingHrs = heatingHrs;}

    public Integer getLightHrs(){return lightHrs;}
    public void setLightHrs(Integer lightHrs){this.lightHrs = lightHrs;}

    public Boolean getSolarPanels(){return solarPanels;}
    public void setSolarPanels(boolean solarPanels){this.solarPanels = solarPanels;}

    public String getDate(){return date;}
    public void setDate(String date){this.date = date;}

    public Integer getScore(){return score;}
    public void setScore(Integer score){this.score = score;}

    @Override
    public String toString(){
        return "Food{" + "username='" + username
                + '\'' + ", heatingHrs='" + heatingHrs + '\'' +
                + '\'' + ", lightHrs='" + lightHrs + '\'' +
                + '\'' + ", solarPanels='" + solarPanels + '\'' +
                + '\'' + ", date='" + date + '\'' +
                + '\'' + ", score='" + score + '\'' +
                '}';
    }
}

