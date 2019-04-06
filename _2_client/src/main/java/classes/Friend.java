package classes;

import javafx.scene.image.ImageView;

public class Friend {
    private String Username;
    private int Polarscore;
    private ImageView Badge;

    public Friend(User user) {
        Username = user.getUsername();
        Polarscore = user.getPolarScore();
        Badge = new ImageView(UserBadge.miniiconChoice(user));
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getPolarscore() {
        return Polarscore;
    }

    public void setPolarscore(int polarscore) {
        Polarscore = polarscore;
    }

    public ImageView getBadge() {
        return Badge;
    }

    public void setBadge(ImageView badge) {
        Badge = badge;
    }
}
