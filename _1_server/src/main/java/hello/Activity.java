package hello;

import javax.persistence.*;
import java.util.Date;
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
    private String username;

    @Column(name = "CATEGORY", unique = false, nullable = false)
    private Integer category;

    @Column(name = "DESCRIPTION", unique = false, nullable = false)
    private String description;

    @Column(name = "CARBON_FOOTPRINT", unique = false, nullable = false)
    private Integer carbonFootprint;

    @Column(name = "DATE", unique = false, nullable = false)
    private Date date;

    public Activity(String username, Integer category, String description, Integer carbonFootprint, Date date){
        this.username = username;
        this.category = category;
        this.description = description;
        this.carbonFootprint = carbonFootprint;
        this.date = date;
    }

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getUserId(){return username;}
    public void setUserId(String username){this.username = username;}

    public Integer getCategory(){return category;}
    public void setCategory(Integer category){this.category = category;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public Integer getCarbonFootprint(){return carbonFootprint;}
    public void setCarbonFootprint(Integer carbonFootprint){this.carbonFootprint = carbonFootprint;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date = date;}

    @Override
    public String toString(){
        String cat = "";
        if (category == 1)
            cat = "food";
        if (category==2)
            cat="transport";
        if (category==3)
            cat="water";


        return "Activity(" +
                ", category='" + cat + '\'' +
                ", description='" + description + '\'' +
                ", carbonFootprint='" + carbonFootprint + '\'' +
                ", date'" + date + '\'' +
                "}";
    }
}