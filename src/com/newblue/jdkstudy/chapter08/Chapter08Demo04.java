package com.newblue.jdkstudy.chapter08;

/**
 * Created by levi on 2014/11/17.
 */
class MyThreadName implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName() + "正在运行");
        }
    }
}
public class Chapter08Demo04 {
    public static void main(String[] args) {
        MyThreadName myThreadName = new MyThreadName();
        Thread t = new Thread(myThreadName, "线程A");
        System.out.println("线程启动前" + t.isAlive());
        t.setDaemon(true);
        t.start();
    }
}
