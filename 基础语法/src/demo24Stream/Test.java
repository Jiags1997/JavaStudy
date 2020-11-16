package demo24Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    //第一支队伍
    public static void main(String[] args) {
        List<String> one=new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //第一个队伍只要名字为三个字的成员，存储到一个新的集合
       // List <String> newone=new ArrayList<>();
        Stream<String> streamone=one.stream().filter(name->name.length()==3).limit(3);

        //第二个队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        //3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        //ArrayList<String> two1 = new ArrayList<>();
        Stream <String> streamtwo=two.stream().filter(name->name.startsWith("张")).skip(2);
        Stream.concat(streamone,streamtwo).map(name->new Person(name)).forEach(person-> System.out.println(person));








    }

}
