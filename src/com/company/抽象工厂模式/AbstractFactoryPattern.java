package com.company.抽象工厂模式;

public class AbstractFactoryPattern {
    public static void main(String[] args){
        AbstrcatFactory shapeFactory = Factory_Producer.getFactory("Shape");

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

        AbstrcatFactory colorFactory = Factory_Producer.getFactory("Color");

        Color color1 = colorFactory.getColor("Red");
        color1.fill();

        Color color2 = colorFactory.getColor("Blue");
        color2.fill();
    }
}

interface Shape{
    void draw();
}

interface Color{
    void fill();
}
