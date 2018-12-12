package 代理模式;

public class RealSubject implements Subject {
    @Override
    public int study() {
        System.out.println("JAVA");
        return 1;
    }

    public String read(){
        System.out.println("阅读");
        return "张三";
    }
}
