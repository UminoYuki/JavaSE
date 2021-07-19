package com.yuki.operator;

//逻辑运算符
public class Deom05 {
    public static void main(String[] args) {
        //与（and）  或（or）  非（取反）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: "+(a&&b)); //false 逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a || b: "+(a||b)); //true 逻辑或运算：两个变量有一个为真，则结果为true
        System.out.println("!(a && b): "+!(a&&b)); //true 如果为真，则变为假，如果为假则变为真

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4); //没有执行(c++<4)
        System.out.println(d); //false
        System.out.println(c); //5

        boolean e = (c>4)||(c++<4); //没有执行(c++<4)
        System.out.println(e); //false
        System.out.println(c); //5
    }
}
