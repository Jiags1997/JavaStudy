package demo24Stream.MethodReference;

public class Demo01Printable {
    //定义一个方法，参数传递Printabe接口
    public static void printString(Printable p){
        p.print("HelloWorld");
    }
    public static void main(String[] args) {
           //lambda表达式写法
           // printString(name-> System.out.println(name));
           // 方法引用写法,这种写法代替了lambda表达式
            printString(System.out::println);
    }
}
