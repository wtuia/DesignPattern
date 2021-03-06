package design_pattern.abstract_factory.pizza_stroe;

import design_pattern.abstract_factory.ingredient_factory.PizzaIngredientFactory;
import design_pattern.abstract_factory.ingredient_factory.ZHIngredientFactory;
import design_pattern.abstract_factory.pizza.ChinesePizza;
import design_pattern.abstract_factory.pizza.Pizza;

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
