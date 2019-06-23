package observer_pattern.observer;


import observer_pattern.obserable.WeatherData;

public class ObserverTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay ccdis = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasures(11f, 22f, 33f);
       
    }
}
