package demo10.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo10Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//多态写c法，getInstance(）方法返回的是Calendar类的子类对象
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));//get()方法返回给定日历字段的值
        c.set(Calendar.YEAR,2022);//set()方法将给定的日历字段设置为给定的值
        System.out.println(c.get(Calendar.YEAR));

        Calendar cal = Calendar.getInstance();
        // 设置年
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
        //使用add()方法 加两天
        cal.add(Calendar.DAY_OF_MONTH,2);
        cal.add(Calendar.YEAR,2);
        //获取修改后的年
        year=cal.get(Calendar.YEAR);
        //获取修改胡后的日
        dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);
        //打印年月日
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
        //Calendar类的gettime()方法返回的是Date类型的对象，不是毫秒值
        Date date=cal.getTime();
        System.out.println(date);


    }
}
