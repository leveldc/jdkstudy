package com.newblue.jdkstudy.chapter08;

/**
 * Created by levi on 2014/11/17.
 */
class MyThreadTicketThread extends Thread {
    @Override
    public void run() {
        int ticket = 5;
        for (int i = 0; i <= 50; i++) {
            if (ticket < 0) return;
            System.out.println("买票" + ticket--);
        }
    }
}

class MyThreadTicketRun implements Runnable {
    int ticket = 5;
    @Override
    public void run() {

        for (int i = 0; i <= 50; i++) {
            if (ticket > 0) {
                System.out.println("买票" + ticket--);
            }
        }
    }
}

public class Chapter08Demo03 {
    public static void main(String[] args) {
        MyThreadTicketRun mtt1 = new MyThreadTicketRun();
        //MyThreadTicketRun mtt2 = new MyThreadTicketRun();
        new Thread(mtt1).start();
        new Thread(mtt1).start();
    }
}
