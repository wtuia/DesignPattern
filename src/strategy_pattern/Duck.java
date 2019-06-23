package strategy_pattern;

import strategy_pattern.quack_behavior.QuackBehavior;
import strategy_pattern.fly_behavior.FlyBehavior;

/**
 * 定义鸭子的模型，超类
 */
public abstract class Duck {

    protected FlyBehavior fly;
    protected QuackBehavior quack;


    // 动态指定行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.fly = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quack = quackBehavior;
    }

    public void fly() {
        fly.fly();
    }

    public void quack() {
        quack.quack();
    }

    abstract void display();

}

