package decorator_pattern.beverage.main;

import decorator_pattern.beverage.component.Beverage;
import decorator_pattern.beverage.component.Espresso;
import decorator_pattern.beverage.decorator.Milk;
import decorator_pattern.beverage.decorator.MoCha;

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

