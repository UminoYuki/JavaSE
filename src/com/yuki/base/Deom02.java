package com.yuki.base;

public class Deom02 {
    public static void main(String[] args) {
        //整数拓展：  进制  二进制0b  十进制  八进制0  十六进制0x

        int i = 10;
        int i2 = 010; //八进制0
        int i3 = 0x10; //十六进制0x

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("===分隔符===");
        //浮点数拓展  银行业务怎么表示？
        //BigDecimal

        //false   有限  离散  舍入误差  大约  接近但不等于
        //doule
        //最好完全不要使用浮点数进行比较
        //最好完全不要使用浮点数进行比较
        //最好完全不要使用浮点数进行比较

        float f = 0.1f; //0.1
        double d = 1.0/10;

        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);

        float d1 = 223233232f;
        float d2 = d1 + 1;
        System.out.println(d1==d2);//true

        //========================
        //字符拓展？
        //=========================
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1); //强制转换
        System.out.println(c2);
        System.out.println((int)c2); //强制转换

        //所有的字符本质还是数字
        //编码  Unicode  表：（97 = a  65 = A）  2字节  0 - 65536  Excel 2^16=65536

        // U0000 UFFF

        char c3 = '\u0061';
        System.out.println(c3); //a

        //转义字符
        // \t  制表符
        // \n  换行

        System.out.println("Hello\nWorld!");

        //
        String sa = new String("Hello World");
        String sb = new String("Hello World");
        System.out.println(sa==sb); //false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd); //true

        //布尔值扩展
        boolean flag = true;
        if(flag){}
        //Less is More!  代码要精简易读
    }
}
