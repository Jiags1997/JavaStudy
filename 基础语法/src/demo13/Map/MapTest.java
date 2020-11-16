package demo13.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
   Map集合的常用方法：

 */
public class MapTest {
    public static void main(String[] args) {
        showPut();
        showRemove();
        showGet();
        show();
    }
    /*
    public V put(K key, V value)：把指定的键和指定的值添加到map集合中
   返回值v:
   1. 存储键值对的时候如果key不重复，返回null
   2.存储对象的时候key重复，会使用新的value值替换map集合中的value

     */
    public static void showPut(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("刘亦菲",33);
        map.put("刘诗诗",31);
        map.put("罗思雨",22);
        System.out.println(map);

    }
    /*
    public V remove(Object key):把指定的键所对应的键值对从map集合中删除，返回被删除元素的值。
    返回值v:
    1.key存在，返回被删除键值对的值。
    2.key不存在，返回null
     */
    public static void showRemove(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("刘亦菲",33);
        map.put("刘诗诗",31);
        map.put("罗思雨",22);
      // map.remove("刘亦菲");
        //System.out.println(map.remove("孙玥"));
        System.out.println(map);
    }
    /*
      public V get(Object key)`:根据指定的键，在Map集合中获取对应的值。
       返回值v:
      1.key存在，返回key对应的值。
      2.key不存在，返回null
     */
    public  static void showGet(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("刘亦菲",33);
        map.put("刘诗诗",31);
        map.put("罗思雨",22);
        System.out.println(map.get("罗思雨"));
        //`boolean containsKey(Object key)  `:判断集合中是否包含指定的键。
        System.out.println("map中是否含有罗思雨："+map.containsKey("罗思雨"));
        //public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        Set<String> set=map.keySet();
        System.out.println(set);


    }

    public static void show(){

        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("刘亦菲",33);
        map.put("刘诗诗",31);
        map.put("罗思雨",22);
        //map集合的第一种便利方式
        for (String str:map.keySet()){
            System.out.println(str+":"+map.get(str));
        }
        //map集合的第二种便利方式
        //1.使用map集合中的entrySet()方法，把map中的多个Entry对象存储到set集合中
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        //2.
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
           Map.Entry<String,Integer> entry=iterator.next();
           String name=entry.getKey();
           int age=entry.getValue();
            System.out.println(name+"："+age);

        }
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

    }

}
