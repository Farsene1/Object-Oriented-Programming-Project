package client;

import classes.Badges;
import classes.User;
import classes.UserBadge;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;

public class CSSpolarBadge {

    static private boolean unlocked = false;

    public static boolean setPolar1(Button button, int unlockNumber){

        if(unlockNumber<1)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/F7gtw3k/polar1-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Sn20yTR/polar1.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;

        }
    }

    public static boolean setPolar2(Button button, int unlockNumber){
        if(unlockNumber<2)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/LnLPFQX/polar2-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/F47F81C/polar2.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar3(Button button, int unlockNumber){
        if(unlockNumber<3)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/pymBX0d/polar3-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/TL2vJkx/polar3.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar4(Button button, int unlockNumber){
        if(unlockNumber<4)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/M7j6PVn/polar4-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/q7sgXRy/polar4.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar5(Button button, int unlockNumber){
        if(unlockNumber<5)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/F7s5Fs8/polar5-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Q9J03vw/polar5.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar6(Button button, int unlockNumber){
        if(unlockNumber<6)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/L94KFvK/polar6-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Yd68SkW/polar6.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar7(Button button, int unlockNumber){
        if(unlockNumber<7)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/kSF2TQ3/polar7-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/MpyQ16G/polar7.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar8(Button button, int unlockNumber){
        if(unlockNumber<8)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/BcRKcjr/polar8-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/x6t0QTD/polar8.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar9(Button button, int unlockNumber){
        if(unlockNumber<9)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/x27wBSK/polar9-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/2tGhFdC/polar9.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }

    public static boolean setPolar10(Button button, int unlockNumber){
        if(unlockNumber<10)
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = false;
            return unlocked;
        }
        else
        {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/h2trK1F/polar10-hover.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Wz50t26/polar10.png'); " +
                            "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
            unlocked = true;
            return unlocked;
        }
    }
}
