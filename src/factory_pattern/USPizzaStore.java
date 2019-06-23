package factory_pattern;

/**
 * 实现PizzaStore接口。在设计模式中，实现接口广义上指继承和实现
 */
public class USPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("ClamPizza")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}

