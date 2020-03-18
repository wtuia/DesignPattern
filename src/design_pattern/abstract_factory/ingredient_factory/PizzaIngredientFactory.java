package design_pattern.abstract_factory.ingredient_factory;

import design_pattern.abstract_factory.ingredient.Cheese;
import design_pattern.abstract_factory.ingredient.Dough;

/**
 * Pizza 原料工厂
 * 每个原料都有一种对应方法创建该原料
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Cheese createChess();


}
