package hello;

import javax.persistence.*;
//import java.text.SimpleDateFormat;
//import java.util.Date;

@Entity
@Table(name = "activities")

public class Activity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

    private Integer category;

    private String description;

    private Integer footprint;

    private String date;

    public Activity(){}

    public Activity(String username, Integer category, String description, Integer footprint, String date){
        this.username = username;
        this.category = category;
        this.description = description;
        this.footprint = footprint;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFootprint() {
        return footprint;
    }

    public void setFootprint(Integer footprint) {
        this.footprint = footprint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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
                ", carbonFootprint='" + footprint + '\'' +
                "}";
    }
}