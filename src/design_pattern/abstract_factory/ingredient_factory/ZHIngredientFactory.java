package design_pattern.abstract_factory.ingredient_factory;

import design_pattern.abstract_factory.ingredient.Cheese;
import design_pattern.abstract_factory.ingredient.ChinCheese;
import design_pattern.abstract_factory.ingredient.ChinDough;
import design_pattern.abstract_factory.ingredient.Dough;

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
