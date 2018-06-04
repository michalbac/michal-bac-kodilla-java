package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        Random generator = new Random();
        int [] numbers = new int[20];

        //When
        numbers[0] = 3;
        for(int i = 1; i <numbers.length; i++){
            numbers[i] = numbers[i-1] +2;
        };

        //Then
        Assert.assertEquals(22, ArrayOperations.getAverage(numbers), 0.1);

    }
}
