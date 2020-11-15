package Demo01;

import java.util.*;

public class demo01 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"*"+i+"="+j*i+'\t');
            }
            System.out.println();

        }
        int[] a;
        a = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(a);
        System.out.println(content);
        Scanner in=new Scanner(System.in);
        List list=new ArrayList();
        list.add("A");
        list.add("B");

        //list.add(100);
        //1.当我们将一个对象放入集合中，集合不会记住此对象的类型，当再次从集合中取出此对象时，改对象的编译类型变成了Object类型，但其运行时类型任然为其本身类型。
        //2.因此，//1处取出集合元素时需要人为的强制类型转化到具体的目标类型，且很容易出现“java.lang.ClassCastException”异常。
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            String value= (String) list.get(i);
            System.out.println(value);
        }





    }
}
