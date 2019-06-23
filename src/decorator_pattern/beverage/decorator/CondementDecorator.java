package decorator_pattern.beverage.decorator;

import decorator_pattern.beverage.component.Beverage;

/**
 * 装饰者的超类
 */
public abstract class CondementDecorator extends Beverage{

    public abstract String getDescription();
}

