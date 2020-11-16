package demo11.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo11Iterator {
    public static void main(String[] args) {
        Collection <String>col=new ArrayList<>();
         col.add("科比");
        col.add("乔丹");
        col.add("詹姆斯");
        col.add("麦迪");
        col.add("艾佛森");
        //多态 //集合的iterator()方法返回迭代器对象
        Iterator<String> iterator=col.iterator();
        //hasNext()方法判断集合中是否还有下一个元素
        //next()方法去除集合下一个元素
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
