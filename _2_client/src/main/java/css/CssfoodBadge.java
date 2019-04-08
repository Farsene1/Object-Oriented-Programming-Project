package css;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;

/**
 * CSSfoodBadge class.
 */
public class CssfoodBadge {
    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood1(final Button button, final int unlockNumber) {

        if (unlockNumber < 1) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png');"
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png');"
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/KDZK1WY/food1-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/pZgvZGg/food1-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood2(final Button button, final int unlockNumber) {
        if (unlockNumber < 2) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: "
                            + "url('https://i.ibb.co/pzPFvZr/food2-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/0BXBY6B/food2-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood3(final Button button, final int unlockNumber) {
        if (unlockNumber < 3) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MgR3Pbb/food3-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/2Mm890v/food3-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood4(final Button button, final int unlockNumber) {
        if (unlockNumber < 4) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/p4t97mm/food4-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/9YDZvHh/food4-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood5(final Button button, final int unlockNumber) {
        if (unlockNumber < 5) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); "
                            + "-fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/pbMVhBh/food5-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/2yk5mkN/food5-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood6(final Button button, final int unlockNumber) {
        if (unlockNumber < 6) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: "
                            + "url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/d6RKNDm/food6-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/1b6WZqn/food6-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood7(final Button button, final int unlockNumber) {
        if (unlockNumber < 7) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/qRCNCnZ/food7-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/8MX4TDm/food7-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood8(final Button button, final int unlockNumber) {
        if (unlockNumber < 8) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/qgLkZfx/food8-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/WHtnppf/food8-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0)"
                            + "; -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood9(final Button button, final int unlockNumber) {
        if (unlockNumber < 9) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/C9Xg09f/food9-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/z2grRsH/food9-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * SetFood method for badges.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setFood10(final Button button, final int unlockNumber) {
        if (unlockNumber < 10) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/bK6rYvQ/food10-400-copy.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); "
                            + "-fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zrQ9FjB/food10-400.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }
}

