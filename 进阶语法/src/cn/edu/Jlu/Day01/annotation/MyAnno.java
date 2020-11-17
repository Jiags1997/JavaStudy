package cn.edu.Jlu.Day01.annotation;

public @interface MyAnno {
    /*
     属性：注解中的成员方法叫做属性
     返回值类型要求：
     1.基本数据类型
     2.String
     3.枚举
     4.注解
     5.以上类型的数组
     */
    /*
      2. 定义了属性，在使用时需要给属性赋值
	  1. 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
	  2. 如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
	  3. 数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略
     */
     //public  abstract String getString();
    int age();
    String name() default "张三";
    Person per();
    MyAnno2 anno2();
    String [] str();
}

