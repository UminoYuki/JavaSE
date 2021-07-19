package com.yuki.oop.Demo05;


//在Java中，所有的类，都默认直接或间接继承Object类

public class Person {

    public Person(){
        System.out.println("Person无参执行了");
    }

    protected  String name = "Yuki";

    //私有的东西无法被继承
    public void print(){
        System.out.println("person");
    }
}
