package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by watts1 on 1/28/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Test Tweet 1");
        tweets.add(tweet1);

        Tweet tweet2 = new NormalTweet("Test Tweet 2");
        tweets.add(tweet2);

        Tweet tweet3 = new NormalTweet("Test Tweet 3");
        tweets.add(tweet3);

        assertEquals(3,tweets.getCount());
    }


    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Another Test Tweet 1");
        Tweet tweet2 = new NormalTweet("Another Test Tweet 2");
        Tweet tweet3 = new NormalTweet("Another Test Tweet 3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        Tweet returnedTweet1 = tweets.getTweet(0);
        Tweet returnedTweet2 = tweets.getTweet(1);
        Tweet returnedTweet3 = tweets.getTweet(2);

        assertEquals(returnedTweet1.getMessage(), tweet1.getMessage());
        assertEquals(returnedTweet1.getDate(), tweet1.getDate());
        assertEquals(returnedTweet2.getMessage(), tweet2.getMessage());
        assertEquals(returnedTweet2.getDate(), tweet2.getDate());
        assertEquals(returnedTweet3.getMessage(), tweet3.getMessage());
        assertEquals(returnedTweet3.getDate(), tweet3.getDate());

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }


}
