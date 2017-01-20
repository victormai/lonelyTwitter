package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vmai on 1/19/17.
 */

public class Sad extends Mood {
    public Sad(String mood) {
        super(mood);
    }

    public Sad(Date date, String mood) {
        super(date, mood);
    }

    public String getMood(){
        return "Sad";
    }

    @Override
    public Boolean isSad(){
        return true;
    }
}
