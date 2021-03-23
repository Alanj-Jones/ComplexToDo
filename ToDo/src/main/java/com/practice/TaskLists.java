package com.practice;

import java.util.ArrayList;

public class TaskLists {

    private ArrayList<Task> myTasks;
    
    public TaskLists() {
        myTasks = new ArrayList<Task>();
    }
    
    public void addTask(String description) {
        myTasks.add(new Task(description));
    }
    
    public void printTasks() {
        for (Task t : myTasks) {
            System.out.println(myTasks.indexOf(t) + " | " + t.toString());
        }
    }

    


    // public void refreshtaskIndex() {
    //     size = 0;
    //     for (Map.Entry<Integer,Task> pair : myTasks.entrySet()) {
    //         var key = pair.getKey();
    //         var value = pair.getValue();
    //         myTasks.remove(key);
    //         myTasks.put(size, value);
    //         size++;
    //     }
    // }
    
}
