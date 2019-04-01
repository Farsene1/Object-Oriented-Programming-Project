package classes;

//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Activity {

    private Integer id;

    private String username;

    private Integer category;

    private String cat;

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
        switch (category)
                {
                   case 1:
                   {
                       this.cat="Food";
                       break;
                   }
                   case 2:
                    {
                        this.cat="Transport";
                        break;
                    }
                    case 3:
                    {
                       this.cat="Electricity";
                       break;
                    }
                }
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
        switch (category)
        {
            case 1:
            {
                this.cat="Food";
                break;
            }
            case 2:
            {
                this.cat="Transport";
                break;
            }
            case 3:
            {
                this.cat="Electricity";
                break;
            }
        }
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
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
        return "Activity(" +
                ", category='" + cat + '\'' +
                ", description='" + description + '\'' +
                ", carbonFootprint='" + footprint + '\'' +
                "}";
    }
}