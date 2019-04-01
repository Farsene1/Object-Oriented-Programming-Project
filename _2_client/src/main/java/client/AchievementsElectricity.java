package client;

import classes.Badges;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class AchievementsElectricity {

        /**
         * Initializes boolean variable unlocked
         */
        static private boolean unlocked = false;

        static HBox electricityBox;

        public static void showElectricityBadges(User user) {

            /**
             * Calls method to unlock food badges, sets unlock value for CSS.
             */
            int electricityUnlock = Badges.electricityUnlock(user);

            electricityBox = new HBox();

            /**
             * Initialize buttons for electricity badges.
             */
            Button electricityBadge_1 = new Button();
            Button electricityBadge_2 = new Button();
            Button electricityBadge_3 = new Button();
            Button electricityBadge_4 = new Button();
            Button electricityBadge_5 = new Button();
            Button electricityBadge_6 = new Button();
            Button electricityBadge_7 = new Button();
            Button electricityBadge_8 = new Button();
            Button electricityBadge_9 = new Button();
            Button electricityBadge_10 = new Button();

            /**
             * Calls setPolar methods from CSS class to show locked / unlocked electricity badges.
             */
            CSSelectricityBadge.setElectricity1(electricityBadge_1, electricityUnlock);
            CSSelectricityBadge.setElectricity2(electricityBadge_2, electricityUnlock);
            CSSelectricityBadge.setElectricity3(electricityBadge_3, electricityUnlock);
            CSSelectricityBadge.setElectricity4(electricityBadge_4, electricityUnlock);
            CSSelectricityBadge.setElectricity5(electricityBadge_5, electricityUnlock);
            CSSelectricityBadge.setElectricity6(electricityBadge_6, electricityUnlock);
            CSSelectricityBadge.setElectricity7(electricityBadge_7, electricityUnlock);
            CSSelectricityBadge.setElectricity8(electricityBadge_8, electricityUnlock);
            CSSelectricityBadge.setElectricity9(electricityBadge_9, electricityUnlock);
            CSSelectricityBadge.setElectricity10(electricityBadge_10, electricityUnlock);

                    /**
         * Adds all badges for electricity to Hbox.
         */
        electricityBox.getChildren().addAll(electricityBadge_1, electricityBadge_2, electricityBadge_3, electricityBadge_4, electricityBadge_5,
                electricityBadge_6, electricityBadge_7, electricityBadge_8, electricityBadge_9, electricityBadge_10);
        }

        static public HBox getElectricityBox() {
            return electricityBox;
        }
    }
