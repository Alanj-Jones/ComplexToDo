package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskListTest {
    
    private TaskLists myTasks;

    @BeforeEach
    void setup() {
        myTasks = new TaskLists();
        
    }
    @Test
    void addTaskTest() {
        myTasks.addTask("Task");
        myTasks.printTasks();
        // assertEquals(expected, actual);
    }
}
