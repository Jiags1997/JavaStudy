package demo09;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        //接口
        List<String>list=new ArrayList<String>();//ArrayList  实现了List
        addName(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> addName(List<String> list)
    {
        list.add("鸣人");
        list.add("雏田");
        list.add("博人");
        list.add("向日葵");
        return list;
    }
}
