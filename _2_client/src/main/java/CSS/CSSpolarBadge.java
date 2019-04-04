package CSS;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;

/**
 * Polar Badge css.
 */
public class CSSpolarBadge {

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar1(final Button button, final int unlockNumber) {

        if (unlockNumber < 1) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/F7gtw3k/polar1-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Sn20yTR/polar1.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar2(final Button button, final int unlockNumber) {
        if (unlockNumber < 2) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/LnLPFQX/polar2-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/F47F81C/polar2.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar3(final Button button, final int unlockNumber) {
        if (unlockNumber < 3) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/pymBX0d/polar3-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/TL2vJkx/polar3.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar4(final Button button, final int unlockNumber) {
        if (unlockNumber < 4) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/M7j6PVn/polar4-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/q7sgXRy/polar4.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar5(final Button button, final int unlockNumber) {
        if (unlockNumber < 5) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/F7s5Fs8/polar5-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Q9J03vw/polar5.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar6(final Button button, final int unlockNumber) {
        if (unlockNumber < 6) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/L94KFvK/polar6-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Yd68SkW/polar6.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar7(final Button button, final int unlockNumber) {
        if (unlockNumber < 7) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/kSF2TQ3/polar7-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/MpyQ16G/polar7.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar8(final Button button, final int unlockNumber) {
        if (unlockNumber < 8) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/BcRKcjr/polar8-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/x6t0QTD/polar8.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar9(final Button button, final int unlockNumber) {
        if (unlockNumber < 9) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/x27wBSK/polar9-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/2tGhFdC/polar9.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetPolar method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setPolar10(final Button button, final int unlockNumber) {
        if (unlockNumber < 10) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/h2trK1F/polar10-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/Wz50t26/polar10.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }
}
