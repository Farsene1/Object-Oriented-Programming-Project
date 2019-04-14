package classes;

/**
 * Badges object.
 */
public class Badges {

    /**
     * Declare/initialize unlock value for unlocking methods.
     */
    private static int unlock = 0;

    /**
     * Method to unlock polar badges.
     *
     * @param user parameter user.
     * @return returns an int unlock
     */
    public static int polarUnlock(final User user) {
        /**
         * Calls get polar score // assigns to int value to be checked.
         */
        int polarTotal = user.getPolarScore();
        /**
         * Defaults to unlock polar badge 1 automatically.
         */
        unlock = 1;
        if (polarTotal >= 20000) {
            unlock = 2;
        }
        if (polarTotal >= 30000) {
            unlock = 3;
        }
        if (polarTotal >= 40000) {
            unlock = 4;
        }
        if (polarTotal >= 50000) {
            unlock = 5;
        }
        if (polarTotal >= 60000) {
            unlock = 6;
        }
        if (polarTotal >= 70000) {
            unlock = 7;
        }
        if (polarTotal >= 80000) {
            unlock = 8;
        }
        if (polarTotal >= 90000) {
            unlock = 9;
        }
        if (polarTotal >= 100000) {
            unlock = 10;
        }
        return unlock;
    }

    /**
     * parameter to unlock food badges.
     *
     * @param user user parameter
     * @return unlock int for food
     */
    public static int foodUnlock(final User user) {
        /**
         *   Calls get food score // assigns to int value to be checked.
         */
        int foodTotal = user.getFoodScore();
        /**
         * Defaults to unlock food badge 1 automatically.
         */
        unlock = 1;
        if (foodTotal >= 2000) {
            unlock = 2;
        }
        if (foodTotal >= 3000) {
            unlock = 3;
        }
        if (foodTotal >= 4000) {
            unlock = 4;
        }
        if (foodTotal >= 5000) {
            unlock = 5;
        }
        if (foodTotal >= 6000) {
            unlock = 6;
        }
        if (foodTotal >= 7000) {
            unlock = 7;
        }
        if (foodTotal >= 8000) {
            unlock = 8;
        }
        if (foodTotal >= 9000) {
            unlock = 9;
        }
        if (foodTotal >= 10000) {
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Returns an unlock for transport.
     *
     * @param user user parameter.
     * @return returns an int for unlocking badges
     */
    public static int transportUnlock(final User user) {
        /**
         * Calls get transport score // assigns to int value to be checked.
         */
        int transportTotal = user.getTransportScore();
        /**
         * Defaults to unlock transport badge 1 automatically.
         */
        unlock = 1;
        if (transportTotal >= 2000) {
            unlock = 2;
        }
        if (transportTotal >= 3000) {
            unlock = 3;
        }
        if (transportTotal >= 4000) {
            unlock = 4;
        }
        if (transportTotal >= 5000) {
            unlock = 5;
        }
        if (transportTotal >= 6000) {
            unlock = 6;
        }
        if (transportTotal >= 7000) {
            unlock = 7;
        }
        if (transportTotal >= 8000) {
            unlock = 8;
        }
        if (transportTotal >= 9000) {
            unlock = 9;
        }
        if (transportTotal >= 10000) {
            unlock = 10;
        }
        return unlock;
    }

    /**
     * Method to unlock electricity badges.
     *
     * @param user parameter user.
     * @return returns an int for unlocking.
     */
    public static int electricityUnlock(final User user) {
        /**
         * Calls get electricity score // assigns to int value to be checked.
         */
        int electricityTotal = user.getElectricityScore();

        /**
         * Defaults to unlock electricity badge 1 automatically.
         */
        unlock = 1;
        if (electricityTotal >= 20000) {
            unlock = 2;
        }
        if (electricityTotal >= 30000) {
            unlock = 3;
        }
        if (electricityTotal >= 40000) {
            unlock = 4;
        }
        if (electricityTotal >= 50000) {
            unlock = 5;
        }
        if (electricityTotal >= 60000) {
            unlock = 6;
        }
        if (electricityTotal >= 70000) {
            unlock = 7;
        }
        if (electricityTotal >= 80000) {
            unlock = 8;
        }
        if (electricityTotal >= 90000) {
            unlock = 9;
        }
        if (electricityTotal >= 100000) {
            unlock = 10;
        }
        return unlock;
    }

}
