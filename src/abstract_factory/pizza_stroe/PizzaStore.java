package abstract_factory.pizza_stroe;

import abstract_factory.pizza.Pizza;

/**
 * 抽象pizza商店 定义制造pizza的方法，有具体商店实现
 */
public abstract class PizzaStore {

    Pizza pizza;

    public Pizza orderPizza(String type) {

        // 由子类决定创建方法
        pizza = createPizza(type);

        // 调用pizza方法包装
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

