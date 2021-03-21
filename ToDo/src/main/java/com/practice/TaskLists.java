package com.practice;

import java.util.HashMap;

public class TaskLists {
    private HashMap<Integer,Task> myTasks;
    private int size;

    public TaskLists() {
        myTasks = new HashMap<Integer,Task>();
        this.size = 0;
    }


    public void addTask(String description) {
        myTasks.put(size, new Task(description) );
    }
}
