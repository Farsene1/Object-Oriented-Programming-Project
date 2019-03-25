package hallo;

import javax.persistence.*;

@Table(name = "transport")
@Entity

public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String username;
    private String type;
    private Integer distance;
    private String date;
    private Integer score;

    public Transport() {
    }

    public Transport(String username, String type, Integer distance, int score, String date) {
        this.username = username;
        this.type = type;
        this.distance = distance;
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

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
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
                +'\'' + ", distance='" + distance + '\'' +
                +'\'' + ", date='" + date + '\'' +
                +'\'' + ", score='" + score + '\'' +
                '}';
    }
}
