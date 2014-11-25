package com.newblue.patten.observer;

/**
 * Created by levi on 2014/11/24.
 */
public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StaticConditionsDisplay staticConditionsDisplay = new StaticConditionsDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(staticConditionsDisplay);
        weatherData.setMeasurements(10f,13f,19f);
        weatherData.setMeasurements(22f,15f,19f);
    }
}
