package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 所有执行代理对象的方法都会执行Invoke
 * @param <T> 代理对象
 */
public class StuInvocationHandler<T> implements InvocationHandler {

    // 被持有的代理对象
    protected T t;

    public StuInvocationHandler(){}

    public StuInvocationHandler(T t) {
        this.t = t;
    }

    /**
     *
     * @param proxy 动态代理对象
     * @param method 只在执行的方法
     * @param args 调用目标方法是传入的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行" + method.getName() + "方法");

        // 代理过程插入监测方法，计算方法耗时
        MonitorUtil.start();
        Object result = method.invoke(t,args);
        MonitorUtil.finish(method.getName());

        return result;
    }
}

