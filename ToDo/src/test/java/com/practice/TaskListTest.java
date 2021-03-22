package com.practice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskListTest {
    
    private TaskLists tasks;

    @BeforeEach
    void setup() {
        tasks = new TaskLists();
    }
    @Test
    void getTasksHashMap() {
        assertNotNull(tasks.getTaskList());
        tasks.addTask("pp");
        System.out.println(tasks.getTaskList());
    }
}
