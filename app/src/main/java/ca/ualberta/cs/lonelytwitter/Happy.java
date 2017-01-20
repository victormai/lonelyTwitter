package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by vmai on 1/19/17.
 */

public class Happy extends Mood {

    public Happy(String mood) {
        super(mood);
    }

    public Happy(Date date, String mood) {
        super(date, mood);
    }

    public String getMood(){
        return "Happy";
    }

    @Override
    public Boolean isSad(){
        return false;
    }
}
