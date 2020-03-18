package design_pattern.abstract_factory.ingredient_factory;

import design_pattern.abstract_factory.ingredient.Cheese;
import design_pattern.abstract_factory.ingredient.Dough;
import design_pattern.abstract_factory.ingredient.USCheese;
import design_pattern.abstract_factory.ingredient.USDough;

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

