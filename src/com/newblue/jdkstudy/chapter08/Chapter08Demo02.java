package com.newblue.jdkstudy.chapter08;

/**
 * Created by levi on 2014/11/17.
 */
class MyThreadRun implements Runnable {
    private String name;

    public MyThreadRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + i);
        }
    }
}

public class Chapter08Demo02 {
    public static void main(String[] args) {
        MyThreadRun mtr1 = new MyThreadRun("线程1");
        MyThreadRun mtr2 = new MyThreadRun("线程2");
        Thread th1 = new Thread(mtr1);
        Thread th2 = new Thread(mtr2);
        th1.start();
        th2.start();
    }
}
