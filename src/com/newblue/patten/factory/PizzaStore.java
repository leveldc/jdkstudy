package com.newblue.patten.factory;

/**
 * Created by levi on 2014/11/24.
 */
public class PizzaStore {
    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }
}
