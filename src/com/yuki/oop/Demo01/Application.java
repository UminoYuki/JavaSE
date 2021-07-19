package com.yuki.oop.Demo01;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("yuki");
        System.out.println(person.name); //yuki

    }
}
