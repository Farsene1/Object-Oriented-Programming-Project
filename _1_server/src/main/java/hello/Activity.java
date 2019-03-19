package hello;

import javax.persistence.*;

@Entity
@Table(name = "activities")

public class Activity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String category;
    private String description;
    private Integer score;
    private String date;

    public Activity(){}

    public Activity(String username, String category, String description, Integer score, String date){
        this.username = username;
        this.category = category;
        this.description = description;
        this.score = score;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer footprint) {
        this.score = footprint;
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
        if (category.equals("food"))
            cat = "food";
        if (category.equals("groceries"))
            cat="groceries";
        if (category.equals("transport"))
            cat="transport";
        if (category.equals("electricity"))
            cat="electricity";


        return "Activity(" +
                ", category='" + cat + '\'' +
                ", description='" + description + '\'' +
                ", score='" + score + '\'' +
                ", date='" + date + '\'' +
                "}";
    }
}