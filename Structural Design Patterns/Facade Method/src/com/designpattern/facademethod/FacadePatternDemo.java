package com.designpattern.facademethod;

//customer who visits the shapemaker to draw a shape
public class FacadePatternDemo {

    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        System.out.println();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
