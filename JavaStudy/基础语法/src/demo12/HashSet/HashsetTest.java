package demo12.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
   1.java.util.Set接口继承了Collection接口
   Set接口的特点：
   1.不允许有重复的元素
   2.Set集合中元素是无序的，没有索引不能使用简单的for循环遍历
   jva.util.HashSet实现了Set接口
   HashSet接口特点：
   1.不允许重复的元素
   2.没有索引，没有带索引的方法，不能使用普通的for循环
   3.是一个无序的集合。
   4.底层是哈希表结构，存储和查找快
 */
public class HashsetTest {

    public static void main(String[] args) {
        Set <String> set=new HashSet<>();
        set.add("鸣人");
        set.add("雏田");
        set.add("佐助");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("佐助"));
        System.out.println(set.remove("佐助"));
        //使用迭代器遍历集合
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            System.out.println(set.hashCode());
        }
        Person p1=new Person();
        Person p2=new Person();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println("================");
        String s1=new String("贾");
        String s2=new String("贾");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);



    }
}
