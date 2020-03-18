package design_pattern.decorator.beverage.decorator;

import design_pattern.decorator.beverage.component.Beverage;

/**
 * 装饰者 具体添加的配料
 */
public class MoCha extends CondementDecorator {

    Beverage beverage;
    
    public MoCha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }

}
