package decorator.beverage.main;

import decorator.beverage.component.Beverage;
import decorator.beverage.component.Espresso;
import decorator.beverage.decorator.Milk;
import decorator.beverage.decorator.MoCha;

public class BeverageTest {

    public static void main(String[] args) {

        // 生成组件  传入杯容量 可选项为：TALL、GRANDE、VENTI

        Beverage espresso = new Espresso("VENTI");

        // 调用装饰者
        espresso = new MoCha(espresso);
        espresso = new Milk(espresso);
        
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}

