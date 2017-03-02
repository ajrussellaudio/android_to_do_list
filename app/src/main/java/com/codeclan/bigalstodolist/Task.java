package com.codeclan.bigalstodolist;

import java.util.Date;

public class Task {

    private int id;
    private String name;
    private String description;
    private boolean completed;
    private Date dueDate;
    private int categoryId;

    public Task(String name, String description, boolean completed, Date dueDate, int categoryId) {
        this.id = 0;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
        this.categoryId = categoryId;
    }

    public Task(int id, String name, String description, boolean completed, Date dueDate, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    private void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }
}
