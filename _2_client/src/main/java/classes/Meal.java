package classes;

public class Meal {

    private String foodType;
    private String food;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Meal(){

    }

    public Meal(String food,String foodType) {
        this.food = food;
        this.foodType= foodType;
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }



}
