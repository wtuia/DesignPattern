package strategy;

import strategy.quack_behavior.Quack;
import strategy.fly_behavior.FlyWithWings;

/**
 * 实现类在构造方法中指定所需实现，包含默认指定，也可通过setter (继承至DUck) 动态指定
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        this.fly = new FlyWithWings();
        this.quack = new Quack();
    }

    @Override
    void display() {
        System.out.println("绿头鸭，会飞，会叫");
    }
}
