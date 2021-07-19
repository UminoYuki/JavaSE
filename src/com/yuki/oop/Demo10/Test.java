package com.yuki.oop.Demo10;



public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用把实例保存在变量中

        new Apple().eat(); //1

        UserService userService = new UserService() {
            @Override
            public void hello() {

            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
    void hello();
}