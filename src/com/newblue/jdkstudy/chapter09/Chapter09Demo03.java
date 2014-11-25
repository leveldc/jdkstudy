package com.newblue.jdkstudy.chapter09;

/**
 * Created by levi on 2014/11/17.
 */
interface InfoA<T>{
    public T getInfo();
}
class InfoImpl<T> implements InfoA<T>{
    private T var;
    public InfoImpl(T var){
        this.setVar(var);
    }
    @Override
    public T getInfo() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public <C> C fun(C c){
        return c;
    }
}
public class Chapter09Demo03 {
}
