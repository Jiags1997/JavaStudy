package Demo18IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("F:\\JavaStudy\\基础语法\\src\\Demo18IO\\Reader\\a.txt");
        char []c={'张','资','卿'};
        fw.write(c);
        fw.flush();
        fw.write("卿");
        fw.flush();
        fw.close();
    }
}
