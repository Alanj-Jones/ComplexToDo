package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTests {

    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task("New Task");
    }

    @Test
    void toStringTest() {
        assertEquals(   "Description: New Task, Completed: false",
                        "Description: " + task.getDescription() +
                        ", Completed: " + task.isCompleted()
                    );
    }

    @Test
    void getDescription() {
        assertEquals("New Task", task.getDescription());
    }

    @Test
    void changeDescriptionTest() {
        task.setDescription("I Changed");
        assertEquals("I Changed", task.getDescription());
    }

    @Test
    void getCompletedStatusFalse() {
        assertFalse(task.isCompleted());
    }

    @Test
    void getCompletedStatusTrue() {
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }
    
}
