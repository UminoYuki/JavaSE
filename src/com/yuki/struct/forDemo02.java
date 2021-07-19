package com.yuki.struct;

public class forDemo02 {
    public static void main(String[] args) {

        for (int i = 0; i<=1000; i++){
            if(i%5==0){
                System.out.print(i+"\t"); //"\t"制表符
            }
            if(i%(5*3)==0){
                System.out.println();
                //System.out.print("\n"); //换行
            }
        }

        //println 输出完全换行
        //print  输出不完全换行
    }
}
