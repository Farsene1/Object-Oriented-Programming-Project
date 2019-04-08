package hello;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
     * @param username2    username parameter.
     * @param category2    category parameter.
     * @param description2 description parameter.
     * @param footprint2   footprint parameter.
     * @param date2        date parameter.
     */
    public Activity(final String username2, final Integer category2,
                    final String description2,
                    final Integer footprint2, final String date2) {
        this.username = username2;
        this.category = category2;
        this.description = description2;
        this.footprint = footprint2;
        this.date = date2;
        switch (category) {
            case 1:
                this.cat = "Food";
                break;

            case 2:
                this.cat = "Transport";
                break;

            case 3:
                this.cat = "Electricity";
                break;

            default:
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
     * @param id2 parameter id.
     */
    public void setId(final Integer id2) {
        this.id = id2;
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
     * @param username2 paramter username.
     */
    public void setUsername(final String username2) {
        this.username = username2;
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
     * @param category2 category parameter.
     */
    public void setCategory(final Integer category2) {
        this.category = category2;
        switch (category) {
            case 1:
                this.cat = "Food";
                break;

            case 2:
                this.cat = "Transport";
                break;

            case 3:
                this.cat = "Electricity";
                break;

            default:
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
     * @param cat2 parameter cat.
     */
    public void setCat(final String cat2) {
        this.cat = cat2;
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
     * @param description2 parameter description.
     */
    public void setDescription(final String description2) {
        this.description = description2;
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
     * @param footprint2 footprint parameter.
     */
    public void setFootprint(final Integer footprint2) {
        this.footprint = footprint2;
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
     * @param date2 parameter date.
     */
    public void setDate(final String date2) {
        this.date = date2;
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
