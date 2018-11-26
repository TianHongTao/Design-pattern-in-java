package com.company.抽象工厂模式;

import com.company.抽象工厂模式.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我是一个圆形!");
    }
}
