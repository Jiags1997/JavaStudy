package demo17File;

import java.io.File;
import java.io.IOException;

/*
- `public boolean createNewFile()` 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
- `public boolean delete()` ：删除由此File表示的文件或目录。
- `public boolean mkdir()` ：创建由此File表示的目录。
- `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录
 */
public class Demo02File {
    public static void main(String[] args) {
        File f1 = new File("G:\\a.txt");
        System.out.println(f1.getName());
        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(f1.getPath());
        if (f1.exists()) {
            f1.delete();
        }

        File f2 = new File("G:\\newfile");
        System.out.println(f2.mkdir());
        File f3=new File("G:\\news\\paper");
        System.out.println(f3.mkdirs());

    }
}
