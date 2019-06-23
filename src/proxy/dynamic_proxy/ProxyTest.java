package proxy.dynamic_proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        //创建代理对象
        Person Joe = new Student("Joe");

        // 创建一个与代理对象相关联的 InvocationHandler
        InvocationHandler handler = new StuInvocationHandler<>(Joe);


        // 创建一个代理对象 stuProxy 代理Joe ，
        // 代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance
                        (Person.class.getClassLoader(), new Class<?>[]{Person.class}, handler);

        // 代理交班费的行为
        stuProxy.payClassFees();

    }


    @Test
    public void Demo1(){

    }
}




