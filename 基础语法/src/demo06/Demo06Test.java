package demo06;

public class Demo06Test {
    public static void main(String[] args) {
       /* Son son=new Son();
        son.methon();
        System.out.println(son.age);
        */


        Father object=new Son();
        object.methon();
        object.methodFather();
        System.out.println(object.age);
        Son son=(Son)object;
        son.ｍmethonSon();
        System.out.println("=========");
        System.out.println(object instanceof Son);


    }
}
