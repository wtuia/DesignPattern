package design_pattern.abstract_factory;

import design_pattern.abstract_factory.pizza.Pizza;
import design_pattern.abstract_factory.pizza_stroe.PizzaStore;
import design_pattern.abstract_factory.pizza_stroe.ZHPizzaStore;

public class PizzaMain {

    public static void main(String[] args) {

        //创建商店实例
        PizzaStore store = new ZHPizzaStore();

        //在店里下单
       Pizza pizza = store.orderPizza("ChinesePizza");

    }
}

