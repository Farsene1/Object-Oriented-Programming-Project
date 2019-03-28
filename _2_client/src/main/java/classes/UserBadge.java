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
        if(number == 4){
            icon = "https://drive.google.com/uc?id=1x2eBc7C6S7y9AYmXgd_owcm3N-VGBBlC";
        }
        if(number == 5){
            icon = "https://drive.google.com/uc?id=1ntFWJcZznAGh-b_AMFEZHo3GKZrCQceq";
        }
    return icon;
}

    static public String getIcon() {
        return icon;
    }




}