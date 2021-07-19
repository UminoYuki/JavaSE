package com.yuki.struct;

import java.util.Scanner;

public class ifDemo02 {
    //考试分数大于60则及格，小于60则不及格
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");

        if(scanner.hasNextInt()){
            int score = scanner.nextInt();

            if(score>=60){
                System.out.println("及格！");
            }else{
                System.out.println("不及格!");
            }
        }

        scanner.close();
    }
}
