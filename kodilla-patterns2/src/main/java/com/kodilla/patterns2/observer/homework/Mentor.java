package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

        public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorName + ": New homework was added to your list from student: " + student.getStudentName() + "\n" +
                " total homeworks to be reviewed: " + student.getHomeworks().size() + " homeworks");
        updateCount++;
    }
}
