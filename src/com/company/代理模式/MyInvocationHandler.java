package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    Subject realSubject;

    public MyInvocationHandler(Subject realSubject){
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(method.getName().equals("study")){
            int invoke = (int)method.invoke(realSubject, args);
            System.out.println("调用的是学习的方法");
            return invoke ;
        }else {
            String string = (String) method.invoke(realSubject,args) ;
            System.out.println("调用的是阅读的方法");
            return  string ;
        }
    }

}
