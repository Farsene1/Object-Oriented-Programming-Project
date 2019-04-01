package classes;


public class Meal {

    /**
     * Declares variables.
     */
    private String foodType;
    private String food;

    /**
     * Empty constructor
     */
    public Meal(){

    }

    /**
     * Constructor using variables
     */
    public Meal(String food,String foodType) {
        this.food = food;
        this.foodType= foodType;
    }

    /**
     * Getter for type of food (1, 2, 3)
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Setter for type of food (1, 2, 3)
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }


    /**
     * Getter for food (1, 2, 3)
     */
    public String getFood() {
        return food;
    }
    /**
     * Setter for food (vegan, vegetarian, meat)
     */
    public void setFood(String food) {
        this.food = food;
    }


}
