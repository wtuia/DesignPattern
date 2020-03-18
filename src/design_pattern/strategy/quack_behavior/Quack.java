package design_pattern.strategy.quack_behavior;

/**
 * 具体行为
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
