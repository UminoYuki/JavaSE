package com.yuki.oop.Demo01;

//学生类
public class Student {

    //熟悉；字段
    String name; //null
    int age; //0

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}

/*
public static void main(String[] args) {

        //类是抽象的，需要实例化
        //类实例化之后会返回一个自己的对象
        //student对象就是一个Student类的具体实例

        Student xiaoming = new Student();
        Student xiaohong = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name); //小明
        System.out.println(xiaoming.age); //3


    }
 */