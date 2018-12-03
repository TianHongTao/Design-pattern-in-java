package 装饰器模式;

public class ShapeDecorator implements Shape {
    protected  Shape decoratoredShape;

    public ShapeDecorator(Shape decoratoredShape){
        this.decoratoredShape = decoratoredShape;
    }

    @Override
    public void draw() {
        decoratoredShape.draw();
    }
}
