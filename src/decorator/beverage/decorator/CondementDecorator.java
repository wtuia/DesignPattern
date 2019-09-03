package decorator.beverage.decorator;

import decorator.beverage.component.Beverage;

/**
 * 装饰者的超类
 */
public abstract class CondementDecorator extends Beverage{

    public abstract String getDescription();
}

