package design_pattern.observer.observer;


import design_pattern.observer.obserable.WeatherData;

public class ObserverTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 新建观察者， 传入主题（被观察者），实现注册
        CurrentConditionDisplay ccdis = new CurrentConditionDisplay(weatherData);
        ccdis.display();
        System.out.println("---执行更新---");
        weatherData.setMeasures(11f, 22f, 33f);
        System.out.println("---执行更新---");
        weatherData.setMeasures(1f, 2f, 3f);
        weatherData.removeObserver(ccdis);
        System.out.println("---执行更新---");
        weatherData.setMeasures(11f, 22f, 33f);
       
    }
}
