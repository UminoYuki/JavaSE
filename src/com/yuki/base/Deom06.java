package com.yuki.base;

public class Deom06 {

    //类变量 static 从属于类
    static double salary = 2500;

    //属性；变量

    //实例变量，从属于对象；如果不进行初始化,这个类型的默认值 0 0.0
    //布尔值默认是false
    //除了基本类型，其余的默认值都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {

        //局部变量
        int i = 10;
        System.out.println(i); //10

        //变量类型  变量名字 = new com.yuki.base.Deom06();
        Deom06 deom06 = new Deom06();
        System.out.println(deom06.name); //null
        System.out.println(deom06.age); //0

        //类变量 static
        System.out.println(salary); //2500.0
    }

    //其他方法
    public void add(){
        // System.out.println(i); //无法输出
    }
}
