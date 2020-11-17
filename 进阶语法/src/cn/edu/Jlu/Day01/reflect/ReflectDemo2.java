package cn.edu.Jlu.Day01.reflect;

import cn.edu.Jlu.Day01.domain.Person;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class ReflectDemo2 {
    /*
     Class对象功能：
	* 获取功能：
		1. 获取成员变量们
			* Field[] getFields() ：获取所有public修饰的成员变量
			* Field getField(String name)   获取指定名称的 public修饰的成员变量

			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
			* Field getDeclaredField(String name)
		2. 获取构造方法们
			* Constructor<?>[] getConstructors()
			* Constructor<T> getConstructor(类<?>... parameterTypes)

			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
			* Constructor<?>[] getDeclaredConstructors()
		3. 获取成员方法们：
			* Method[] getMethods()
			* Method getMethod(String name, 类<?>... parameterTypes)

			* Method[] getDeclaredMethods()
			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)

		4. 获取全类名
			* String getName()
     */
    public static void main(String[] args) throws Exception {
        //1.过去Person的Class对象
        Class personClass=Person.class;
        //getFields()方法
        Field[] fields = personClass.getFields();
        Stream<Field> stream=Stream.of(fields);
        stream.forEach(str-> System.out.println(str));
        System.out.println("------------");

        Field field=personClass.getField("number");
        //
        Person person = new Person();
        field.set(person,"18004449293");
        Object result=field.get(person);
        String number=(String)result;
        System.out.println(result);
        System.out.println("-----------");

         Field [] fields1=personClass.getDeclaredFields();
        for (Field f:fields1
             ) {
            System.out.println(f);
        }

        Field f=personClass.getDeclaredField("name");
        f.setAccessible(true);//暴力反射，不进行访问权限安全性检查
        System.out.println(f.get(new Person()));



    }
}
