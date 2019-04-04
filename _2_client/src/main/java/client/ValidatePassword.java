package client;

/**
 * Validation of password class.
 */
public class ValidatePassword {
    /**
     * Method for validating.
     *
     * @param password password parameter.
     * @return returns a string.
     */
    public static String validatePassword(final String password) {
        String res = "valid";
        int length = password.length();
        int numAmount = 0;
        int capAmount = 0;

        for (int i = 0; i < length; i++) {

            if (!((password.charAt(i) >= 47 && password.charAt(i) <= 58) || (password.charAt(i) >= 64 && password.charAt(i) <= 91)
                    || (password.charAt(i) >= 97 && password.charAt(i) <= 122))) {
                res = "Your password contains a forbidden character.";
            }

            if ((password.charAt(i) > 47 && password.charAt(i) < 58)) {
                numAmount++;
            }

            if ((password.charAt(i) > 64 && password.charAt(i) < 91)) {
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
