package observer_pattern.obserable;

import observer_pattern.observer.Observer;

import java.util.ArrayList;

/**
 * 被观察则提供观察者的接口
 *
 * 当被观察者更新数据时，通知注册的观察者
 */
public class WeatherData implements Obserable{
    
    private ArrayList<Observer> observsers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
        super();
        observsers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observsers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observsers.contains(o)) {
            observsers.remove(o);
        }
    }


     //  更新所有对象
    @Override
    public void notifyObservers() {
        for(Observer o : observsers) {
            o.update(temperature, humidity, pressure);
        }
        
    }

    /**
     *   数据监听方法
     */
    private void measurementsChanged() {
        this.notifyObservers();
    }
    
    /**
     *  变更数据
     */
    public void setMeasures(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
