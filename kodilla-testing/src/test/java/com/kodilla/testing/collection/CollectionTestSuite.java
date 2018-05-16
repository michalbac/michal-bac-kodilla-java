package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(list);
        //Then
        Assert.assertEquals(result, list);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(list);
        ArrayList<Integer> evens = new ArrayList<Integer>();
        evens.add(2);
        evens.add(4);
        //Then
        Assert.assertEquals(result, evens);
    }
}
