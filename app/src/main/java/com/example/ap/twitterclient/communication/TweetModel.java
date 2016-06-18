package com.example.ap.twitterclient.communication;

import com.example.ap.twitterclient.model.Tweet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evi on 3-6-2016.
 */
public class TweetModel {

    private static final String API_KEY = "eHc0tKg9NLwyrCHfZrxsFYU58";
    private static final String API_SECRET = "B1QHXI7AC5SUPxZFGE1cFsaf88FvjMsurJ3mx05VYZjmzTco0M";
    private String access_string;
    private List<Tweet> tweets= new ArrayList<>();


    private static TweetModel instance = null;
    private TweetModel(){

    }
    public static TweetModel getInstance(){
        if (instance == null){
            instance = new TweetModel();
        }
        return instance;
    }

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getApiSecret() {
        return API_SECRET;
    }

    public String getAccess_string() {
        return access_string;
    }

    public void setAccess_string(String access_string) {
        this.access_string = access_string;
    }

    public void addTweets(Tweet tweet){
        tweets.add(tweet);
    }

    public void clearTweetList(){
        tweets.clear();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}
