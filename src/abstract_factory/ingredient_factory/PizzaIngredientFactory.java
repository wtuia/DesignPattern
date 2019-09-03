package abstract_factory.ingredient_factory;

import abstract_factory.ingredient.Cheese;
import abstract_factory.ingredient.Dough;

/**
 * Pizza 原料工厂
 * 每个原料都有一种对应方法创建该原料
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Cheese createChess();


}
