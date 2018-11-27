package 原型模式;

public class Rectangle extends Shape {

    public Rectangle(){
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
