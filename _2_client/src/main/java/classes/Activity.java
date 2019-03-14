package classes;

//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Activity {

    private Integer id = 0;

    private User userId;

    private Integer category;

    private String description;

    private Integer carbonFootprint;

    private String date;

    public Activity(Integer category, String description, Integer carbonFootprint, String date){
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
        String cat = "";
        if (category==1)
            cat="food";
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