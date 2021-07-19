package com.yuki.oop.Demo05;

public class A extends B{
    //override 重写
    @Override //注解：有功能的注释
    public void test() {
        System.out.println("A=>test()");
    }
}
/*
public class Application {
    //静态方法和非静态方法区别很大！
    //静态方法是类的方法，而非静态的方法是对象的方法

    public static void main(String[] args) {
        //方法调用之和左边，定义的数据类型有关
        A a = new A();
        a.test(); //A

        //父类的引用指向了子类
        B b = new A(); // 子类重写了父类的方法
        b.test(); //A
    }
}

 */