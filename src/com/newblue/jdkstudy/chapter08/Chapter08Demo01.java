package com.newblue.jdkstudy.chapter08;

class MyThread extends Thread {
    private String name = null;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 0;i<=10;i++){
            System.out.println("name:"+this.name+" i="+i);
        }
    }


}
public class Chapter08Demo01 {
    public static void main(String[] args){
        MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");
        mt1.start();
        mt2.start();

    }
}
