package ca.ualberta.cs.lonelytwitter;

/**
 * Created by vmai on 1/19/17.
 */

/**
 * Determines whether a tweet is too many characters
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String string)throws TweetTooLongException;
}
