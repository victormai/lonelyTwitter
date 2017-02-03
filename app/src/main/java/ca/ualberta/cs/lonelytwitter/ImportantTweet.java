package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by vmai on 1/19/17.
 */

/**
 * Calls Tweet superclass for construction
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
