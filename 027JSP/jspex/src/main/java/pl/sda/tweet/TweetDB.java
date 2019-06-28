package pl.sda.tweet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TweetDB {

    private static final List<Tweet> tweets = new ArrayList<>();

    private static final Comparator<Tweet> tweetComparator =
            Comparator
                    .comparing(Tweet::isPinned).reversed()
                    .thenComparing(Comparator.comparing(Tweet::getId).reversed());


    public static void add(String title, String text, boolean pinned) {
        Tweet tweet = new Tweet(title, text, pinned);
        tweets.add(tweet);
        tweets.sort(tweetComparator);
    }

    public static Optional<Tweet> getById(int id) {
        int indexOf = tweets.indexOf(new Tweet(id));
        return Optional.ofNullable(tweets.get(indexOf));
    }

    public static List<Tweet> getAll() {
        return tweets;
    }
}
