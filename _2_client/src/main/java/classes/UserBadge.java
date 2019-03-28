package classes;



public class UserBadge {

    static String icon = "";

    static public String iconChoice(int number){

        if(number == 1){
          icon = "https://drive.google.com/uc?id=17b0fCmDcAogmyqUERNk7bMBOCRxwnYd_";
          System.out.println("1 selected");
        }
        if(number == 2){
            icon = "https://drive.google.com/uc?id=1QV1p0s_JHtBfTx8-Vh_LgbucCgYWULrp";
            System.out.println("2 selected");
        }
    return icon;
}

    static public String getIcon() {
        return icon;
    }




}