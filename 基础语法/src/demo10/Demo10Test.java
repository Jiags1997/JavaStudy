package demo10;

import java.util.Date;
import java.util.Objects;

public class Demo10Test {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("贾国胜");
        person.setAge(22);
        System.out.println(person);
        System.out.println(person.toString());
        System.out.println("=============");
        Person p1=new Person("迪丽热巴",25);
        Person p2=new Person("迪丽热巴",25);
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
        System.out.println(p1.equals(p2));
        System.out.println(
                Objects.equals(p1,p2)
        );
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date());
        System.out.println(new Date().getTime());

        String s1="abc";
        String s2="abc";
        System.out.println(s1.equals(s2));
    }
}
