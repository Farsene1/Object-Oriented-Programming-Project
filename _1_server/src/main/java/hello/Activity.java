package hello;

import javax.persistence.*;

@Entity
@Table(name = "activities")
/**
 * this is the activity class, converted into table.
 */
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * id.
     */
    private Integer id;

    /**
     * username to identify the object in the database.
     */
    private String username;

    /**
     * category attr.
     */
    private Integer category;

    /**
     * category string attr.
     */
    private String cat;

    /**
     * description attr.
     */
    private String description;

    /**
     * footprint attr.
     */
    private Integer footprint;

    /**
     * date attr.
     */
    private String date;

    /**
     * default constructor.
     */
    public Activity() {
    }

    /**
     * @param username
     * @param category
     * @param cat
     * @param description
     * @param footprint
     * @param date
     */
    public Activity(String username, Integer category, String description,
                    Integer footprint, String date) {
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

    /**
     * getId.
     *
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String.
     */
    public String getUsername() {
        return username;
    }

    /**
     * set username.
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return category.
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * set category.
     */
    public void setCategory(Integer category) {
        this.category = category;
        switch (category) {
            case 1: {
                this.cat = "Food";
                break;
            }
            case 2: {
                this.cat = "Transport";
                break;
            }
            case 3: {
                this.cat = "Electricity";
                break;
            }
        }
    }

    /**
     * @return cat.
     */
    public String getCat() {return cat;}

    /**
     * set cat.
     */
    public void setCat(String cat) {this.cat = cat;}

    /**
     * @return desc.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return footprint.
     */
    public Integer getFootprint() {
        return footprint;
    }

    /**
     * set score.
     *
     * @param footprint
     */
    public void setFootprint(Integer footprint) {
        this.footprint = footprint;
    }

    /**
     * @return date.
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return String representation of the object.
     */
    public String toString() {
        return "Activity("
                + ", category='" + cat + '\''
                + ", description='" + description + '\''
                + ", footprint='" + footprint + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
