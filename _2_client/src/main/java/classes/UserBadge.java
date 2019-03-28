package classes;



public class UserBadge {

    static String icon = "";

    static public String iconChoice(int number){

        if(number == 2){
          icon = "https://i.ibb.co/Sn20yTR/polar1.png";
          System.out.println("2 sleected");
        }

    return icon;
}

    static public String getIcon() {
        return icon;
    }




}