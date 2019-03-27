package classes;

public class Badges {

    static private int unlock = 0;
    static private boolean unlockable = false;

    static public int polarUnlock(User user){

        unlock = user.getPolarScore();

        do {
            if(unlock >= 1000000){
                unlock = 10;
                unlockable = true;
            }
            if(unlock >= 900000){
                unlock = 9;
                unlockable = true;
            }
            if(unlock >= 800000){
                unlock = 8;
                unlockable = true;
            }
            if(unlock >= 700000){
                unlock = 7;
                unlockable = true;
            }
            if(unlock >= 600000){
                unlock = 6;
                unlockable = true;
            }
            if(unlock >= 500000){
                unlock = 5;
                unlockable = true;
            }
            if(unlock >= 400000){
                unlock = 4;
                unlockable = true;
            }
            if(unlock >= 300000){
                unlock = 3;
                unlockable = true;
            }
            if(unlock >= 200000){
                unlock = 2;
                unlockable = true;
            }
            if(unlock <= 100000){
                unlock = 1;
                unlockable = true;
            }

        }while(unlockable == false);

        return unlock;
    }
}
