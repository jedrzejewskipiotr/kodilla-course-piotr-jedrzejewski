package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    int userNumber;

    int postsNumber;
    int commentsNumber;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public int getUserNumber() {
        return userNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    void calculateAdvStatistics(Statistics statistics) {
        averagePostsPerUser = (double)statistics.postsCount()/statistics.usersNames().size();
        averageCommentsPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        averageCommentsPerPost = (double)statistics.commentsCount()/statistics.postsCount();

        userNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
    }
}



