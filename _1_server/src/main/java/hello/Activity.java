package hello;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "activity")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTIVITY_ID", unique = true, nullable = false)
    private Integer id = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Column(name = "CATEGORY", unique = false, nullable = false)
    private Integer category;

    @Column(name = "DESCRIPTION", unique = false, nullable = false)
    private String description;

    @Column(name = "CARBONFOOTPRINT", unique = false, nullable = false)
    private Integer carbonFootprint;

//    @Column(name = "POLAR_SCORE", unique = false, nullable = false)
//    private Integer polarScore;

    @Column(name = "DATE", unique = false, nullable = false)
    private String date;

    public Activity(User user, Integer category, String description, Integer carbonFootprint, String date){
        this.user = user;
        this.category = category;
        this.description = description;
        this.carbonFootprint = carbonFootprint;
        this.date = date;
    }
    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public User getUser(){return user;}
    public void setUser(User user){this.user = user;}

    public Integer getCategory(){return category;}
    public void setCategory(Integer category){this.category = category;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public Integer getCarbonFootprint(){return carbonFootprint;}
    public void setCarbonFootprint(Integer carbonFootprint){this.carbonFootprint = carbonFootprint;}

    public String getDate(){return date;}
    public void setDate(String date){this.date = date;}

    @Override
    public String toString(){
        return "Activity(" +
                ", id='" + id + '\'' +
                ", userID='" + user + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", carbonFootprint='" + carbonFootprint + '\'' +
                ", date'" + date + '\'' +
                "}";
    }
}