package design_pattern.abstract_factory.pizza;

import design_pattern.abstract_factory.ingredient.Cheese;
import design_pattern.abstract_factory.ingredient.Dough;

public abstract class Pizza {

    String name;

    // 声明原料
    Dough dough;
    Cheese cheese;

    // 抽象化制作方法,在制作之前应该向工厂先收集原料，不同的原料由子类实现
    public abstract void prepare();

    public void back() {
        System.out.println("等待20分钟..");
    }

    public void cut() {
        System.out.println("切割中...");
    }

    public void box() {
        System.out.println("打包完成");
    }
}


