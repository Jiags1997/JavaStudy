package demo10.DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo10DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(new Date()); // Tue Jan 16 14:37:35 CST 2018
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0L)); // Thu Jan 01 08:00:00 CST 1970
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=df.format(date);
        System.out.println(str);

        DateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1=new Date();
        try{
           date1=dateFormat.parse("2020年01月27日 04时08分24秒");
        }catch (ParseException e){
            System.out.println(e);
        }
        System.out.println(date1);
        System.out.println(counterDays());

    }
    public  static long counterDays() throws ParseException {
        //使用Scanner类的next（）方法输入出生日期，使用birthdaydya变量接收出生日期字符串
        String birthdaydays=new Scanner(System.in).next();
        //使用DateFormat类中的parse()方法将字符串解析为Date格式
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date birthday=df.parse(birthdaydays);
        //获取当前时间的日期
        Date todayday=new Date();
        //将出生日期转换为毫秒
        long birthdaySecond=birthday.getTime();
        //将当前日期转换为毫秒
        long todaySecond=todayday.getTime();
        //使用当前日期毫秒值-出生日期毫秒值
        long second=todaySecond-birthdaySecond;
        return  (second/1000/60/60/24);
    }


}

