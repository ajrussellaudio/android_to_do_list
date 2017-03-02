package com.codeclan.bigalstodolist;

/**
 * Created by alanrussell on 02/03/2017.
 */

public class Category {

    private String name;
    private int id;

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
