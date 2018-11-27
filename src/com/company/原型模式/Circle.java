package 原型模式;

public class Circle extends Shape {

    public Circle(){
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }
}
