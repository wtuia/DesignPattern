package simple_factory_pattern;

/**
 * pizza商品 制造pizza
 */
public class PizzaStore {

    Pizza pizza;

    SimplePizzaFactory factory;

    public void setFactory(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        pizza = factory.createPizza(type);

        // 调用pizza方法包装
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
