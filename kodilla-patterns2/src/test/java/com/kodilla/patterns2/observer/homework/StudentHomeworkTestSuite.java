package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentHomeworkTestSuite {
    @Test
    public void addHomeworkTest() {
        //Given
        Student john = new StudentJohn();
        Student mark = new StudentMark();
        Mentor jim = new Mentor("Jim");
        Mentor phil = new Mentor("Phil");
        john.registerObserver(jim);
        mark.registerObserver(phil);
        //When
        john.addHomework("For loop homework");
        john.addHomework("Hashmap homework");
        john.addHomework("SQL homework");
        mark.addHomework("While loop homework");
        mark.addHomework("ArrayList homework");
        //Then
        assertEquals(3, jim.getUpdateCount());
        assertEquals(2, phil.getUpdateCount());
    }
}
