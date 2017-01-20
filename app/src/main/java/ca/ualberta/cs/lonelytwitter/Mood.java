package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vmai on 1/19/17.
 */

public abstract class Mood {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood(String mood){
        this.date = new Date();
    }

    public Mood(Date date, String mood){
        this.date = date;
    }

    public Boolean isSad(){
        return false;
    }

}
