package simple_factory;

/**
 * 实例化工厂，根据传入的类型实例化对象
 */
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
