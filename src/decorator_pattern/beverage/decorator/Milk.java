package decorator_pattern.beverage.decorator;

import decorator_pattern.beverage.component.Beverage;

/**
 * 装饰者
 */
public class Milk extends CondementDecorator {
    
    Beverage beverage;
    
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

}
