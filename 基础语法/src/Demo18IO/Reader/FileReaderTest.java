package Demo18IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
   FileReader 文件字符输入流
   作用：把硬盘的而文件以字符的形式读取到内存中

   字符输入流的使用步骤：
   1.创建FIleReader对象，构造方法中绑定要读取的数据
   2.使用FileReader对象read()方法读取文件
   3.释放资源
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("F:\\JavaStudy\\基础语法\\src\\Demo18IO\\Reader\\a.txt");
        int len;//read()方法
        len=fr.read();
        System.out.print((char)len);
        while((len=fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();

    }
}
