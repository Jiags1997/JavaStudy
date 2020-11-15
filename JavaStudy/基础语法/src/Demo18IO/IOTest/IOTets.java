package Demo18IO.IOTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTets {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("F:\\JavaStudy\\基础语法\\src\\Demo18IO\\IOTest\\你的名字.jpg");
        FileOutputStream fos=new FileOutputStream("F:\\JavaStudy\\基础语法\\src\\Demo18IO\\IOTest\\1.jpg");
        byte [] b=new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);

        }
        fos.close();
        fis.close();
    }
}
