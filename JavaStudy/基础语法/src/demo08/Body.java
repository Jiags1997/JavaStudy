package demo08;

public class Body {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  methonBody(){
        System.out.println("这是外部类的方法");
        new Internal().methonInternal();

    }
    //内部类
    public class Internal{
        public void methonInternal(){
            System.out.println("这是内部类的方法");
            System.out.println("我叫"+name);
        }
    }

}
