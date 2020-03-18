package design_pattern.decorator.beverage.main;

import design_pattern.decorator.beverage.component.Beverage;
import design_pattern.decorator.beverage.component.Espresso;
import design_pattern.decorator.beverage.decorator.Milk;
import design_pattern.decorator.beverage.decorator.MoCha;

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

