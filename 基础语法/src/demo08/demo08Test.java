package demo08;

public class demo08Test
{
    public static void main(String[] args) {
        Body body=new Body();
        body.setName("贾国胜");
        body.methonBody();
        System.out.println("===========");
        Body.Internal internal=new Body().new Internal();
        internal.methonInternal();
        System.out.println("============");
        Outer.Inter inter=new Outer().new Inter();
        inter.methonInter();
        System.out.println("===========");
        MyInterface myInterface=new MyInterface() {
            public  void methon(){

                System.out.println("匿名内部类的重写方法");            }
        };
        myInterface.methon();
    }
}
