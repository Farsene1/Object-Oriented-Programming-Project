package hallo;

import javax.persistence.*;

@Table(name = "food")
@Entity

public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String username;
    private String mealType;
    private String date;
    private Integer score;

    public Food() {
    }

    public Food(String username, String mealType, String date, int score) {
        this.username = username;
        this.mealType = mealType;
        this.date = date;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Food{" + "username='" + username
                + '\'' + ", mealType='" + mealType + '\'' +
                +'\'' + ", date='" + date + '\'' +
                +'\'' + ", score='" + score + '\'' +
                '}';
    }
}
