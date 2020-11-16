package demo21.Serializable.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("out.txt"));
        oos.writeObject(new Person("贾国胜",22));
        oos.close();
    }
}
