package hello;

import javax.persistence.*;

@Table(name = "solarpanels")
@Entity
public class SolarPanels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    private boolean solarPanels;

    public SolarPanels() {
    }

    public SolarPanels(String username, boolean solarPanels) {
        this.username = username;
        this.solarPanels = solarPanels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSolarPanels() {
        return solarPanels;
    }

    public void setSolarPanels(boolean solarPanels) {
        this.solarPanels = solarPanels;
    }
}
