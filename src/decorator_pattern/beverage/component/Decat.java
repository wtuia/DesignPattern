package decorator_pattern.beverage.component;

/**
 * 饮料组件
 *
 */
public class Decat extends Beverage {

    public Decat(String cupname) {
        this.cup = new Cup(cupname);
        description = "Decat " + cup.getCupname();
        
    }
    
    @Override
    public double cost() {
        return 1.29 + cup.getCupsize();
    }

}

