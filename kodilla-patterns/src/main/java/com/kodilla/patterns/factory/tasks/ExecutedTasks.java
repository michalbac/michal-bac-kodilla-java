package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class ExecutedTasks {
    List<String> executedTaska = new ArrayList<>();

    public ExecutedTasks() {
        executedTaska.add("Shopping task 1");
        executedTaska.add("Shopping task 2");
        executedTaska.add("Painting task 1");
    }

    public List<String> getExecutedTaska(){
        return executedTaska;
    }
}
