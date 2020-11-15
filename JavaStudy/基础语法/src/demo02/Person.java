package demo02;

public class Person {
    private  String name;
    private  int age;
    private  String sex;
    public  Person()
    {
        System.out.println("我被调用啦！");
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
