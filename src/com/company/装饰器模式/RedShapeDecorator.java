package 装饰器模式;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratoredShape) {
        super(decoratoredShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
