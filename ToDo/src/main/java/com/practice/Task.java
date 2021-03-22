package com.practice;

// import java.util.UUID;

public class Task {

    // private int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    // public UUID getId() {
    //     return id;
    // }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean isCompleted) {
        this.completed = isCompleted;
    }


    @Override
    public String toString() {
        return  "Description: " + getDescription() +
                ", Completed: " + isCompleted();
    }

    

}
