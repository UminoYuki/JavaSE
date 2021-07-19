package com.yuki.array;

public class ArrayDemo {
    //变量类型  变量名字 = 变量的值

    public static void main(String[] args) {
        int[] nums; //定义，Java风格 1.声明一个数组
        // int nums2[]; //C/C++风格

        nums = new int[10]; //这里可以存放10个int类型的数据 2.创建一个数组

        //3.给数组元素赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        //计算所有元素的和
        int sum = 0;
        for (int i =0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
