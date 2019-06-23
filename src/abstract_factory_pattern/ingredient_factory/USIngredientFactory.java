package abstract_factory_pattern.ingredient_factory;

import abstract_factory_pattern.ingredient.Cheese;
import abstract_factory_pattern.ingredient.Dough;
import abstract_factory_pattern.ingredient.USCheese;
import abstract_factory_pattern.ingredient.USDough;

public class USIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new USDough();
    }

    @Override
    public Cheese createChess() {
        return new USCheese();
    }
}

