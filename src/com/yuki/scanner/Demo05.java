package com.yuki.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求总和和平均数，输入非数字来结束输入
        Scanner scanner = new Scanner(System.in);


        //和
        double sum = 0;
        //计算输入了多少个数字
        int m =0;

        System.out.println("请输入数据：");
        //通过循环判断是否输入，并且在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m++;
            sum = sum + x;


        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值为"+(sum/m));

        scanner.close();
    }
}
