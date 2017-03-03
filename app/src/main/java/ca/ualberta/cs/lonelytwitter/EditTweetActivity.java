/*
 * Copyright (c) 2017 Team Test, CMPUT301, University of Alberta - All Rights Reserved
 * You may use, distribute or modify this code under the terms and conditions of Code of Student - Behavior at the University of Alberta.
 * You can find a copy of the scope in this project, otherwise contact via email.
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EditTweetActivity extends Activity {


    private ListView tweetsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweetsList = (ListView) findViewById(R.id.TweetsList);

        Gson gson = new Gson();
        String strObj = getIntent().getStringExtra("tweet");
        Tweet editTweet = gson.fromJson(strObj, Tweet.class);


    }

}
