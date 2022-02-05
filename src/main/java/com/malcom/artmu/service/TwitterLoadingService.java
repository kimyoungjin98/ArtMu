package com.malcom.artmu.service;

import com.malcom.artmu.config.TwitterAPI;
import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.signature.TwitterCredentials;

import java.time.LocalDateTime;

public class TwitterLoadingService {

    // 이 객체를 통해 트위터와 통신
    private TwitterClient twitterClient = new TwitterClient(TwitterCredentials.builder()
            .accessToken(TwitterAPI.ACCESS_TOKEN)
            .accessTokenSecret(TwitterAPI.ACCESS_TOKEN_SECRET)
            .apiKey(TwitterAPI.API_KEY)
            .apiSecretKey(TwitterAPI.API_KEY_SECRET)
            .build());

    public void TestTwitterLoading() {

    }
}
