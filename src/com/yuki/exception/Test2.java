package com.yuki.exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //快捷键：cutl+alt+t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace(); //打印错误的栈信息
        } finally {
        }
    }
}
