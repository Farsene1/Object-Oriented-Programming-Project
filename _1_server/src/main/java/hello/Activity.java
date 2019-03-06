package hello;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activity")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private Integer category;
    private Integer carbonFootprint;
    private Integer polarScore;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public Activity(Integer category, Integer carbonFootprint, Integer polarScore, Date date, User userID){
        this.category = category;
        this.carbonFootprint = carbonFootprint;
        this.polarScore = polarScore;
        this.date = date;
    }

    public Integer getCategory(){return category;}
    public void setCategory(Integer category){this.category = category;}

    public Integer getCarbonFootprint(){return carbonFootprint;}
    public void setCarbonFootprint(Integer carbonFootprint){this.carbonFootprint = carbonFootprint;}

    public Integer getPolarScore(){return polarScore;}
    public void setPolarScore(Integer polarScore){this.polarScore = polarScore;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date = date;}

    @Override
    public String toString(){
        return "Activity(" +
                "category='" + category + '\'' +
                ", carbonFootprint='" + carbonFootprint + '\'' +
                ", polarScore'" + polarScore + '\'' +
                ", date'" + date + '\'' +
                "}";
    }
}
