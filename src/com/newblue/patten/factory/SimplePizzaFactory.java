package com.newblue.patten.factory;

/**
 * Created by levi on 2014/11/24.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        return new Pizza();
    }
}
