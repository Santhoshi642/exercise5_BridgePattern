package com.example.exerscise4;

public class Tri extends Shape {
    private int x,y,z;

    public Tri(int x,int y,int z,Draw drawapi){
        super(drawapi);
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public void draw() {
        drawapi.drawTriangle( x,y,z );

    }
}
