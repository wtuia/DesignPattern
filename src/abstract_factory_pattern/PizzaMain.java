package abstract_factory_pattern;

import abstract_factory_pattern.pizza.Pizza;
import abstract_factory_pattern.pizza_stroe.PizzaStore;
import abstract_factory_pattern.pizza_stroe.ZHPizzaStore;

public class PizzaMain {

    public static void main(String[] args) {

        //创建商店实例
        PizzaStore store = new ZHPizzaStore();

        //在店里下单
       Pizza pizza = store.orderPizza("ChinesePizza");

    }
}

