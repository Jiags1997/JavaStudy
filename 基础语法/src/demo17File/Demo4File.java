package demo17File;

import java.io.File;

public class Demo4File {
    public static void main(String[] args) {
        File file=new File("F:\\JavaStudy\\基础语法\\src\\demo12");
        getAllDerictory(file);
    }
    public static void getAllDerictory(File file)
    {
        System.out.println(file);
        File []files=file.listFiles();//获得file目录下所有子文件或者子目录
        for(File f:files){
            if(f.isDirectory()){//如果是文件夹可以继续递归遍历
                getAllDerictory(f);
            }
            else
            {
                System.out.println(f.getAbsolutePath());//如果不是打印文件绝对路径
            }
        }

    }
}
