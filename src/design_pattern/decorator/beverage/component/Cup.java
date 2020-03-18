package design_pattern.decorator.beverage.component;

/**
 *杯容量对应的价格
 */
public class Cup {

    double cupsize;
    String cupname;
    
    
    public Cup(String cup) {
        cupname = cup;
        try {
            cupsize = this.getClass().getField(cup).getDouble(this.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 小
    public static double TALL   = .10;

    // 中
    public static double GRANDE = .20;

    // 大
    public static double VENTI  = .30;


    public double getCupsize() {
        return cupsize;
    }
    public String getCupname() {
        return cupname;
    }
    public void setCupsize(double cupsize) {
        this.cupsize = cupsize;
    }
    public void setCupname(String cupname) {
        this.cupname = cupname;
    }
    
}
