package com.yuki.struct;
import java.util.Scanner;

public class ifDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");

        if(scanner.hasNextInt()){
            int score = scanner.nextInt();

            if(score==100){
                System.out.println("恭喜满分！");
            }else if(score<100 && score>=90){
                System.out.println("A级");
            }else if(score<90 && score>=80){
                System.out.println("B级");
            }else if(score<80&&score>=70){
                System.out.println("C级");
            }else if(score<70&&score>=60){
                System.out.println("D级");
            }else if(score<60 && score>=0){
                System.out.println("不及格！");
            }else{
                System.out.println("成绩不合法！");
            }
        }

        scanner.close();
    }
}