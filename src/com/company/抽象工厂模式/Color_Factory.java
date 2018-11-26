package com.company.抽象工厂模式;

public class Color_Factory extends AbstrcatFactory{
    @Override
    public Color getColor(String color) {
        if(color == null)
            return null;

        if(color.equalsIgnoreCase("Red"))
            return new Red();
        else if(color.equalsIgnoreCase("Blue"))
            return new Blue();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
