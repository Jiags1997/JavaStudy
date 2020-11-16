package Demo18IO.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*

 */
public class inputStreamTest {
    public static void main(String[] args) throws IOException {
        String filepath="F:\\JavaStudy\\基础语法\\src\\Demo18IO\\OutputStream\\b.txt";
        FileInputStream fis=new FileInputStream(filepath);
//        int read=fis.read();
//        System.out.println((char)read);
//        int b;           //read()方法：每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回`-1`
//        while((b=fis.read())!=-1){
//            System.out.println((char)b);
//        }

        byte [] b=new byte[2];
        int len=fis.read(b);
        while((len=fis.read(b))!=-1){
            System.out.println(new String(b));
        }

        fis.close();

    }
}
