package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskLists {

    private ArrayList<Task> myTasks;
    final Scanner scan = new Scanner(System.in);
    
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

    public ArrayList<Task> getList() {
        return this.myTasks;
    }

    public void setToCompleted(int index) {
        try {
            if (myTasks.get(index).isCompleted()) {
                System.out.println("This task has already been marked as completed.");    
                return;
            }
            myTasks.get(index).setCompleted(true);
        } catch (Exception e) {
            System.out.println("Invalid task index. ");
        }
    }


    public void removeTask(int index) {
        
        myTasks.remove(index);
        
    }

    public int validateIndex(int index) {  
        try {
            var validation = myTasks.get(index);
            return index;
                    
        } catch (Exception e) {
            System.out.println("'" + index + "' is not a valid task Index");
            return validateIndex(scan.nextInt());
        }
    }
    
    
}
