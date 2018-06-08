package com.kodilla.testing.forum.statistics;


public class ForumStatistics {


    private double averagePosts;
    private double averageComments;
    private double averageCommentsForPosts;



    public void calculateAdvStatistics(Statistics statistics) {

        int quantityOfUsers = statistics.usersNames().size();
        int quantityOfPosts = statistics.postsCount();
        int quantityOfComments = statistics.commentsCount();

        if (quantityOfUsers > 0) {
            averagePosts = (double) quantityOfPosts / (double) quantityOfUsers;
        } else {
            averagePosts = 0;
        }
        if (quantityOfUsers > 0) {
            averageComments = (double) quantityOfComments / (double) quantityOfUsers;
        } else {
            averageComments = 0;
        }

        if (quantityOfPosts > 0) {
            averageCommentsForPosts = (double) quantityOfComments / (double) quantityOfPosts;
        } else {
            averageCommentsForPosts = 0;
        }

        if (statistics.usersNames().size() > 0) {
            quantityOfUsers = statistics.usersNames().size();
        } else {
            quantityOfUsers = 0;
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

    public String showStatistics () {
       return "Average posts per one user equlas: " + averagePosts +"\nAverage comments per one user equals: " + averageComments +"\nAverage comments per one posts euqls: " + averageCommentsForPosts;
    }



}
