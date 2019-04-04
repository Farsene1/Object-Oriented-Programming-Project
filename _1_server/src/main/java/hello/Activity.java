package hello;

import javax.persistence.*;

/**
 * Table activities in database.
 */
@Entity
@Table(name = "activities")
/**
 * this is the activity class, converted into table.
 */
public class Activity {
    /**
     * the activity id auto generation.
     */
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
     * activity constructor.
     *
     * @param username    username parameter.
     * @param category    category parameter.
     * @param description description parameter.
     * @param footprint   footprint parameter.
     * @param date        date parameter.
     */
    public Activity(String username, Integer category, String description,
                    Integer footprint, String date) {
        this.username = username;
        this.category = category;
        this.description = description;
        this.footprint = footprint;
        this.date = date;
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
     * getId.
     *
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * sets Id.
     *
     * @param id parameter id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * gets username.
     *
     * @return String.
     */
    public String getUsername() {
        return username;
    }

    /**
     * set username.
     *
     * @param username paramter username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * gets category.
     *
     * @return category.
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * sets category.
     *
     * @param category category parameter.
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
     * gets cat.
     *
     * @return cat.
     */
    public String getCat() {
        return cat;
    }

    /**
     * sets cat.
     *
     * @param cat parameter cat.
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

    /**
     * returns description.
     *
     * @return desc.
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets description.
     *
     * @param description parameter description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * returns footprint.
     *
     * @return footprint.
     */
    public Integer getFootprint() {
        return footprint;
    }

    /**
     * set score.
     *
     * @param footprint footprint parameter.
     */
    public void setFootprint(Integer footprint) {
        this.footprint = footprint;
    }

    /**
     * returns date.
     *
     * @return date.
     */
    public String getDate() {
        return date;
    }

    /**
     * sets date.
     *
     * @param date parameter date.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * a textual representation.
     *
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
