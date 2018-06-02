package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

        public Forum() {
            usersList.add(new ForumUser(1, "johnC",'M', LocalDate.of(2000,1,1), 80 ));
            usersList.add(new ForumUser(2, "ann123",'F', LocalDate.of(1998,11,21), 17 ));
            usersList.add(new ForumUser(3, "adam99",'M', LocalDate.of(1994,4,14), 126 ));
            usersList.add(new ForumUser(4, "MikeSmith",'M', LocalDate.of(1997,7,7), 267 ));
            usersList.add(new ForumUser(5, "Eve",'F', LocalDate.of(1996,8,19), 65 ));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}
