package classes;

//import java.text.SimpleDateFormat;
//import java.util.Date;

/**
 * Activity object class.
 */
public class Activity {
    /**
     * ID variable.
     */
    private Integer id;
    /**
     * username variable.
     */
    private String username;
    /**
     * category variable.
     */
    private Integer category;
    /**
     * cat variable.
     */
    private String cat;
    /**
     * description variable.
     */
    private String description;
    /**
     * footprint variable.
     */
    private Integer footprint;
    /**
     * date variable.
     */
    private String date;

    /**
     * empty constructor.
     */
    public Activity() {
    }

    /**
     * Activitty constructor.
     *
     * @param username    username variable.
     * @param category    category parameter.
     * @param description description parameter.
     * @param footprint   ftooprint parameter.
     * @param date        date parameter.
     */
    public Activity(final String username,
                    final Integer category,
                    final String description,
                    final Integer footprint,
                    final String date) {
        this.username = username;
        this.category = category;
        this.description = description;
        this.footprint = footprint;
        this.date = date;
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
     * GETS id.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id id parameter.
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username username parameter
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Gets category.
     *
     * @return category.
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category parameter category.
     */
    public void setCategory(final Integer category) {
        this.category = category;
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
     * get category.
     *
     * @return cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * Sets cat.
     *
     * @param cat parameter cat
     */
    public void setCat(final String cat) {
        this.cat = cat;
    }

    /**
     * Gets description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description description parameter
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets footprint.
     *
     * @return footprint
     */
    public Integer getFootprint() {
        return footprint;
    }

    /**
     * Sets footprint.
     *
     * @param footprint parameter footprint.
     */
    public void setFootprint(final Integer footprint) {
        this.footprint = footprint;
    }

    /**
     * Gets date.
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date parameter date.
     */
    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * Returns the to STRING OF ACTIVITY.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Activity("
                + ", category='" + cat + '\''
                + ", description='" + description + '\''
                + ", carbonFootprint='" + footprint + '\''
                + "}";
    }
}