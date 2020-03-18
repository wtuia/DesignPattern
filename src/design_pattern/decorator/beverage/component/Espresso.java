package design_pattern.decorator.beverage.component;

/**
 * 饮料组件 浓缩咖啡
 */
public class Espresso extends Beverage{

    public Espresso(String cupname) {
        this.cup = new Cup(cupname);
        description = "Espresso " + cup.getCupname();
    }
    
    @Override
    public double cost() {
        return 1.99  + cup.getCupsize();
    }

    
}
