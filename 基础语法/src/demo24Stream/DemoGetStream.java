package demo24Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：
    所有的 Collection 集合都可以通过 stream 默认方法获取流；
    Stream 接口的静态方法 of 可以获取数组对应的流。
    static <T>Stream<T> of(T...value)
    参数 是一个可变参数，数组
 */
public class DemoGetStream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<String> streamlist=list.stream();
        Set<String> set=new HashSet<>();
        Stream<String> streamset=set.stream();
        Vector<String> vector=new Vector<>();
        Stream <String>streamvector=vector.stream();
        /*

         */
        Stream<String>stream=Stream.of("1","2","3");

        Stream <Integer> streaminteger=stream.map(num->Integer.parseInt(num));
   ;
        Stream<Integer> streamskip=streaminteger.skip(1);
        streamskip.forEach(num-> System.out.println(num));





    }
}
