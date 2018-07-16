package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "TO DO";
    private static final String DESCRIPTION = "LIST OF TASK TO DO";

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> readTasks = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1,readTasks.size());

        //Clean up
        int id = readTasks.get(0).getId();
        taskListDao.delete(id);
    }
}
