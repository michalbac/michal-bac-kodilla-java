package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " completed\n");

    }

    @Test
    public void testCalculateStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        System.out.println(forumStatistics.showStatistics());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForPosts(), 0.1);
        Assert.assertEquals(0, forumStatistics.getAveragePosts(), 0.1);
        Assert.assertEquals(0, forumStatistics.getAvergaeComments(), 0.1);
    }

    @Test
    public void testCalculateStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        for (int n = 0; n < 100; n++) {
            users.add("User #" + n);};
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(forumStatistics.showStatistics());
        Assert.assertEquals(1, forumStatistics.getAverageCommentsForPosts(), 0.1);
        Assert.assertEquals(10, forumStatistics.getAveragePosts(), 0.1);
        Assert.assertEquals(10, forumStatistics.getAvergaeComments(), 0.1);
    }

    @Test
    public void testCalculateStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        for (int n = 0; n < 100; n++) {
            users.add("User #" + n);};
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(forumStatistics.showStatistics());
        Assert.assertEquals(5, forumStatistics.getAverageCommentsForPosts(), 0.1);
        Assert.assertEquals(10, forumStatistics.getAveragePosts(), 0.1);
        Assert.assertEquals(50, forumStatistics.getAvergaeComments(), 0.1);
    }

    @Test
    public void testCalculateStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        for (int n = 0; n < 100; n++) {
            users.add("User #" + n);};
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        when(statisticsMock.postsCount()).thenReturn(10000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(forumStatistics.showStatistics());
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsForPosts(), 0.1);
        Assert.assertEquals(100, forumStatistics.getAveragePosts(), 0.1);
        Assert.assertEquals(50, forumStatistics.getAvergaeComments(), 0.1);
    }

    @Test
    public void testCalculateStatisticsWithMock5() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        for (int n = 0; n < 127; n++) {
            users.add("User #" + n);};
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(2780);
        when(statisticsMock.postsCount()).thenReturn(765);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(forumStatistics.showStatistics());
        Assert.assertEquals(3.633986928, forumStatistics.getAverageCommentsForPosts(), 0.1);
        Assert.assertEquals(6.023622047, forumStatistics.getAveragePosts(), 0.1);
        Assert.assertEquals(21.88976378, forumStatistics.getAvergaeComments(), 0.1);
    }
}

