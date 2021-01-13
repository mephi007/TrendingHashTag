import java.io.IOException;

import java.io.IOException;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterTrendingHastags {
    public static void main(String[] args) throws IOException, TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("bmP2Q0Q17RHItbpCiXOMXUt6W")
                .setOAuthConsumerSecret("x5xB8sDMa6U9yJ1bhfOqJPCSfsSrOkLfrfqYMwClscNRNPFEKr")
                .setOAuthAccessToken("1348503442382180352-t9VW9sQcx2dcHXwDgzwD7n5At8lzr5")
                .setOAuthAccessTokenSecret("gZXfDzRQpYc90Ewu1wGFdH5ezSVA69RFZ0YfDQOPkgV3j");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        Trends trends = twitter.getPlaceTrends(1);
        int count = 0;
        for (Trend trend : trends.getTrends()) {
            if (count < 10) {
                System.out.println(trend.getName());
                count++;
            }
        }
    }
}
