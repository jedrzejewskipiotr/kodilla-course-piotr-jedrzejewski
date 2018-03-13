package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockZeroPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 0;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 200;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals(100, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(2, statisticsCalculator.getUserNumber());
        Assert.assertEquals(0, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(200, statisticsCalculator.getCommentsNumber());
    }

    @Test
    public void testCalculateAdvStatisticsWithMockZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 0;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(500, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( 0, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(2, statisticsCalculator.getUserNumber());
        Assert.assertEquals(1000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(0, statisticsCalculator.getCommentsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWithMockOneThousandPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 200;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(500, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0.2, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( 100, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(2, statisticsCalculator.getUserNumber());
        Assert.assertEquals(1000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(200, statisticsCalculator.getCommentsNumber());
    }

    @Test
    public void testCalculateAdvStatisticsWithMockMoreCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 1500;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(500, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(1.5, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( 750, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(2, statisticsCalculator.getUserNumber());
        Assert.assertEquals(1000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(1500, statisticsCalculator.getCommentsNumber());
    }

    @Test
    public void testCalculateAdvStatisticsWithMockLessCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 2000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 1500;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(1000, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0.75, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( 750, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(2, statisticsCalculator.getUserNumber());
        Assert.assertEquals(2000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(1500, statisticsCalculator.getCommentsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWithMockZeroUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 1500;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(Double.POSITIVE_INFINITY, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(1.5, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( Double.POSITIVE_INFINITY, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, statisticsCalculator.getUserNumber());
        Assert.assertEquals(1000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(1500, statisticsCalculator.getCommentsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWithMockOneHundredUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> userNames = new ArrayList<>();
        for (int i=0; i<100; i++){
            userNames.add("userName" + i);
        }
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 1500;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(10, statisticsCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(1.5, statisticsCalculator.getAverageCommentsPerPost(),0);
        Assert.assertEquals( 15, statisticsCalculator.getAverageCommentsPerUser(),0);
        Assert.assertEquals(100, statisticsCalculator.getUserNumber());
        Assert.assertEquals(1000, statisticsCalculator.getPostsNumber());
        Assert.assertEquals(1500, statisticsCalculator.getCommentsNumber());
    }
}
