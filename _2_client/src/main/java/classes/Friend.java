package classes;

import javafx.scene.image.ImageView;

public class Friend {
    private String username;
    private int polarScore;
    private ImageView badge;

    /**
     * Friend constrcutor.
     * @param user parameter user.
     */
    public Friend(User user) {
        username = user.getUsername();
        polarScore = user.getPolarScore();
        badge = new ImageView(UserBadge.miniiconChoice(user));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public int getPolarscore() {
        return polarScore;
    }

    public void setPolarscore(int polarscore) {
        polarScore = polarscore;
    }

    public ImageView getBadge() {
        return badge;
    }

    public void setBadge(ImageView badge) {
        badge = badge;
    }
}
