package hello;

import javax.persistence.*;

@Table(name = "groceries")
@Entity

public class Groceries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String username;
    private String type;
    private String date;
    private Integer score;

    public Groceries() {
    }

    public Groceries(String username, String type, String date, int score) {
        this.username = username;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                + '\'' + ", type='" + type + '\'' +
                +'\'' + ", date='" + date + '\'' +
                +'\'' + ", score='" + score + '\'' +
                '}';
    }
}