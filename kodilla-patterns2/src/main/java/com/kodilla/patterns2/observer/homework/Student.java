package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String studentName;

    public Student(String studentName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addHomework(String homeworkName) {
        homeworks.add(homeworkName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }
}
