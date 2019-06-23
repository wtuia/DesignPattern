package abstract_factory_pattern.ingredient_factory;

import abstract_factory_pattern.ingredient.Cheese;
import abstract_factory_pattern.ingredient.ChinCheese;
import abstract_factory_pattern.ingredient.ChinDough;
import abstract_factory_pattern.ingredient.Dough;

public class ZHIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChinDough();
    }

    @Override
    public Cheese createChess() {
        return new ChinCheese();
    }
}
