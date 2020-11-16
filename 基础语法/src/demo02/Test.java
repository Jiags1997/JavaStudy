package demo02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        Person person=new Person();
        person.setName("贾国胜");
        System.out.println(person.getName());

         */
        methoParam(new Scanner(System.in));
        Scanner sc=methoParam();
        int num=sc.nextInt();
        System.out.println("输入的是："+num);

    }
    public static void methoParam(Scanner sc)
    {
        int num=sc.nextInt();
        System.out.println("输入的数字是："+num);
    }
    public static Scanner methoParam()
    {
        return new Scanner(System.in);
    }

}
