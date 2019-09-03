package abstract_factory.ingredient_factory;

import abstract_factory.ingredient.Cheese;
import abstract_factory.ingredient.Dough;
import abstract_factory.ingredient.USCheese;
import abstract_factory.ingredient.USDough;

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

