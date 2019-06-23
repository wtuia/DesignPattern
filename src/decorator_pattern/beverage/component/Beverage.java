package decorator_pattern.beverage.component;

/**
 * 抽象的饮料类，被装饰者
 *
 */
public abstract class Beverage {

    String description = "unknow Berverage";
    Cup cup;
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
}

