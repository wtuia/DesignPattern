package strategy_pattern.fly_behavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
