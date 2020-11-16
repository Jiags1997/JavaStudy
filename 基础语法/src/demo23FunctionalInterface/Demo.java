package demo23FunctionalInterface;

public class Demo {
    public static void main(String[] args) {
             MyFunctionalInterfaceImpl myfuninter=new MyFunctionalInterfaceImpl();
             show(myfuninter);
             show(new MyFunctionalInterface() {
                 @Override
                 public void method() {
                     System.out.println("匿名内部类的方式实现函数式接口");
                 }
             });

             show(()->{
                 System.out.println("使用Lambda表达式重写函数式接口");
             });

    }
    public static void show(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.method();
    }

}
