package demo11.Generic;
/*
   泛型类的定义格式
   public  class 类名称<E>{
        //...
   }
 */
public class Student <E>{
    private E name;
    private int agr;

    public Student() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public int getAgr() {
        return agr;
    }
    //定义泛型方法的格式,调用方法时确定泛型的类型
    public void setAgr(int agr) {
        this.agr = agr;
    }
    public <E> void study(E e)
    {
        System.out.println(e);
    }
}
