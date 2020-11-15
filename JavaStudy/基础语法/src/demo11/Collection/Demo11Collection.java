package demo11.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo11Collection {
    public static void main(String[] args) {
        Collection <String> arraylist=new ArrayList<>();
        arraylist.add("Naruto");
        arraylist.add("hinata");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        for (String s : arraylist) {
            System.out.println(s);
        }
        Object [] objects=arraylist.toArray();
        for(int i=0;i<objects.length;i++)
        {
            System.out.println(objects[i]);
        }
        System.out.println(arraylist.contains("hinata"));
        arraylist.remove("hinata");
        System.out.println(arraylist.size());
    }

}
