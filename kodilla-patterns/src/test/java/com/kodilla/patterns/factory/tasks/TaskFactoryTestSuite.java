package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void TestFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTaks(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Shopping task 1", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void TestFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTaks(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Painting task 1", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void TestFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTaks(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Driving task 1", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
    }
}
