package design_pattern.abstract_factory.pizza;

import design_pattern.abstract_factory.ingredient_factory.PizzaIngredientFactory;

/**
 * 具体的pizza实体
 */
public class ChinesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public ChinesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
        this.name = "ChinesePizza";
    }

    public ChinesePizza() {
        this.name = "ChinesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("制作..."+name);
        dough = factory.createDough();
        cheese = factory.createChess();
    }
}

