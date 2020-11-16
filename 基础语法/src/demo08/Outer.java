package demo08;

public class Outer {
    int num=10;
    public class Inter{
        int num=20;
        public  void methonInter()
        {
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
