package design_pattern.strategy.quack_behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
