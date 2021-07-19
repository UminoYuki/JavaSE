package com.yuki.exception;

//自定义异常类
public class MyException extends Exception{

    //传递数字，大于10，抛出异常
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }
    //toString：异常的打印信息
    @Override
    public String toString() {
        return "MyException{" + detail + '}';
    }
}
