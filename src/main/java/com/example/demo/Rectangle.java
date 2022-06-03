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



}