package com.yuki.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4,5);
    }

    public void test(int x, int... i){
        System.out.println(i[0]); //2
        System.out.println(i[1]); //3
        System.out.println(i[2]); //4
        System.out.println(i[3]); //5
    }
}
