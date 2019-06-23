package simple_factory_pattern;

public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza(String type) {

        if (type.equals("ClamPizza")) {
            pizza = new ClamPizza();
        }else if(type.equals("ChinesePizza")) {
            pizza = new ChinesePizza();
        }
        return pizza;
    }
}
