package com.example.exampleproject_injava.activity.model;

public class Friendly {
    String nameStack;
    int image;
    String nameSmall;

    public Friendly(String nameStack,String nameSmall,int image) {
        this.nameStack = nameStack;
        this.image = image;
        this.nameSmall = nameSmall;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNameSmall() {
        return nameSmall;
    }

    public void setNameSmall(String nameSmall) {
        this.nameSmall = nameSmall;
    }

    public String getNameStack() {
        return nameStack;
    }

    public void setNameStack(String nameStack) {
        this.nameStack = nameStack;
    }
}
