package demo23FunctionalInterface;


/*
   函数式接口：有且仅有一个抽象方法的接口
   作用：一般用作方法的参数和返回值

 */
@FunctionalInterface  //注解：标志此类是函数式接口
public interface MyFunctionalInterface {
    public abstract void method();

}
