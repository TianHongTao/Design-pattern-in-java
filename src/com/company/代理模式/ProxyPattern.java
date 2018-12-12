package 代理模式;

import java.lang.reflect.Proxy;

public class ProxyPattern {
    public static void main(String[] args){
        Image image = new ProxyImage("test.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();


        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                                                               new Class[]{Subject.class},
                                                               myInvocationHandler);
        proxyClass.study();
        proxyClass.read();

    }
}
