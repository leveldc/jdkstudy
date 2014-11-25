package com.newblue.jdkstudy.chapter13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by levi on 2014/11/18.
 */
class Person implements Comparable<Person>{
    public String name;
    public int age;
    public Person(String name, int age){
        this.age = age;
        this. name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
        if(this.name.equals(per.name)&&this.age==per.age){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (this.name+this.age).hashCode();
    }

    public String toString(){
        return "姓名："+this.name+"|年龄："+this.age;
    }

    @Override
    public int compareTo(Person person) {
        if(this.age> person.age){
            return 1;
        } else {
            if (this.age < person.age) {
                return -1;
            } else {
                return this.name.compareTo(person.name);
            }
        }
    }
}
class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }
    public void talk(){

    }
}

public class Chapter13Demo04 {
    public static void main(String[] args){
        Set<Person> alSet = new TreeSet<Person>();
        alSet.add(new Person("张三",30));
        alSet.add(new Person("张四",31));
        alSet.add(new Person("张五",32));
        alSet.add(new Person("张五",32));
        alSet.add(new Person("张六",34));
        alSet.add(new Person("张七",34));
        alSet.add(new Person("王一",29));
        System.out.println(alSet);
    }
}
