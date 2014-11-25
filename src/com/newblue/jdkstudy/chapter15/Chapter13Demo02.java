package com.newblue.jdkstudy.chapter15;

/**
 * Created by levi on 2014/11/19.
 */
interface Subject{
    public String say(String name,int age);
}
class RealSubject implements Subject{
    @Override
    public String say(String name,int age) {
        return name+"="+age;
    }
}
class ProxySubject implements Subject{
    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }
    @Override
    public String say(String name, int age) {
        return subject.say(name,age);
    }
}

public class Chapter13Demo02 {
    public static void main(String args[]){
        Subject subject = new ProxySubject(new RealSubject());
        System.out.println(subject.say("李维",30));
    }
}
