package demo15.ThreadSecurity.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
   一、解决线程安全问题得一种方案：使用同步代码块；
   格式：
        synchronized(锁对象){
           可能会出现线程安全得代码（访问共享数据得代码）
        }
        注意:
        1.通过代码块中得锁对象，可以使用任意得对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象可以把同步代码块锁住，只让一个线程在同步代码中执行
     原理：同步的线程没有执行完毕，不会释放锁，同步外的线程没有锁进不去同步。
     保证同一时刻只有一个线程执行同步代码块

    二、解决线程安全问题得二种方案：使用同步方法；
    使用步骤：
    1.把访问共享数据那段代码抽取出来，放在一个方法中
    2.在方法上添加synchronized修饰符
    格式：
    修饰符 synchronized 返回值类型 方法名（）｛
        把访问共享数据那段代码抽取出来
    ｝
   三、解决线程安全问题得二种方案：Lock锁；
   java.util.conceurrent.locks.Lock接口
   Lock接口中的方法：
   void  lock()获取锁
   void  unLock()释放锁

   步骤：1.在成员位置创建一个ReentrantLock对象
   2.在可能会出现安全问题的代码前调用Lock()接口中的方法Lock获取锁
   3.在可能会出现安全问题的代码后调用unLock()接口中的方法unLock释放锁


 */
public class RunnableImpl implements Runnable {
    private int takects=100;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
         lock.lock();
        if (takects > 0) {
            try {
                Thread.sleep(10);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "线程正在售票-->" + takects);
            takects--;
        }
        lock.unlock();
    }
    }




}
