package demo17File;

import java.io.File;

public class Demo03FIle {
    public static void main(String[] args) {
        File file=new File("F:\\JavaStudy\\基础语法\\src");
        String [] filelist=file.list();
        for (String filename:filelist
             ) {
            System.out.println(filename);

        }
        File [] files=file.listFiles();
        for (File filename:files
             ) {
            System.out.println(filename);
        }
        int []arr=new int[3];
        System.out.println(arr[0]);
    }
}
