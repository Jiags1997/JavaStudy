package Demo18IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
  字节输出流【OutputStream】
  java.io.OutputStream 抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。
* public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
* public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
* public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
* public void write(byte[] b, int off, int len)：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
* public abstract void write(int b)：将指定的字节输出流。
  OutputStream有很多子类，我们从最简单的一个子类开始。
  java.io.FileOutputStream `类是文件输出流，用于将数据从内存写出到文件。
  构造方法：
  * public FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。
  * public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。

 */
public class OutputstreamTest {
    public static void main(String[] args) throws IOException {
        //一次写一个字节
        String filepath="F:\\JavaStudy\\基础语法\\src\\Demo18IO\\OutputStream\\a.txt";
        FileOutputStream fos=new FileOutputStream(filepath);
        fos.write(97);
        fos.close();
        FileOutputStream fos2=new FileOutputStream(filepath,true);
        byte[] b={100,102,112};
        byte[] c="hinata".getBytes();
        System.out.println(Arrays.toString(c));//返回数组的字符串表现形式
        fos2.write(b,0,1);
        fos2.write(c);
        fos2.close();


    }
}
