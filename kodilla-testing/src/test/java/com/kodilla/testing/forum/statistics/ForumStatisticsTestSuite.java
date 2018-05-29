//package com.kodilla.testing.forum.statistics;
//
//import org.junit.Assert;
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
//    public void testCalculateStatisticsWithMock() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<String> users = new ArrayList<String>();
//
//        //When
//        ForumStatistics forumStatistics = new ForumStatistics();
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        when(statisticsMock.usersNames()).thenReturn(users.size());
//        when(statisticsMock.commentsCount()).thenReturn(0);
//        when(statisticsMock.postsCount()).thenReturn(0);
//
//
//
//        //Then
//        Assert.assertEquals(0, statisticsMock.usersNames());
//    }
//}
