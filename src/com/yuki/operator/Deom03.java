package com.yuki.operator;

public class Deom03 {
    public static void main(String[] args) {
        //关系运算符返回结果： 正确，错误  布尔值

        int a = 10;
        int b = 20;
        int c = 21;

        //模运算
        System.out.println(c%a); //1
        System.out.println(a>b); //false
        System.out.println(a<b); //true
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
    }
}
