package factory;

public class ZHPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("ChinesePizza")) {
            pizza = new ChinesePizza();
        }
        return pizza;
    }
}
