package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskListTest {
    
    private TaskLists myTasks;
    private Scanner scan;

    @BeforeEach
    void setup() {
        scan = new Scanner(System.in);
        myTasks = new TaskLists();
        myTasks.addTask("Task");   
    }

    @Test
    void addTaskDescriptionTest() {
        assertEquals("Task", myTasks.getList().get(0).getDescription());
    }

    @Test
    void addTaskIncompletedTest() {
        assertEquals(false, myTasks.getList().get(0).isCompleted());
    }

    @Test
    void addTaskCompletedTest() {
        myTasks.getList().get(0).setCompleted(true);
        assertEquals(true, myTasks.getList().get(0).isCompleted());
    }

    @Test
    void setToCompleteTest() {
        assertFalse(myTasks.getList().get(0).isCompleted());
        myTasks.setToCompleted(0);
        assertTrue(myTasks.getList().get(0).isCompleted());        
    }

    // @Test
    // void validateIndexTest() {
    //     assertEquals(0, myTasks.validateIndex(0));
    //     // assertFalse(myTasks.validateIndex(scan.nextInt()) == 1);
    // }

    @Test
    void removeTaskTest() {
        assertFalse(myTasks.getList().isEmpty());
        myTasks.removeTask(scan.nextInt());
        assertTrue(myTasks.getList().isEmpty());
    }
}
