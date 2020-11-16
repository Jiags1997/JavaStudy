package demo23FunctionalInterface.Lambda03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
  常用的函数式接口

 */
public class Demo {
    public static  int getInteger(Supplier<Integer> supplier){
        return  supplier.get();
    }
    public  static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
    public static void method(String name,Consumer<String> con1,Consumer<String> con2){
       /* con1.accept(name);
        con2.accept(name);*/
        con1.andThen(con2).accept(name);
    }

    public  static void pringInformation(String []arr,Consumer<String> con1,Consumer<String> con2){
        for (String str:arr) {
            con1.andThen(con2).accept(str);
        }
    }
    /*
      java.util.function.Predicate<T>接口
      作用：对某种数据类型的数据进行判断，结果返回一个boolean值
     */
    /*
      定义一个方法
      参数传递一个String 类型的字符串
      传递一个Predicate类型的接口，泛型使用String
      使用Predicate中的test()方法对字符窜的长度进行判断、
     */
    public static boolean judgeTest(String str, Predicate<String> predicate){
        return predicate.test(str);
    }
    /*
      predicate接口中有一个and()方法表示逻辑与 可以连接两个判断条件
      方法内部两个判断条件也是使用&&云算法连接起来的
      定义一个方法，方法传递一个字符串String str
      传递两个predicate 接口：
      一个用于判断字符串的长度是否大于5
      一个用于判断字符串中是否包含”贾国胜“
     */
    public static boolean andTest(String str,Predicate<String>pd1,Predicate<String>pd2){
        return pd1.and(pd2).test(str);
    }
    /*
      Predicate接口中有一个or()方法表示逻辑或者 可以连接两个判断条件
      方法内部两个判断条件也是使用||运算符连接起来的
      定义一个方法，方法传递一个字符串String str
      传递两个predicate 接口：
      一个用于判断字符串的长度是否大于5
      一个用于判断字符串中是否包含”贾国胜“
     */
    public static boolean orTest(String str,Predicate<String> pd1,Predicate<String >pd2){
        return pd1.or(pd2).test(str);
    }
    /*
     Predicate接口中有一个negate()方法表示逻辑取反
     定义一个方法，方法传递一个字符串String str
     传递一个predicate 接口：
     一个用于判断字符串的长度是否大于5
    */
    public static boolean negateTest(String str,Predicate<String> predicate){
        return predicate.negate().test(str);
    }
    /*
       java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，
        后者称为后置条件
     */
    /*
       Function接口中有一个方法R apply(T,t)根据类型T 的参数获取类型R的结果
       使用场景：将String 类型转换为Integer类型
       
     */
    public static void StringToInterge(String str, Function<String,Integer> fun){
        Integer integer=fun.apply(str);
        System.out.println(integer);
    }

    public static void andthenTest(String str, Function<String, Integer> fun1, Function<Integer,String>fun2){
         String s= fun1.andThen(fun2).apply(str);
        System.out.println(s);
    }
    public static void main(String[] args) {
        /*
          Supplier接口：接口仅包含一个无参的方法:get() 。用来获取一个泛型参数指定类型的对
          象数据。由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象
          数据
         */
        int []arr=new int[]{1,2,3,55,-44,18,144,90};
        int ans=getInteger(()->{
           int max=arr[0];
           for(int i=1;i<arr.length;i++){
               if(max<arr[i]){
                   max=arr[i];
               }
           }
           return max;

        });
        System.out.println("arr的最大值："+ans);
        /*
        Consumer:接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，
        其数据类型由泛型决定。
         */
        method("刘亦菲",(String name)->{String rename=new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
        method("贾国胜",(String name)-> System.out.println(name),(String name)-> {
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });

        String [] array={"hinata,女","naruto,男","佐助,男"};
        pringInformation(array, s-> System.out.println("姓名："+s.split(",")[0]),
                s-> System.out.println("性别："+s.split(",")[1]));

        System.out.println(judgeTest("贾国胜",(String name)->{return name.length()>5;}));

        System.out.println(andTest("贾国胜是吉林大学的学生",strinfo->strinfo.length()>5,strinfo->strinfo.contains("贾国胜")));

        System.out.println(orTest("国胜今年22岁了",strinfo->strinfo.length()>5,striifno->striifno.contains("贾国胜")));

        System.out.println(negateTest("贾国胜",strinfo->strinfo.length()>5));

        StringToInterge("12345",s->Integer.parseInt(s));
        andthenTest("1234",(String str)->{
            int num=Integer.parseInt(str);
            num+=100;
            return num;
        },(Integer i)->{
            return i+"";
        });
    }
}
