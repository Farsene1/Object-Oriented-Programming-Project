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
    private Integer foodFootprint;
    private Integer waterFootprint;
    private Integer transportFootprint;
    private Integer polarScore;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public Activity(Integer category, Integer foodFootprint, Integer waterFootprint, Integer transportFootprint, Integer polarScore, Date date, User userID){
        this.category = category;
        this.foodFootprint = foodFootprint;
        this.waterFootprint = waterFootprint;
        this.transportFootprint = transportFootprint;
        this.polarScore = polarScore;
        this.date = date;
    }

    public Integer getCategory(){return category;}
    public void setCategory(Integer category){this.category = category;}

    public Integer getFoodFootprint(){return foodFootprint;}
    public void setFoodFootprint(Integer foodFootprint){this.foodFootprint = foodFootprint;}

    public Integer getWaterFootprint(){return waterFootprint;}
    public void setWaterFootprint(Integer waterFootprint){this.waterFootprint = waterFootprint;}

    public Integer getTransportFootprint(){return transportFootprint;}
    public void setTransportFootprint(Integer transportFootprint){this.transportFootprint = transportFootprint;}

    public Integer getPolarScore(){return polarScore;}
    public void setPolarScore(Integer polarScore){this.polarScore = polarScore;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date = date;}

    @Override
    public String toString(){
        return "Activity(" +
                "category='" + category + '\'' +
                ", foodFootprint='" + foodFootprint + '\'' +
                ", waterFootprint='" + waterFootprint + '\'' +
                ", TransportFootprint='" + transportFootprint + '\'' +
                ", polarScore'" + polarScore + '\'' +
                ", date'" + date + '\'' +
                "}";
    }
}
