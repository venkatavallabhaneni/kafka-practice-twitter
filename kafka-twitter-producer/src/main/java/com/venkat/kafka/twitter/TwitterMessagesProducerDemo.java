package com.venkat.kafka.twitter;

import twitter4j.TwitterException;

public class TwitterMessagesProducerDemo {

    public static void main(String[] args) {

        TwitterStreamReader twitterStreamReader = new TwitterStreamReader();
        try {
            twitterStreamReader.readTweets(new String[]{"kafka","bitcoin","usa","andhra"});
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
}
