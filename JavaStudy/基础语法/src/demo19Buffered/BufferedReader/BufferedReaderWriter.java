package demo19Buffered.BufferedReader;

import java.io.*;
import java.util.HashMap;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashmap=new HashMap<>();//创建map集合存储序号和与之对应的段落文字
        BufferedReader br=new BufferedReader(new FileReader("出师表.txt"));//创建字符缓冲输入流对象，读取原文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("out_出师表.txt"));//创建字符缓冲流，将排好序的文本写入out_出师表文件

        String line=null;
        while((line=br.readLine())!=null){
            String [] split=line.split("\\.");//以"."为标志分割字符串，分割为两个String类型的数组
            hashmap.put(split[0],split[1]);//将序号和对应的文本存入hashmap集合中；
        }
        br.close();//关闭字符缓冲输入流，释放资源
        for(int i=1;i<=hashmap.size();i++){
            String key=String.valueOf(i);
            bw.write(key+"."+hashmap.get(key));
            bw.newLine();
        }
      //  bw.flush()
        bw.close();



    }
}
