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
     * @return cat.
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * set cat.
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

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
        String cat = "";

        if (category == 1) {
            cat = "food";
        }
        if (category == 2) {
            cat = "transport";
        }
        if (category == 3) {
            cat = "electricity";
        }
        if (category == 4) {
            cat = "groceries";
        }

        return "Activity("
                + ", category='" + cat + '\''
                + ", description='" + description + '\''
                + ", footprint='" + footprint + '\''
                + ", date='" + date + '\''
                + "}";
    }
}
