package classes;

public class Badges {

    /**
     * Declare/initialize unlock value for unlocking methods.
     */
    static private int unlock = 0;
    /**
     * Declare/initialize polar total value for testing methods.
     */
    static public int polarTotal = 0;
    /**
     * Declare/initialize food total value for testing methods.
     */
    static public int foodTotal = 0;
    /**
     * Declare/initialize transport total value for testing methods.
     */
    static public int transportTotal = 0;
    /**
     * Declare/initialize electricity total value for testing methods.
     */
    static public int electricityTotal = 0;

    /**
     * Method to unlock polar badges
     */
    static public int polarUnlock(User user){
        /**
         * Calls get polar score // assigns to int value to be checked
         */
        int polarTotal = user.getPolarScore();
        /**
         * Defaults to unlock polar badge 1 automatically.
         */
        if(polarTotal <= 100000){
            unlock = 1;
        }
        if(polarTotal >= 200000){
            unlock = 2;
        }
        if(polarTotal >= 300000){
            unlock = 3;
        }
        if(polarTotal >= 400000){
            unlock = 4;
        }
        if(polarTotal >= 500000){
            unlock = 5;
        }
        if(polarTotal >= 600000){
            unlock = 6;
        }
        if(polarTotal >= 700000){
            unlock = 7;
        }
        if(polarTotal >= 800000){
            unlock = 8;
        }
        if(polarTotal >= 900000){
            unlock = 9;
        }
        if(polarTotal >= 1000000){
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Method to unlock food badges
     */
    static public int foodUnlock(User user){
/**
 * Calls get food score // assigns to int value to be checked
 */
        int foodTotal = user.getFoodScore();
        /**
         * Defaults to unlock food badge 1 automatically.
         */
        if(foodTotal <= 10000){
            unlock = 1;
        }
        if(foodTotal >= 20000){
            unlock = 2;
        }
        if(foodTotal >= 30000){
            unlock = 3;
        }
        if(foodTotal >= 40000){
            unlock = 4;
        }
        if(foodTotal >= 50000){
            unlock = 5;
        }
        if(foodTotal >= 60000){
            unlock = 6;
        }
        if(foodTotal >= 70000){
            unlock = 7;
        }
        if(foodTotal >= 80000){
            unlock = 8;
        }
        if(foodTotal >= 90000){
            unlock = 9;
        }
        if(foodTotal >= 100000){
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Method to unlock transport badges
     */
    static public int transportUnlock(User user){
        /**
        * Calls get transport score // assigns to int value to be checked
        */
        int transportTotal = user.getTransportScore();
        /**
         * Defaults to unlock transport badge 1 automatically.
         */
        if(transportTotal <= 10000){
            unlock = 1;
        }
        if(transportTotal >= 20000){
            unlock = 2;
        }
        if(transportTotal >= 30000){
            unlock = 3;
        }
        if(transportTotal >= 40000){
            unlock = 4;
        }
        if(transportTotal >= 50000){
            unlock = 5;
        }
        if(transportTotal >= 60000){
            unlock = 6;
        }
        if(transportTotal >= 70000){
            unlock = 7;
        }
        if(transportTotal >= 80000){
            unlock = 8;
        }
        if(transportTotal >= 90000){
            unlock = 9;
        }
        if(transportTotal >= 100000){
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Method to unlock electricity badges
     */
    static public int electricityUnlock(User user){
        /**
        * Calls get electricity score // assigns to int value to be checked
        */
        int electricityTotal = user.getElectricityScore();

        /**
         * Defaults to unlock electricity badge 1 automatically.
         */
        if(electricityTotal <= 10000){
            unlock = 1;
        }
        if(electricityTotal >= 20000){
            unlock = 2;
        }
        if(electricityTotal >= 30000){
            unlock = 3;
        }
        if(electricityTotal >= 40000){
            unlock = 4;
        }
        if(electricityTotal >= 50000){
            unlock = 5;
        }
        if(electricityTotal >= 60000){
            unlock = 6;
        }
        if(electricityTotal >= 70000){
            unlock = 7;
        }
        if(electricityTotal >= 80000){
            unlock = 8;
        }
        if(electricityTotal >= 90000){
            unlock = 9;
        }
        if(electricityTotal >= 100000){
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Setter for polar total needed for test class.
     */
    public void setPolarTotal(Integer polarTotal) {
        this.polarTotal = polarTotal;
    }
    /**
     * Setter for food total needed for test class.
     */
    public void setFoodTotal(Integer foodTotal) {
        this.foodTotal = foodTotal;
    }
    /**
     * Setter for transport total needed for test class.
     */
    public void setTransportTotal(Integer transportTotal) {
        this.transportTotal = transportTotal;
    }
    /**
     * Setter for electricity total needed for test class.
     */
    public void setElectricityTotal(Integer electricityTotal) {
        this.electricityTotal = electricityTotal;
    }
}
