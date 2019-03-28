package classes;

public class Badges {

    static private int unlock = 0;

    /**
     * Method to unlock polar badges
     */
    static public int polarUnlock(User user){

        int polarTotal = user.getPolarScore();
            if(polarTotal <= 100000){
                unlock = 1;
            }
            if(polarTotal <= 200000){
                unlock = 2;
            }
            if(polarTotal <= 300000){
                unlock = 3;
            }
            if(polarTotal <= 400000){
                unlock = 4;
            }
            if(polarTotal <= 500000){
                unlock = 5;
            }
            if(polarTotal <= 600000){
                unlock = 6;
            }
            if(polarTotal <= 700000){
                unlock = 7;
            }
            if(polarTotal <= 800000){
                unlock = 8;
            }
            if(polarTotal <= 900000){
                unlock = 9;
            }
            if(polarTotal <= 1000000){
                unlock = 10;
            }
        return unlock;
    }

    /**
     * Method to unlock food badges
     */
    static public int foodUnlock(User user){

        int foodTotal = user.getFoodScore();
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

        int transportTotal = user.getTransportScore();

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

        int electricityTotal = user.getElectricityScore();

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
}
