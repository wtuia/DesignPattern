package proxy.my_dynamic_proxy;

import java.lang.reflect.Proxy;

public class MyDynamicProxy {

    public static void main(String[] args) {

        HelloImpl hello = new HelloImpl();


        MyInvocationHadnler hadnler = new MyInvocationHadnler(hello);

        Hello proxyHello =
                (Hello) Proxy.newProxyInstance
                        (HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces(), hadnler);

          proxyHello.sayHello();
    }

}
