package com.newblue.jdkstudy.chapter07;

/**
 * Created by levi on 2014/11/16.
 */
interface A{
    public void printInfo();
}

class X{
    public void fun1(){
        this.fun2(new A(){
            public void printInfo(){
                System.out.println("Hello world");
            };
        });
    }

    private void fun2(A a) {
        a.printInfo();
    }
}
public class InnerClassTest {
    public static void main(String[] args){
        new X().fun1();
    }
}
