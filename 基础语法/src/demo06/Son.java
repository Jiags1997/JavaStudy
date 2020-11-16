package demo06;

public class Son extends Father {
    int age=22;
    String name="JiaGuosheng";
    @Override
    public  void methon()
    {
        //System.out.println(super.age);
        System.out.println(age);

    }
    public void ｍmethonSon(){
        System.out.println("这是子类特有的方法");
    }

}
