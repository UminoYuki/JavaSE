package com.yuki.oop.Demo07;

//static：
public class Student {
    private static int age; //静态变量  多线程
    private double sorce; //非静态变量


    public void run(){

    }

    public static void go(){

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        //System.out.println(Student.sorce);
        System.out.println(s1.age);
        System.out.println(s1.sorce);

        go();
        //run();
        s1.go();
        s1.run();
    }

}
