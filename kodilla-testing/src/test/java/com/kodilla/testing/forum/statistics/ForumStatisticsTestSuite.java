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
    public void testCalculateAdvStatisticsWithMock() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);

        List<String> userNames = new ArrayList<>();
        userNames.add("John Doe");
        userNames.add("Jane Doe");
        when(statistics.usersNames()).thenReturn(userNames);

        int mockNumberOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(mockNumberOfPosts);

        int mockNumberOfComments = 200;
        when(statistics.commentsCount()).thenReturn(mockNumberOfComments);

        //When
        int result = statisticsCalculator.calculateAveragePostsPerUser(statistics);

        //Then
        Assert.assertEquals(500, result);
    }
}
