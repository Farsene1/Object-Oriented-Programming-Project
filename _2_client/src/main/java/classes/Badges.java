package classes;

public class Badges {

    /**
     * Declare/initialize unlock value for unlocking methods.
     */
    static private int unlock = 0;

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
        if(polarTotal <= 10000){
            unlock = 1;
        }
        if(polarTotal >= 20000){
            unlock = 2;
        }
        if(polarTotal >= 30000){
            unlock = 3;
        }
        if(polarTotal >= 40000){
            unlock = 4;
        }
        if(polarTotal >= 50000){
            unlock = 5;
        }
        if(polarTotal >= 60000){
            unlock = 6;
        }
        if(polarTotal >= 70000){
            unlock = 7;
        }
        if(polarTotal >= 80000){
            unlock = 8;
        }
        if(polarTotal >= 90000){
            unlock = 9;
        }
        if(polarTotal <= 10000){
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
        if(foodTotal <= 1000){
            unlock = 1;
        }
        if(foodTotal >= 2000){
            unlock = 2;
        }
        if(foodTotal >= 3000){
            unlock = 3;
        }
        if(foodTotal >= 4000){
            unlock = 4;
        }
        if(foodTotal >= 5000){
            unlock = 5;
        }
        if(foodTotal >= 6000){
            unlock = 6;
        }
        if(foodTotal >= 7000){
            unlock = 7;
        }
        if(foodTotal >= 8000){
            unlock = 8;
        }
        if(foodTotal >= 9000){
            unlock = 9;
        }
        if(foodTotal <= 10000){
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
        if(transportTotal <= 1000){
            unlock = 1;
        }
        if(transportTotal >= 2000){
            unlock = 2;
        }
        if(transportTotal >= 3000){
            unlock = 3;
        }
        if(transportTotal >= 4000){
            unlock = 4;
        }
        if(transportTotal >= 5000){
            unlock = 5;
        }
        if(transportTotal >= 6000){
            unlock = 6;
        }
        if(transportTotal >= 7000){
            unlock = 7;
        }
        if(transportTotal >= 8000){
            unlock = 8;
        }
        if(transportTotal >= 9000){
            unlock = 9;
        }
        if(transportTotal <= 10000){
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
        if(electricityTotal <= 1000){
            unlock = 1;
        }
        if(electricityTotal >= 2000){
            unlock = 2;
        }
        if(electricityTotal >= 3000){
            unlock = 3;
        }
        if(electricityTotal >= 4000){
            unlock = 4;
        }
        if(electricityTotal >= 5000){
            unlock = 5;
        }
        if(electricityTotal >= 6000){
            unlock = 6;
        }
        if(electricityTotal >= 7000){
            unlock = 7;
        }
        if(electricityTotal >= 8000){
            unlock = 8;
        }
        if(electricityTotal >= 9000){
            unlock = 9;
        }
        if(electricityTotal <= 10000){
            unlock = 10;
        }
        return unlock;
    }

}
