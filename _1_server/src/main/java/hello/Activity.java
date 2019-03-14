package hello;

import javax.persistence.*;
//import java.text.SimpleDateFormat;
//import java.util.Date;

@Entity
@Table(name = "activity")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTIVITY_ID", unique = true, nullable = false)
    private Integer id = 0;

    @ManyToOne
    @JoinColumn(name = "userId", unique = true, nullable = false)
    private User userId;

    @Column(name = "CATEGORY", unique = false, nullable = false)
    private Integer category;

    @Column(name = "DESCRIPTION", unique = false, nullable = false)
    private String description;

    @Column(name = "CARBON_FOOTPRINT", unique = false, nullable = false)
    private Integer carbonFootprint;

    @Column(name = "DATE", unique = false, nullable = false)
    private String date;

    public Activity(User userId, Integer category, String description, Integer carbonFootprint, String date){
        this.userId = userId;
        this.category = category;
        this.description = description;
        this.carbonFootprint = carbonFootprint;
        this.date = date;
    }

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public User getUserId(){return userId;}
    public void setUserId(User userId){this.userId = userId;}

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
                ", userId='" + userId + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", carbonFootprint='" + carbonFootprint + '\'' +
                ", date'" + date + '\'' +
                "}";
    }
}