package demo21.Serializable.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> list=new ArrayList<>();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("out_test.txt"));
        list.add(new Person("贾国胜",22));
        list.add(new Person("hinata",16));
        list.add(new Person("naruto",16));
        oos.writeObject(list);

        //反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("out_test.txt"));
        ArrayList <Person> arraylist=(ArrayList<Person>)ois.readObject();
        for(int i=0;i<arraylist.size();i++)
            System.out.println(arraylist.get(i));
    }
}
