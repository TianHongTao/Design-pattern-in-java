package com.company.抽象工厂模式;

import com.company.抽象工厂模式.Circle;
import com.company.抽象工厂模式.Rectangle;
import com.company.抽象工厂模式.Square;

public class Shape_Factory extends AbstrcatFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null)
            return null;
        if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("Square"))
            return new Square();

        return null;
    }
}
