package proxy.static_proxy;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    // 实现Person 接口，本身可以具体执行交班费的行为
    @Override
    public void payClassFees() {
        System.out.println(name + "上交班费50");
    }

}
