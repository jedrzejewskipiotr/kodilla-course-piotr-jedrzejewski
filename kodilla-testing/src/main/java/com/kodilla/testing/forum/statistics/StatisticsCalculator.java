package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    Statistics statistics;

    public StatisticsCalculator(Statistics statistics){
        this.statistics = statistics;
    }

     int calculateAveragePostsPerUser(Statistics statistics) {
        return statistics.postsCount()/statistics.usersNames().size();
    }
}



