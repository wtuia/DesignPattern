package factory_pattern;

public class PizzaMain {

    public static void main(String[] args) {

        //创建商店实例
        PizzaStore store = new ZHPizzaStore();

        //在店里下单
       Pizza pizza = store.orderPizza("ChinesePizza");

    }
}
