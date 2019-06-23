package abstract_factory_pattern.pizza_stroe;

import abstract_factory_pattern.ingredient_factory.PizzaIngredientFactory;
import abstract_factory_pattern.ingredient_factory.USIngredientFactory;
import abstract_factory_pattern.pizza.ClamPizza;
import abstract_factory_pattern.pizza.Pizza;

/**
 * 实现PizzaStore接口。在设计模式中，实现接口广义上指继承和实现
 */
public class USPizzaStore extends PizzaStore {

    // 原料工厂可以默认指定，则使用当地的食材
    private PizzaIngredientFactory factory = new USIngredientFactory();

    // 商店也可以使用其他地方的原料
    public USPizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public USPizzaStore() {}

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("ClamPizza")) {
            pizza = new ClamPizza(factory);
        }
        return pizza;
    }
}

