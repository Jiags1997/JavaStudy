package demo17File;

import java.io.File;

/*
.* `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。
* ` public String getPath() ` ：将此File转换为路径名字符串。
* `public String getName()`  ：返回由此File表示的文件或目录的名称。
* `public long length()` ：返回由此File表示的文件的长度，以字节为单位。

    public boolean exists()` ：此File表示的文件或目录是否实际存在。
    是：true;
    否：false
    public boolean isDirectory()` ：此File表示的是否为目录。
       用于判断构造方法中给定的路径是否是以文件夹结尾的
    是：true;
    否：false;
    public boolean isFile()` ：此File表示的是否为文件。
    用于判断用于判断构造方法中给定的路径是否是以文件结尾的
 */
public class Demo01File {
    public static void main(String[] args) {
        File f1=new File("F:\\JavaStudy\\基础语法\\src\\demo17File\\Demo01File.java");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.getPath());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        File f2=new File("F:\\JavaStudy\\基础语法\\src\\demo17File");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());


    }
}
