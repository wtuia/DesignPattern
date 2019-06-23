package strategy_pattern;

import strategy_pattern.fly_behavior.FlyNoWay;

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
