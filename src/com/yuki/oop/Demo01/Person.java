package com.yuki.oop.Demo01;

//java --> class
public class Person {
    //即使什么也不写也存在一个方法
    //显示的定义构造器

    String name;
    //实例化初始值
    //使用new关键字，本质上是调用构造器
    //初始化值
    public Person(){
    }

    //有参构造：一旦定义了有参构造，无参构造必须显示定义
    public Person(String name){
        this.name = name;
    }
    //快捷键：alt+insert
}
/*
public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("yuki");
        System.out.println(person.name); //yuki

    }
 */