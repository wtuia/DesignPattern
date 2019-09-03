package abstract_factory.ingredient_factory;

import abstract_factory.ingredient.Cheese;
import abstract_factory.ingredient.ChinCheese;
import abstract_factory.ingredient.ChinDough;
import abstract_factory.ingredient.Dough;

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
