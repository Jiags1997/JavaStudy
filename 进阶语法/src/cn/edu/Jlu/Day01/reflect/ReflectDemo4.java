package cn.edu.Jlu.Day01.reflect;

import cn.edu.Jlu.Day01.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    /*
		3. 获取成员方法们：
			* Method[] getMethods()
			* Method getMethod(String name, 类<?>... parameterTypes)

			* Method[] getDeclaredMethods()
			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class personClass= Person.class;
        //获取指定名称的方法
        Method method1=personClass.getMethod("eat");
          //执行方法
        method1.invoke(new Person());

        Method method2=personClass.getMethod("eat",String.class,String.class);
        method2.invoke(new Person(),"贾国胜","火锅");
        //打印所方法
        Method [] methods=personClass.getMethods();
        for (Method method:methods
             ) {
            System.out.print(method+"-");
            System.out.println(method.getName());

        }

        String className=personClass.getName();
        System.out.println(className);






    }
}
