package com.yuki.oop.Demo08;

//abstract 抽象类；类 extend：单继承  （但接口可以多继承）
public abstract class Action {

    //约束
    //abstract，抽象方法，只有方法名字，没有方法实现

    public Action() {
        System.out.println("无参构造");
    }

    public abstract void doSomething();

}
