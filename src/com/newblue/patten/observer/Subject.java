package com.newblue.patten.observer;


import java.util.Observer;

/**
 * Created by levi on 2014/11/24.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
