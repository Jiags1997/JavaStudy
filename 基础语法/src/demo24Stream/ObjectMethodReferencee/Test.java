package demo24Stream.ObjectMethodReferencee;

public class Test {
    /*
      通过对象引用成员方法
      使用前提是对象名前提是对象名已经存在，成员方法也是已经存在的

     */
     public  static void printString(Printable p){
         p.print("helloworld");
     }
    public static void main(String[] args) {
         /*
         lambda表达式形式
          */
        printString((str)->{
            MethodRefenceObject obj=new MethodRefenceObject();
            obj.printUpperCaseString(str);
        });
        /*
         方法引用形式
         */
        MethodRefenceObject obj=new MethodRefenceObject();
        printString(obj::printUpperCaseString);
    }
}
