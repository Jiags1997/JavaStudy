package demo21.Serializable.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputstreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("out.txt"));
        Object o=ois.readObject();
        ois.close();
        System.out.println(o);


    }
}
