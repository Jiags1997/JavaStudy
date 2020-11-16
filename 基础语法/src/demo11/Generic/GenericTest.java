package demo11.Generic;

public class GenericTest {
    public static void main(String[] args) {
        Student student=new Student();//可以定义正常格式的对象，然后通过传入参数确定泛型的数据类型
        student.setName("贾国胜");
        Student<Integer> student1=new Student<>();//也可以在创建对象时候，直接使用泛型格式，其成员变量
        //都将使用这个数据类型
        student1.setName(123);
        System.out.println(student.getName());
        System.out.println(student1.getName());
        //
        student.study("我要学习了");
        student1.study(3.444);
    }

}
