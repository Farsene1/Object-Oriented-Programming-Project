
import client.Achievements;
import client.AchievementsPolar;
import javafx.scene.layout.HBox;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AchievementsTest {

    HBox polarBox;
//    Hbox foodBox = new HBox();
//    Hbox transportBox = new HBox();
//    Hbox electricityBox = new HBox();

    /**
     * Test method for class PolarAchievements - getPolarBox.
     */
    @Test
    public void testGetPolarBox(){
     setPolarBox(polarBox);
     assertEquals(polarBox, AchievementsPolar.getPolarBox());
    }

    public void setPolarBox(HBox polarBox) {
        this.polarBox = polarBox;
    }

}
