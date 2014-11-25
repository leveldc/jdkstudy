package com.newblue.jdkstudy.chapter09;

/**
 * Created by levi on 2014/11/17.
 */
class Point<T>{
    private T x;
    private T y;
    public  Point(){

    }
    public Point(T x,T y){
        this.x=x;
        this.y=y;
    }
    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
public class Chapter09Demo01 {
    public static void main(String[] args){
        Point<Integer> p = new Point<Integer>();
        p.setX(123);
        p.setY(222);

    }

}
