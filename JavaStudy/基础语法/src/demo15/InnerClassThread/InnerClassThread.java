package demo15.InnerClassThread;

/*
  匿名内部类实现线程的创建
  格式：
  1.new  父类/接口（）{
        重写父类或者接口的run()方法
  }；
 */
public class InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20  ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();
        //线程接口Runnable
        Runnable runnable=new Runnable(){//多态的形式
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        };
        new Thread(runnable).start();

    }
}
