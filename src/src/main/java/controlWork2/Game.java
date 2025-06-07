package controlWork2;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable, Comparable<Game> {
    String gamer;
    Integer raiting;
    Date gameDate;

    public Game(String gamer, Integer raiting) {
        this.gamer = gamer;
        this.raiting = raiting;
        this.gameDate = new Date();
    }

    @Override
    public int compareTo(Game other) {
        return other.raiting.compareTo(this.raiting);
    }
}
