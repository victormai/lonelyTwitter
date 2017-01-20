package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by vmai on 1/19/17.
 */

public abstract class Tweet {
    private Date date;
    private String message;
    private ArrayList<Mood> moodList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public void addMood(Mood mood){
        moodList.add(mood);
    }

    public Boolean isImportant(){
        return false;
    }

}
