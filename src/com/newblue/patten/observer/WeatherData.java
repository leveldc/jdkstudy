package com.newblue.patten.observer;

import java.util.Observable;

/**
 * Created by levi on 2014/11/24.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
