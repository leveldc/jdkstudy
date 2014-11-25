package com.newblue.patten.observer;

/**
 * Created by levi on 2014/11/24.
 */
public class StaticConditionsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    @Override
    public void display() {
        StringBuffer sb = new StringBuffer();
        sb.append("StaticConditionsDisplay");
        sb.append("温度:"+ this.temp);
        sb.append("湿度:"+this.humidity);
        sb.append("压力:"+this.pressure);
        System.out.println(sb);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
