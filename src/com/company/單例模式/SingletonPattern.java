package com.company.單例模式;

public class SingletonPattern {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.show();
    }
}
