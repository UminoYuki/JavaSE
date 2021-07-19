package com.yuki.struct;

public class structDemo02 {
    public static void main(String[] args) {
        String name = "Yuki";
        //JDK新特性，表达式是字符串！！！
        //字符的本质是数字

        //反编译  java-->class(字节码文件)---反编译（IDEA）


         switch (name){
             case "Yuki":
                 System.out.println("Yuki");
                 break;
             case "wang":
                 System.out.println("wang");
                 break;
             default:
                 System.out.println("未知");
                 break;
         }
    }
}
