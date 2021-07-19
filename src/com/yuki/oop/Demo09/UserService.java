package com.yuki.oop.Demo09;

//抽象的思维，Java  架构师
//interface 定义关键字，接口都需要有实现类
public interface UserService {
    //常量
    public static final int AGE = 99;

    //接口中的所有定义都是抽象的 public abstract

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
