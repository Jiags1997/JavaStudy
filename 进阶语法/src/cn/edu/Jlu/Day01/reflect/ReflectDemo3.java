package cn.edu.Jlu.Day01.reflect;

import cn.edu.Jlu.Day01.domain.Person;

import java.lang.reflect.Constructor;
/*
		* Field getDeclaredField(String name)
		2. 获取构造方法们
			* Constructor<?>[] getConstructors()
			* Constructor<T> getConstructor(类<?>... parameterTypes)

			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
			* Constructor<?>[] getDeclaredConstructors()
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //1.获取Person的Class对象
        Class personClass= Person.class;
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //newinstance()方法差创建对象
        Object person =constructor.newInstance("张三",23);

        System.out.println(person);

        Constructor constructor1=personClass.getConstructor();
        System.out.println(constructor);
        //newinstance()方法差创建对象
        Object person1 =constructor1.newInstance();

        System.out.println(person1);
        System.out.println(personClass.newInstance());
    }
}
