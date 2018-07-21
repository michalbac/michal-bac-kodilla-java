package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
@Autowired
Board board;

    @Bean public Board board() { return new Board(taskListToDo(), taskListInProgress(), taskListDone()); }

    @Bean(name = "toDoList")
    @Scope("prototype")
    TaskList taskListToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    TaskList taskListInProgress() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    TaskList taskListDone() {
        return new TaskList();
    }
}
