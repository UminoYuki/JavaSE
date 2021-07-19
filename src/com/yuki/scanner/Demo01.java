package com.yuki.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next(); //程序会等待输入完毕
            System.out.println("输出的内容为："+str);
        }

        //凡是IO流的类如果不关闭会一直占用资源，要养成良好的习惯用完就关掉
        scanner.close();

    }
}
