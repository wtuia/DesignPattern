package proxy.my_dynamic_proxy;

public class HelloImpl implements Hello{

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
