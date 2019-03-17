package client;

public class ValidatePassword {
    public static String validatePassword(String Password) {
        String res = "valid";
        int length = Password.length();
        int numAmount = 0;
        int capAmount = 0;

        for (int i=0; i < length; i++) {

            if (!((Password.charAt(i) >= 47 && Password.charAt(i) <= 58) || (Password.charAt(i) >= 64 && Password.charAt(i) <= 91) || (Password.charAt(i) >= 97 && Password.charAt(i) <= 122))) {
                res = "char";
            }

            if ((Password.charAt(i) > 47 && Password.charAt(i) < 58)) {
                numAmount++;
            }

            if ((Password.charAt(i) > 64 && Password.charAt(i) < 91)) {
                capAmount++;
            }
        }

        if (numAmount < 1) {
            res = "Your password must contain at least one number.";
        }

        if (capAmount < 1) {
            res = "Your password must contain at least one capital letter.";
        }

        if (length < 8) {
            res = "Your password must be at least 8 characters in length.";
        }

        return (res);
    }
}
