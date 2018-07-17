package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
@Autowired
@Qualifier("toDoList")
Board board;

    @Bean(name = "toDoList")
    @Scope("prototype")
    Board taskListToDo() {
        return new Board (new TaskList());
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    Board taskListInProgress() {
        return new Board (new TaskList());
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    Board taskListDone() {
        return new Board (new TaskList());
    }
}
