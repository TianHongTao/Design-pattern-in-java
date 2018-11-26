package com.company.创造模式;

public class ShapeFactory {
    public Shape getShape(String shapeType){

        if(shapeType == null)
            return null;

        if(shapeType.equals("Circle"))
            return new Circle();
        else if(shapeType.equals("Rectangle"))
            return new Rectangle();
        else if(shapeType.equals("Square"))
            return new Square();

        return null;
    }
}
