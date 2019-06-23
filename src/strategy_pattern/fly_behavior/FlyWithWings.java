package strategy_pattern.fly_behavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("会飞行");
    }
}
