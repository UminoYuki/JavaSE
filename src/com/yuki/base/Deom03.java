package com.yuki.base;

public class Deom03 {
    public static void main(String[] args) {
        int i =128;
        byte b = (byte) i; //内存溢出
        double a = i; //自动转换
        //强制转换  (类型)变量名  高-->低
        //自动转换   低-->高
        System.out.println(i); //182
        System.out.println(b); //-128
        System.out.println(a); //128

        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象转换为不相干的类型
        3.高到低，强制转换
        4.转换可能存在内存溢出，或者精度问题
         */

        System.out.println("=============");
        System.out.println((int)23.7); //23
        System.out.println(((int)-45.89f)); //-45

        System.out.println("=============");
        char c = 'a';
        int d = c + 1;
        System.out.println(d); //98
        System.out.println((char)d); //b

    }
}
