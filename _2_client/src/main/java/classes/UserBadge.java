package classes;



public class UserBadge {

    static String icon = "";

    static public String iconChoice(int number){

        if(number == 1){
          icon = "https://drive.google.com/uc?id=17b0fCmDcAogmyqUERNk7bMBOCRxwnYd_";
        }
        if(number == 2){
            icon = "https://drive.google.com/uc?id=1QV1p0s_JHtBfTx8-Vh_LgbucCgYWULrp";
        }
        if(number == 3){
            icon = "https://drive.google.com/uc?id=1RDJ3LQ7I5Bkezp8TN9umqC3bV9Dc-Az2";
        }
    return icon;
}

    static public String getIcon() {
        return icon;
    }




}