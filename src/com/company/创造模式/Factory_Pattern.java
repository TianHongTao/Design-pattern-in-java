package com.company.创造模式;

public class Factory_Pattern {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}

interface Shape{
    void draw();
}

