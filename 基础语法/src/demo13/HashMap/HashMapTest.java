package demo13.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class HashMapTest {
    public static void main(String[] args) {
        show();
        methon();
        showListedHashMap();
    }
    /*
   HashMap存储自定义键值对
   key:String类型
       String类重写hashcode方法和equals()方法，可以保证key唯一
   value: Person类型
 */
    public  static void show()
    {
        //创建Hashmap集合
        Map<String,Person> map=new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        Set<String> set=map.keySet();
        for (String s:set) {
            Person value=map.get(s);
            System.out.println(value.getName()+":"+value.getAge());
        }

    }
    /*
   HashMap存储自定义键值对
   key:Person类型,需要重写hashcode()和equals()方法。
   value: String类型
 */
    public static void methon(){
        Map<Person,String> map=new HashMap<>();
        //往集合中添加元素
        map.put(new Person("张三",18),"北京");
        map.put(new Person("李四",19),"上海");
        map.put(new Person("王五",20),"广州");
        map.put(new Person("赵六",18),"北京");
        Set<Person> set=map.keySet();
        for (Person personn:set) {
            String area=map.get(personn);
            System.out.println(personn.getName()+"："+personn.getAge()+":"+area);

        }
    }
    public static void showListedHashMap(){
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("刘亦菲",33);
        map.put("刘诗诗",31);
        map.put("罗思雨",22);
        System.out.println(map);
    }
}
