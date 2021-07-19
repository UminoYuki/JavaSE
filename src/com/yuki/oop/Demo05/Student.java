package com.yuki.oop.Demo05;

//学生 is 人
//子类继承了父类，就会拥有父类的全部方法
public class Student extends Person{

    public Student(){
        //隐藏代码：默认调用了父类的无参构造
        super(); //调用父类构造器，必须在子类构造器的第一行
        System.out.println("Student无参执行了");
    }
    private String name = "yuki";

    public void print(){
        System.out.println("student");
    }

    public void test1(){
        print(); //student
        this.print(); //student
        super.print(); //person
    }


    public void test(String name) {
        System.out.println(name); //yooo
        System.out.println(this.name); //yuki
        System.out.println(super.name); //Yuki
    }
}
/*
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        //Person无参执行了
        //Student无参执行了
        student.test("yooo");
        student.test1();
    }
}
 */