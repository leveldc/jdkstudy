package com.newblue.jdkstudy.chapter15;

/**
 * Created by levi on 2014/11/19.
 */
interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        Fruit f = null;
        try {
            //InputStream inputStream = Runtime.getRuntime().getClass().getClassLoader().getResourceAsStream("a.properties");
            //Properties  p = new Properties();
//            try {
//                p.load(inputStream);
//                System.out.println(p.getProperty("a"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }printStackTrace
            f = (Fruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return f;
    }
}

public class Chapter15Demo04 {
    public static void main(String args[]) {
        Fruit f = Factory.getInstance("com.newblue.jdkstudy.chapter15.Apple");
        f.eat();
    }
}
