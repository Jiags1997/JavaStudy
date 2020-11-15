package demo14.Exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable是Java中所有错误和异常的超类
    Exception:编译异常
    RunTimeException:运行异常
    Error：错误
 */
public class DemoException {
    public static void main(String[] args)  {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        //使用Try Carch处理异常，程序不会终止，会继续执行发生异常后面的代码
        try {
                date=df.parse("2020-10-19");
        }catch (ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("继续执行");

        /*RunTimeException异常
            发生运行异常，会终止程序的运行
         */
        int []arr={1,2,3};
        System.out.println(arr[3]);
        System.out.println("继续执行");
    }
}
