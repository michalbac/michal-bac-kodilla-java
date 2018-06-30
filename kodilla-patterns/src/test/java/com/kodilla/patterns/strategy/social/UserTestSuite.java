package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("YGeneration");
        User zGeneration = new ZGeneration("ZGeneration");

        //When
        String fb = millenials.sharePost();
        System.out.println("Millenials are using " + fb);
        String twit = yGeneration.sharePost();
        System.out.println("YGeneration is using " + twit);
        String snap = zGeneration.sharePost();
        System.out.println("ZGeneration is using " + snap);

        //Then
        Assert.assertEquals("Facebook", fb);
        Assert.assertEquals("Twitter", twit);
        Assert.assertEquals("Snapchat", snap);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Millenials");

        //When
        String regularMillenials = millenials.sharePost();
        System.out.println("Regular millenials are using " + regularMillenials);
        millenials.setSocialPublisher(new TwitterPublisher());
        String specificMillenials = millenials.sharePost();
        System.out.println("This Millenials is using " + specificMillenials);


        //Then
        Assert.assertEquals("Twitter", specificMillenials);
    }
}
