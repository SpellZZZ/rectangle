package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Rectangle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int w, int h) {
        this.height = h;
        this.width = w;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + id +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}