package com.malcom.artmu.service;

import com.malcom.artmu.config.TwitterAPI;
import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.dto.endpoints.AdditionalParameters;
import io.github.redouane59.twitter.dto.tweet.TweetList;
import io.github.redouane59.twitter.dto.tweet.TweetV2;
import io.github.redouane59.twitter.dto.user.UserV2;
import io.github.redouane59.twitter.signature.TwitterCredentials;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TwitterLoadingService {

    // 이 객체를 통해 트위터와 통신
    private TwitterClient twitterClient = new TwitterClient(TwitterCredentials.builder()
            .accessToken(TwitterAPI.ACCESS_TOKEN)
            .accessTokenSecret(TwitterAPI.ACCESS_TOKEN_SECRET)
            .apiKey(TwitterAPI.API_KEY)
            .apiSecretKey(TwitterAPI.API_KEY_SECRET)
            .build());

    public void TestTwitterLoading() {
        LocalDateTime endLocalDateTime = LocalDateTime.now();
        LocalDateTime startLocalDateTime = endLocalDateTime.minusDays(7);
        // 파라메터 설정
        AdditionalParameters additionalParameters = AdditionalParameters.builder()
                .startTime(startLocalDateTime)
                .endTime(endLocalDateTime)
                .maxResults(10)
                .build();

        /** 특정 유저의 트윗 가져오기*/
//        UserV2 userV2 = twitterClient.getUserFromUserName("@뺀 닉네임");
//        System.out.println("아이디 로딩 체크");
//        System.out.println("아이디 : " + userV2.getId());
//
//        TweetList tweetList =
//                twitterClient.getUserTimeline(userV2.getId(), additionalParameters);
//        System.out.println("트윗 로딩 체크");
//        System.out.println("가져온 트윗 수  : " + tweetList.getData().size() );
//        for(TweetV2.TweetData tweet : tweetList.getData()){
//            System.out.println("Id : " + tweet.getId());
//            System.out.println("text : " + tweet.getText());
//            System.out.println("=".repeat(10));
//        }

        /** 검색 */
        String query = "커미션";
        TweetList tweetList2 = twitterClient.searchAllTweets(query, additionalParameters);
        System.out.println("트윗 로딩 체크2");
        System.out.println("가져온 트윗 수2  : " + tweetList2.getData().size() );
        for(TweetV2.TweetData tweet : tweetList2.getData()){
            System.out.println("Id : " + tweet.getId());
            System.out.println("text : " + tweet.getText());
            System.out.println("=".repeat(10));
        }
    }
}
