package com.yuki.operator;

import com.yuki.base.*; //通配符

public class Deom08 {
    public static void main(String[] args) {
        //三元运算符
        // x ? y : z
        //如果为x==true，则结果为y，否则为z

        int score = 80;
        String type = score<60?"不及格":"及格";
        System.out.println(type); //及格



    }
}
