package demo10.StringBuildder;

public class Demo10StringBuilder {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        String s = "hello";
        s += "Hinata";
        s = new String(array);
        s = new String("naruto");
        System.out.println(s);

        StringBuilder bu1=new StringBuilder("Naruto");
        StringBuilder bu2=bu1.append("-Hinata");//append()
        System.out.println(bu2);
        System.out.println(bu1==bu2);
        Integer i=3;
        i=i+3;
        System.out.println(i);
        //基本数据类型转换为字符串类型的三种方式：
        /*
        1.基本数据类型的值+" ";
        2.使用包装类的静态方法；
        public static String toSting(int i):返回一个指定参数的的String对象
        3.使用String类的静态方法；
        static  String valueOf(int i)：返回一个int参数的字符串表现形式

         */
        String str1=1+"";

        String str2=Integer.toString(6);
        String str3=String.valueOf(7);
        System.out.println(str1+str2+str3);



    }
}
