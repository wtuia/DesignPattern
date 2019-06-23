package proxy.static_proxy;

public class Test {

    public static void main(String[] args) {

        // 被代理的学生Joe，上交班费动作由monitor（班长）完成
        Person joe = new Student("joe");

        // 代理对象,传入Joe
        Person monitor = new StudentProxy(joe);

        // 班长代缴
        monitor.payClassFees();
    }
}

