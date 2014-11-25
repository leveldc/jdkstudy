package com.newblue.jdkstudy.chapter08;

class ThreadSleep implements Runnable{
    private long time = 0;
    private String name;
    public ThreadSleep(String name,long time){
        this.name = name;
        this.time = time;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(time);
            System.out.println(name+"线程休眠"+time+"毫秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Chapter08Demo05 {
    public static void main(String args[]){
        ThreadSleep ts1 = new ThreadSleep("线程A",1000*10);
        ThreadSleep ts2 = new ThreadSleep("线程B",1000*20);
        ThreadSleep ts3 = new ThreadSleep("线程C",1000*30);
        new Thread(ts1).start();
        new Thread(ts2).start();
        new Thread(ts3).start();
    }
}
