package demo05;

public interface MyInterfaceabsctract {
    public abstract  void methonAbs();
    public default  void methonDefault(){
        System.out.println("这是接口中的一个默认方法");
    }
    public static void  methonStatic()
    {
        System.out.println("这是接口的一个静态方法");
    }
}
