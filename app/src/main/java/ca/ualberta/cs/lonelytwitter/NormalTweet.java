package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vmai on 1/19/17.
 */

/**
 * Calls Tweet superclass for construction
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}

