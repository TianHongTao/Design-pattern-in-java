package 桥接模式;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing Circle[ color : green, radius : %d, x : %d, y : %d\n]",radius,x,y);
    }
}
