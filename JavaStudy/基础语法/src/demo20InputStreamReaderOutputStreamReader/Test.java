package demo20InputStreamReaderOutputStreamReader;

import java.io.*;

/*
    转换流 java.io.OutputtreamWriter ，是writer的子类，是从字节流到字符流的桥梁。它读取字节，并使用指定
    的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。
    编码过程：把能看懂的变成看不懂的
    构造方法：
    1.OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
    2.OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流
    使用步骤：
    1.创建一个OutputStreamwriter对象，构造方法中传递传入字节输出流和编码集名称
    2.使用OutputStreamWriter对象中的write()方法，把制定编码集的字符转化为字节，并存入缓冲区
    3.使用OutputStreamWriter中方法flush()方法把缓冲区的字节刷新到文件中
    4.释放资源

    转换流 java.io.InputStreamReader ，是Reader的子类，是从字节流到字符流的桥梁。它读取字节，并使用指定
    的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。
 */
public class Test {
    public static void main(String[] args)  throws IOException{
        write_uft_8();
        write_gbk();
        reade_utf_8();
        reade_gbk();
    }

    private static void reade_gbk()throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        int len;
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void reade_utf_8() throws IOException{
        InputStreamReader isr=new InputStreamReader(new FileInputStream("utf_8.txt"),"utf-8");
        int len;
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void write_gbk()  throws IOException{
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
        osw.write("gbk你好");
        osw.flush();
        osw.close();
    }

    private static void write_uft_8()  throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("utf_8.txt"),"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
