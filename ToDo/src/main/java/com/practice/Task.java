package com.practice;

import java.util.UUID;

public class Task {

    private final UUID id;
    private String description;
    private boolean completed;

    public Task(UUID id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean isCompleted) {
        this.completed = isCompleted;
    }
}
