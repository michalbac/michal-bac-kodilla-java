package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics implements Statistics{

    @Override
    public List<String> usersNames() {
        return usersNames();
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
       return 0;
    }

    public int usersQuantity () {
        return usersNames().size();
    }

    double averagePosts;
    double averageComments;
    double averageCommentsForPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        int quantityOfUsers = usersQuantity();
        int quantityOfPosts = postsCount();
        int quantityOfComments = commentsCount();

        double usersQuantityDouble;
        usersQuantityDouble = (double) quantityOfUsers;

        double postsCountDobule;
        postsCountDobule = (double) quantityOfPosts;

        double commentsCountDouble;
        commentsCountDouble = (double) quantityOfComments;


        if (usersQuantityDouble > 0) {
            averagePosts = postsCountDobule / usersQuantityDouble;
        } else {
            averagePosts = 0;
        }
        if (usersQuantityDouble > 0) {
            averageComments = commentsCountDouble / usersQuantityDouble;
        } else {
            averageComments = 0;
        }

        if (postsCountDobule > 0) {
            averageCommentsForPosts = commentsCountDouble / postsCountDobule;
        } else {
            averageCommentsForPosts = 0;
        }
    }

    public double getAveragePosts (){
        return averagePosts;
    }

    public double getAvergaeComments () {
        return averageComments;
    }

    public double getAverageCommentsForPosts () {
        return averageCommentsForPosts;
    }

}
