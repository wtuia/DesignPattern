package decorator_pattern.beverage.component;

/**
 * 饮料组件
 */
public class HouseBlend extends Beverage {

    
    public HouseBlend(String cupname) {
        this.cup = new Cup(cupname);
        description = "HouseBlend " + cup.getCupname();
    }
    
    @Override
    public double cost() {
        return .89 + cup.getCupsize();
    }

}
