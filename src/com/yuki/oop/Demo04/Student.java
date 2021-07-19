package com.yuki.oop.Demo04;

//类
public class Student {

    /*
    1.提高程序的安全性，保护数据
    2.隐藏代码实现细节
    3.统一接口
    4.系统可维护性增加
     */

    private String name; //名字
    private int id; //学号
    private char sex; //性别
    private int age; //年龄

    //提供一些可以操作这个属性的方法
    //提供一些public的get、set方法

    //get获得这个数据
    public String getName(){
        return this.name;
    }

    //set给这个数据赋值
    public void setName(String name){
        this.name = name;
    }

    //快捷键：alt+ins
    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<0){
            this.age = 3;
        }else{
            this.age = age;
        }

    }
}
/*
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("yuki");
        System.out.println(s1.getName()); //yuki

        s1.setAge(-1);
        System.out.println(s1.getAge()); //3
    }
}
 */