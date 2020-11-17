package cn.edu.Jlu.Day01.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象， 可以执行任意方法
        /*
         不能改变任何类的代码。可以创建任意类的对象，可以执行任意方法
         */

        //2.创建Properties对象
        Properties pro=new Properties();
        //2.加载配置文件
        //获取class目录下的配置文件
        ClassLoader classLoader=ReflectTest.class.getClassLoader();
        InputStream is=classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //3获取配置文件中的定义的数据
        String className=pro.getProperty("className");

        String methodName=pro.getProperty("methodName");
        // 4.加载类进内存
        Class cls=Class.forName(className);
        //5.获取类的对象
        Object obj=cls.newInstance();
        //6.获取对象
        Method method=cls.getMethod(methodName);
        //7.执行方法
        method.invoke(obj);





    }
}
