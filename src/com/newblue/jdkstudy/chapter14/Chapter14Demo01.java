package com.newblue.jdkstudy.chapter14;

/**
 * Created by levi on 2014/11/19.
 */
class Color{
    public static final Color RED = new Color("红色");
    public static final Color GREEN = new Color("绿色");
    public static final Color BLUE = new Color("蓝色");
    private String name;
    public Color(String color) {
        this.name = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Color getInstance(int i){
        switch(i){
            case 1:{
                return RED;
            }
            case 2:{
                return GREEN;
            }
            case 3:{
                return BLUE;
            }default:{
                return null;
            }
        }

    }
}
public class Chapter14Demo01 {
    public static void main(String args[]){
        Color c1 = Color.RED;
        System.out.print(c1.getName());
        Color c2  = Color.getInstance(3);
        System.out.print(c2.getName());

    }
}
