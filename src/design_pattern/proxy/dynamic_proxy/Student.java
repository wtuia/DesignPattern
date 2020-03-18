package design_pattern.proxy.dynamic_proxy;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void payClassFees() {
        try {
            // 数钱花1s
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "上交班费50");
    }

}

