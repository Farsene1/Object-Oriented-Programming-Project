package classes;

/**
 * Meal Class.
 */
public class Meal {

    /**
     * Declares variables.
     */
    private String foodType;
    private String food;

    /**
     * Empty constructor.
     */
    public Meal() {

    }

    /**
     * Constructor for meal.
     *
     * @param food     food param.
     * @param foodType foodType.
     */
    public Meal(final String food, final String foodType) {
        this.food = food;
        this.foodType = foodType;
    }

    /**
     * Returns food Type.
     * @return foodType.
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Sets food type.
     * @param foodType food type parameter.
     */
    public void setFoodType(final String foodType) {
        this.foodType = foodType;
    }


    /**
     * Returns food.
     * @return food
     */
    public String getFood() {
        return food;
    }

    /**
     * sETS FOOD.
     * @param food food paramter.
     */
    public void setFood(final String food) {
        this.food = food;
    }


}
