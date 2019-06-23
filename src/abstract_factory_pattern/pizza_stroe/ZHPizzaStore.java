package abstract_factory_pattern.pizza_stroe;

import abstract_factory_pattern.ingredient_factory.PizzaIngredientFactory;
import abstract_factory_pattern.ingredient_factory.ZHIngredientFactory;
import abstract_factory_pattern.pizza.ChinesePizza;
import abstract_factory_pattern.pizza.Pizza;

public class ZHPizzaStore extends PizzaStore {


    // 原料工厂可以默认指定，则使用当地的食材
    PizzaIngredientFactory factory = new ZHIngredientFactory();

    // 商店也可以使用其他地方的原料
    public ZHPizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public ZHPizzaStore() {}

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("ChinesePizza")) {
            pizza = new ChinesePizza(factory);
        }
        return pizza;
    }
}
