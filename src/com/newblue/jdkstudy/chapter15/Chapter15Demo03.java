package com.newblue.jdkstudy.chapter15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by levi on 2014/11/19.
 */
interface A{
    public String say(String a, int b);
}
class AClass implements A{
    @Override
    public String say(String a, int b) {
        return a+"++"+b;
    }
}
class MyInvocationHandler implements InvocationHandler{
    private Object obj;
    public Object bind (Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp = method.invoke(this.obj,args);
        return temp;
    }
}
public class Chapter15Demo03 {
    public static void main(String args[]){
        A sub = (A)new MyInvocationHandler().bind(new AClass());
        String info = sub.say("李维",123);
        System.out.println(info);
    }
}
