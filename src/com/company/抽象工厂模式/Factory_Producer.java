package com.company.抽象工厂模式;

public class Factory_Producer {
    public static AbstrcatFactory getFactory(String factoryType){
        if(factoryType == null)
            return null;

        if(factoryType.equalsIgnoreCase("Shape"))
            return new Shape_Factory();
        else if(factoryType.equalsIgnoreCase("Color"))
            return new Color_Factory();

        return null;
    }
}
