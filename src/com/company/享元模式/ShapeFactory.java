package 享元模式;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put("Color", circle);
            System.out.println("Create circle of color : "+color);
        }

        return circle;
    }

}
