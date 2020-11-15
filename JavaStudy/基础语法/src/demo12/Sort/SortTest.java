package demo12.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
   Collections 的Sort()方法
 */
public class SortTest {
    public static void main(String[] args) {
        List<Person> arraylist=new ArrayList<>();
         arraylist.add(new Person("鸣人",16));
        arraylist.add(new Person("佐助",17));
        arraylist.add(new Person("雏田",15));
        System.out.println(arraylist);
        //匿名内部类的方式，重写comparator的compare()方法，自定义排序的方式。
        Collections.sort(arraylist, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        //o1-o2升序
                        // return o1.getAge()-o2.getAge();
                        //o2-o1降序
                        return o2.getAge()-o1.getAge();
                    }
                }
        );
        System.out.println(arraylist);

    }
}
