//package com.kodilla.testing.forum.statistics;
//
//import java.util.List;
//
//public class ForumStatistics {
//
//
//    public int usersQuantity () {
//        return Statistics.usersNames().size();
//    }
//
//    private double averagePosts;
//    private double averageComments;
//    private double averageCommentsForPosts;
//    private int quantityOfUsers = usersQuantity();
//    private int quantityOfPosts = Statistics.postsCount();
//    private int quantityOfComments = Statistics.commentsCount();
//
//    public void calculateAdvStatistics(Statistics statistics) {
//
//        if (quantityOfUsers > 0) {
//            averagePosts = quantityOfPosts / quantityOfUsers;
//        } else {
//            averagePosts = 0;
//        }
//        if (quantityOfUsers > 0) {
//            averageComments = quantityOfComments / quantityOfUsers;
//        } else {
//            averageComments = 0;
//        }
//
//        if (quantityOfPosts > 0) {
//            averageCommentsForPosts = quantityOfComments / quantityOfPosts;
//        } else {
//            averageCommentsForPosts = 0;
//        }
//    }
//
//    public double getAveragePosts (){
//        return averagePosts;
//    }
//
//    public double getAvergaeComments () {
//        return averageComments;
//    }
//
//    public double getAverageCommentsForPosts () {
//        return averageCommentsForPosts;
//    }
//
//}
