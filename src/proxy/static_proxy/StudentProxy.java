package proxy.static_proxy;

/**
 * 学生代理类，实现于Person接口
 * 持有学生对象，则可以代理学生执行交班费的动作
 */
public class StudentProxy implements Person{

    Student stu;

    public StudentProxy(Person stu) {
        this.stu = (Student)stu;
    }

    // 代理上交班费，调用被代理（委托）学生的行为
    @Override
    public void payClassFees() {

        //可以在此加入附加方法
        beforeMethod();
        stu.payClassFees();
        //可以在此加入附加方法
        laterMethod();
    }

    public void beforeMethod() {
        System.out.println("Joe给我班费");
    }

    public void laterMethod() {
        System.out.println("Joe缴费完成");
    }
}

