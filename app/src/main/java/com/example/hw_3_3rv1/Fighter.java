package com.example.hw_3_3rv1;



public class Fighter {

    private int imageDrawable;
    private String name;

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fighter(int imageDrawable, String name) {
        this.imageDrawable = imageDrawable;
        this.name = name;
    }
}