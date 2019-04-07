package CSS;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;

/**
 * css electricity badge.
 */
public class CsselectricityBadge {
    /**
     * Sets electricity 1 style.
     *
     * @param button       button parameter.
     * @param unlockNumber unlock number parameter.
     */
    public static void setElectricity1(final Button button, final int unlockNumber) {

        if (unlockNumber < 1) {
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
                            + " url('https://i.ibb.co/TgCgfr9/electricity1-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/4fYS0q9/electricity1.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity2(final Button button, final int unlockNumber) {
        if (unlockNumber < 2) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png');"
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic: "
                            + "url('https://i.ibb.co/89dBL9Z/electricity2-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/ZmDnjQY/electricity2.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity3(final Button button, final int unlockNumber) {
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
                            + " url('https://i.ibb.co/VjwL5fj/electricity3-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/WfZgJpV/electricity3.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity4(final Button button, final int unlockNumber) {
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
                            + " url(' https://i.ibb.co/F440JFB/electricity4-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/nsFK9qz/electricity4.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity5(final Button button, final int unlockNumber) {
        if (unlockNumber < 5) {
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
                            + " url('https://i.ibb.co/WgFLSTk/electricity5-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: "
                            + "url('https://i.ibb.co/WHCcbY2/electricity5.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity6(final Button button, final int unlockNumber) {
        if (unlockNumber < 6) {
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
                            + " url(' https://i.ibb.co/MhYj01V/electricity6-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/8BcFLRg/electricity6.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity7(final Button button, final int unlockNumber) {
        if (unlockNumber < 7) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); "
                            + "-fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/fkXCsKy/electricity7-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/8jz0k5p/electricity7.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity8(final Button button, final int unlockNumber) {
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
                            + " url(' https://i.ibb.co/v3nCkPH/electricity8-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/r02HtdS/electricity8.png');"
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }

    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity9(final Button button, final int unlockNumber) {
        if (unlockNumber < 9) {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/MsdMQF1/locked-hover.png');"
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/zRP1CXq/locked.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        } else {
            button.styleProperty().bind(Bindings.when(button.hoverProperty())
                    .then("-fx-graphic:"
                            + " url('https://i.ibb.co/P9tsdQC/electricity9-hover.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic:"
                            + " url('https://i.ibb.co/znNq6Gk/electricity9.png'); "
                            + "-fx-background-color: rgba(0,0,0,0);"
                            + " -fx-border-color: rgba(0,0,0,0);"));
        }
    }


    /**
     * Sets electricity style .
     *
     * @param button       button parameter
     * @param unlockNumber unlock number parameter
     */
    public static void setElectricity10(final Button button, final int unlockNumber) {
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
                            + "url('https://i.ibb.co/3BhCS1n/electricity10-hover.png');"
                            + "-fx-background-color: rgba(0,0,0,0); "
                            + "-fx-border-color: rgba(0,0,0,0);")
                    .otherwise("-fx-graphic: "
                            + "url('https://i.ibb.co/xq6pt06/electricity10.png'); "
                            + "-fx-background-color: rgba(0,0,0,0); "
                            + "-fx-border-color: rgba(0,0,0,0);"));
        }
    }
}
