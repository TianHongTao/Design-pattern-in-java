package com.company.抽象工厂模式;
import com.company.抽象工厂模式.Shape;

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
