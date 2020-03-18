package design_pattern.strategy;

import design_pattern.strategy.fly_behavior.FlyNoWay;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
        duck.quack();

        duck.setFlyBehavior(new FlyNoWay());
        duck.fly();
    }

}
