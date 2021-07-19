package com.yuki.exception;

public class Test {
    public static void main(String[] args) {

        try {
            new Test().test01(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
    //假设这方法中，处理不了这个异常，在方法上抛出异常
    public void test01(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException(); //主动抛出异常,一般在方法中使用
        }
        //System.out.println(a/b);
        //Exception in thread "main" java.lang.ArithmeticException
    }
}
