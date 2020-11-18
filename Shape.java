package com.example.exerscise4;

public abstract class Shape {
    protected Draw drawapi;

    protected  Shape(Draw drawapi){
        this.drawapi =drawapi;
    }

    public abstract void draw();
}
