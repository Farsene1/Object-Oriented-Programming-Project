package classes;

public class Badges {

    static private int unlock = 0;
    static private boolean unlockable = false;


    /**
     * Method to unlock polar badges
     */
    static public int polarUnlock(User user){

        int polarTotal = user.getPolarScore();

        do{
            if(polarTotal <= 100000){
                unlock = 1;
                unlockable = true;
            }
            if(polarTotal >= 200000){
                unlock = 2;
                unlockable = true;
            }
            if(polarTotal >= 300000){
                unlock = 3;
                unlockable = true;
            }
            if(polarTotal >= 400000){
                unlock = 4;
                unlockable = true;
            }
            if(polarTotal >= 500000){
                unlock = 5;
                unlockable = true;
            }
            if(polarTotal >= 600000){
                unlock = 6;
                unlockable = true;
            }
            if(polarTotal >= 700000){
                unlock = 7;
                unlockable = true;
            }
            if(polarTotal >= 800000){
                unlock = 8;
                unlockable = true;
            }
            if(polarTotal >= 900000){
                unlock = 9;
                unlockable = true;
            }
            if(polarTotal >= 1000000){
                unlock = 10;
                unlockable = true;
            }
        }while(unlockable == false);
        return unlock;
    }

    /**
     * Method to unlock food badges
     */
    static public int foodUnlock(User user){

        int foodTotal = user.getFoodScore();

        do{
            if(foodTotal <= 10000){
                unlock = 1;
                unlockable = true;
            }
            if(foodTotal >= 20000){
                unlock = 2;
                unlockable = true;
            }
            if(foodTotal >= 30000){
                unlock = 3;
                unlockable = true;
            }
            if(foodTotal >= 40000){
                unlock = 4;
                unlockable = true;
            }
            if(foodTotal >= 50000){
                unlock = 5;
                unlockable = true;
            }
            if(foodTotal >= 60000){
                unlock = 6;
                unlockable = true;
            }
            if(foodTotal >= 70000){
                unlock = 7;
                unlockable = true;
            }
            if(foodTotal >= 80000){
                unlock = 8;
                unlockable = true;
            }
            if(foodTotal >= 90000){
                unlock = 9;
                unlockable = true;
            }
            if(foodTotal >= 100000){
                unlock = 10;
                unlockable = true;
            }
        }while(unlockable == false);
        return unlock;
    }

    /**
     * Method to unlock transport badges
     */
    static public int transportUnlock(User user){

        int transportTotal = user.getTransportScore();

        do{
            if(transportTotal <= 10000){
                unlock = 1;
                unlockable = true;
            }
            if(transportTotal >= 20000){
                unlock = 2;
                unlockable = true;
            }
            if(transportTotal >= 30000){
                unlock = 3;
                unlockable = true;
            }
            if(transportTotal >= 40000){
                unlock = 4;
                unlockable = true;
            }
            if(transportTotal >= 50000){
                unlock = 5;
                unlockable = true;
            }
            if(transportTotal >= 60000){
                unlock = 6;
                unlockable = true;
            }
            if(transportTotal >= 70000){
                unlock = 7;
                unlockable = true;
            }
            if(transportTotal >= 80000){
                unlock = 8;
                unlockable = true;
            }
            if(transportTotal >= 90000){
                unlock = 9;
                unlockable = true;
            }
            if(transportTotal >= 100000){
                unlock = 10;
                unlockable = true;
            }
        }while(unlockable == false);
        return unlock;
    }

    /**
     * Method to unlock electricity badges
     */
    static public int electricityUnlock(User user){

        int electricityTotal = user.getElectricityScore();

        do{
            if(electricityTotal <= 10000){
                unlock = 1;
                unlockable = true;
            }
            if(electricityTotal >= 20000){
                unlock = 2;
                unlockable = true;
            }
            if(electricityTotal >= 30000){
                unlock = 3;
                unlockable = true;
            }
            if(electricityTotal >= 40000){
                unlock = 4;
                unlockable = true;
            }
            if(electricityTotal >= 50000){
                unlock = 5;
                unlockable = true;
            }
            if(electricityTotal >= 60000){
                unlock = 6;
                unlockable = true;
            }
            if(electricityTotal >= 70000){
                unlock = 7;
                unlockable = true;
            }
            if(electricityTotal >= 80000){
                unlock = 8;
                unlockable = true;
            }
            if(electricityTotal >= 90000){
                unlock = 9;
                unlockable = true;
            }
            if(electricityTotal >= 100000){
                unlock = 10;
                unlockable = true;
            }
        }while(unlockable == false);
        return unlock;
    }
}
