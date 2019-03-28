package classes;

public class UserBadge {

    static private String icon = "https://i.ibb.co/qskM93N/polar-alpha.png";

    static public String iconChoice(int number){

        if(number == 2){
          icon = "https://i.ibb.co/Sn20yTR/polar1.png";
        }

    return icon;
}

    static public String getIcon() {
        return icon;
    }



}