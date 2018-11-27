package 原型模式;
import java.util.*;

public class ShapeCache {
    private static HashMap<String,Shape> shapeHashMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeHashMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeHashMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashMap.put(rectangle.getId(),rectangle);
    }
}
