package demo16ThreadandLambda.WaitingAndNotify;

/*
   等待唤醒案例：线程之间的通信
   创建一个顾客线程（consumer）：告知老板包子的数量和种类，调用wait()方法进入waiting状态
   创建一个老板线程（productor）:画五秒时间做包子，做好调用notify()方法通知顾客吃包子
   注意：
      顾客和老板线程必须使用同步代码块包裹起来，
      同步对象使用的锁必须一致
      只有锁对象才能调用wait()和notify（）方法
 */
public class ThreadsCorrepondence {
    public static void main(String[] args) {
        //创建锁对象
        Object obj=new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板索要包子的数量和种类");
                    try {
                        obj.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好了，开吃");
                }
            }
        }.start();
        //创建老板线程
        new Thread(){
            @Override
            public void run() {

                synchronized (obj){
                    System.out.println("老板告诉顾客五秒钟后做好包子，请等待");
                    try {
                        for (int i = 5; i>0 ; i--) {
                            System.out.println(i);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //obj.notify();
                }
            }
        }.start();
    }
}
