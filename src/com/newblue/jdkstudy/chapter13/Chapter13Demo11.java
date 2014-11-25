package com.newblue.jdkstudy.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levi on 2014/11/19.
 */
class Student1{
    private String name;
    private int age;
    private List<Course> allCourses;
    public Student1(){
        this.allCourses = new ArrayList<Course>();
    }
    public Student1(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getAllCourses() {
        return allCourses;
    }
}
class Course{
    private String name;
    private int score;
    private List<Student1> studentList;
    public Course(){
        studentList = new ArrayList<Student1>();
    }
    public Course(String name,int score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Student1> getStudentList() {
        return studentList;
    }
}
public class Chapter13Demo11
{

}
