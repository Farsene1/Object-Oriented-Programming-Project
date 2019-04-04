package CSS;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;

/**
 * Transport badge class.
 */
public class CSStransportBadge {
    /**
     * Acts differently wether its unlcoked or not and hovered or not.
     * SetTransport method css for badges.
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter.
     */
    public static void setTransport1(final Button button, final int unlockNumber) {

        if (unlockNumber < 1) {

            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/QJppnKz/transport1-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/k33fc0g/transport1.png'); "
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
    public static void setTransport2(final Button button, final int unlockNumber) {
        if (unlockNumber < 2) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/ChnJ7pJ/transport2-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/kGYYJN5/transport2.png'); "
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
    public static void setTransport3(final Button button, final int unlockNumber) {
        if (unlockNumber < 3) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/kyPw9WD/transport3-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/xJpZCND/transport3.png'); "
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
    public static void setTransport4(final Button button, final int unlockNumber) {
        if (unlockNumber < 4) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/VDhjz4Y/transport4-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url(' https://i.ibb.co/GkD8Lr2/transport4png.png'); "
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
    public static void setTransport5(final Button button, final int unlockNumber) {
        if (unlockNumber < 5) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/51SDhMd/transport5-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/1fZgN6N/transport5.png'); "
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
    public static void setTransport6(final Button button, final int unlockNumber) {
        if (unlockNumber < 6) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/6rQ7yCS/transport6-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/hRh8ptr/transport6.png'); "
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
    public static void setTransport7(final Button button, final int unlockNumber) {
        if (unlockNumber < 7) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/fDzhhML/transport7-hoverpng.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/qy2z5Qs/transport7.png'); "
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
    public static void setTransport8(final Button button, final int unlockNumber) {
        if (unlockNumber < 8) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/7QCvd2K/transport8-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/BT1STNF/transport8.png');"
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
    public static void setTransport9(final Button button, final int unlockNumber) {
        if (unlockNumber < 9) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/RDn9D74/transport9-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/n05kNyG/transport9.png'); "
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
    public static void setTransport10(final Button button, final int unlockNumber) {
        if (unlockNumber < 10) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: url('https://i.ibb.co/DQSK8QL/transport10-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: url('https://i.ibb.co/J7xjPy2/transport10.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
        }
    }
}
