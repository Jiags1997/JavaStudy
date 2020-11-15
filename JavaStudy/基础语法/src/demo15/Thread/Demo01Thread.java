package demo15.Thread;

/*
   创建多线程的第一种方式：
   java.lang.Thread类：是描述线程的类，实现多线程必须继承Thread类
   实现步骤:
   1.创建Thread的子类
   2.在Thread类的子类中重写Thred类中的run方法，设置线程任务
   3.创建Thread类的子类对象
   4.调用Thread类中的start()方法，开启新的线程，执行run方法
     void  start():使得线程开始执行；Java虚拟机调用run()方法
     结果是两个线程并发执行，当前线程（main）和创建的新的线程
 */
public class Demo01Thread {
    public static void main(String[] args) {
       // MyThread myThread=new MyThread();

      //  myThread.start();
       /* for (int i = 0; i <10 ; i++) {
            System.out.println("主线程："+i);
        }*/
        /*
        Thread类常用的方法
        1.public String getName() :获取当前线程名称
        2.public static Thread currentThread() :返回对当前正在执行的线程对象的引用。
        使用currentThread()方法返回当前执行的线程，在调用getName()方法获取当前运行线程的名称
        */
      /*  System.out.println(myThread.getName());
        //setName()方法设置线程名称
        myThread.setName("new thread");
        System.out.println(myThread.getName());
        System.out.println(Thread.currentThread().getName());*/

        /*
        sleep()方法使得线程暂停执行

         */
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
