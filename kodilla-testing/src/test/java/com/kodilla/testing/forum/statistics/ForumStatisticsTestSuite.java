//package com.kodilla.testing.forum.statistics;
//
//import org.junit.Assert;
//import org.junit.Ignore;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class ForumStatisticsTestSuite {
//    @Test
//    @Ignore
//    public void testCalculateStatisticsWithMock() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<String> users = new ArrayList<String>();
//
//        //When
//        ForumStatistics forumStatistics = new ForumStatistics();
//        Integer usersSize = users.size();
//        when(statisticsMock.usersNames()).thenReturn(usersSize);
//        when(statisticsMock.commentsCount()).thenReturn(0);
//        when(statisticsMock.postsCount()).thenReturn(0);
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//
//
//
//        //Then
//        Assert.assertEquals(0, forumStatistics.usersQuantity());
//    }
//}
