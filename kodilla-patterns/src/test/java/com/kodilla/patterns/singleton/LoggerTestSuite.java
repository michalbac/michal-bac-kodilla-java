package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("log no1");
        String log = logger.getLastLog();

        //Then
        Assert.assertEquals("log no1", log);
    }
}
