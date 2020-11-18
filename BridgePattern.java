package com.example.exerscise4;

public class BridgePattern {
    public static void main(String[] args) {
        Shape RIghtangle = new Tri( 20 ,90, 70, new RIghtangle() );
        Shape Triangle = new Tri( 100, 45, 35, new Triangle() );

        RIghtangle.draw();
        Triangle.draw();
    }
}
