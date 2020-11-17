package cn.edu.Jlu.Day01.annotation;

import java.lang.reflect.Method;

@Pro(className = "cn.edu.Jlu.Day01.domain.Person",methodName = "eat")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象， 可以执行任意方法
        /*
         不能改变任何类的代码。可以创建任意类的对象，可以执行任意方法
         */
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass=ReflectTest.class;
        //1.2获取注解
        Pro pro=reflectTestClass.getAnnotation(Pro.class);
        //1.3调用注解中象中定义的抽像方法，获取返回值
        String className=pro.className();
        String methodNam= pro.methodName();
        //3.加载类近内存
        Class cls=Class.forName(className);
        //4.创建className对象
        Object obj=cls.newInstance();
        //5.获取成员方法对象】
        Method method=cls.getMethod(methodNam);
        method.invoke(obj);









    }
}
