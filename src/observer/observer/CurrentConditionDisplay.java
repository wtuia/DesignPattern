package observer.observer;

import observer.obserable.Obserable;

/**
 * 具体的观察者
 */
public class CurrentConditionDisplay implements DisaplyElement, Observer{
    
    private float temperature;
    private float humidity;
    private float pressure;
    private Obserable weather;
    
    public CurrentConditionDisplay() {
        super();
    }

    /**
     * 实例化时注册进主题(被观察者)中
     * @param weather 观察者
     */
    public CurrentConditionDisplay(Obserable weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    /**
     * 此方法由被观察者掉用，当主题对象获取到新数据时，通过此方法通知注册的观察者
     * @param temperature 天气参数
     * @param humidity 天气参数
     * @param pressure 天气参数
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
     System.out.println("当前"+temperature+","+humidity+","+pressure);
    }

}
