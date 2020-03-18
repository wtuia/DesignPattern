package design_pattern.strategy.fly_behavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("会飞行");
    }
}
