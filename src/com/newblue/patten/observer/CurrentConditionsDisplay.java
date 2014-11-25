package com.newblue.patten.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by levi on 2014/11/24.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        StringBuffer sb = new StringBuffer();
        sb.append("我是CurrentConditionsDisplay");
        sb.append("温度:"+ this.temp);
        sb.append("湿度:"+this.humidity);
        sb.append("压力:"+this.pressure);
        System.out.println(sb);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

        }
    }
}
