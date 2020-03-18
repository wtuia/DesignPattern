package design_pattern.proxy.my_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHadnler implements InvocationHandler {

    // 被代理对象
    private Object target;

    public MyInvocationHadnler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("invoking sayHello");

        /*
         *  返回的是Object
         *
         *   Object result = method.invoke(target, args);
         *
         *   return result;
         *
         */
        return  method.invoke(target, args);


    }
}
