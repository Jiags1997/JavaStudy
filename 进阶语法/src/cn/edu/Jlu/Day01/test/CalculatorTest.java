package cn.edu.Jlu.Day01.test;

import cn.edu.Jlu.Day01.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
    初始化方法，用于申请资源
    所测试方法在执行前都会执行这个方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }
    /*
     释放资源方法，在所有测试方法执行完毕后，都会自动执行这个方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    /*
     测试add()方法
     */
    @Test
     public void testAdd(){
        //int i=3/0;
        Calculator c=new Calculator();
        int result=c.add(10,5);
        System.out.println(result);
        Assert.assertEquals(15,result);
     }
     @Test
     public void testSubTract(){
        Calculator c=new Calculator();
        int result=c.subtract(10,5);
         System.out.println(result);
        Assert.assertEquals(5,result);
     }
}
