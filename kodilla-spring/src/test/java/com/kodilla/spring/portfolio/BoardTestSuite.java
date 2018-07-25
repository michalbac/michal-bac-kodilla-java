package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList toDo = (TaskList) context.getBean("toDoList");
        TaskList inProgress = (TaskList) context.getBean("inProgressList");
        TaskList done = (TaskList) context.getBean("doneList");

        //When
        toDo.tasks.add("task1");
        inProgress.tasks.add("task2");
        done.tasks.add("task3");

        //Then
        Assert.assertEquals(1, toDo.tasks.size());
        Assert.assertEquals(1, inProgress.tasks.size());
        Assert.assertEquals(1, done.tasks.size());
    }
}
