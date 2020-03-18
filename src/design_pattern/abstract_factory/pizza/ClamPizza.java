package design_pattern.abstract_factory.pizza;

import design_pattern.abstract_factory.ingredient_factory.PizzaIngredientFactory;

/**
 * 具体的pizza
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
        this.name = "ClamPizza";
    }

   public ClamPizza() {
       this.name = "ClamPizza";
   }

    @Override
    public void prepare() {
        System.out.println("制作..."+name);
        dough = factory.createDough();
        cheese = factory.createChess();
    }
}

