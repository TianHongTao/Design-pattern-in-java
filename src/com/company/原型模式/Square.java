package 原型模式;

public class Square extends Shape {

    public Square(){
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
