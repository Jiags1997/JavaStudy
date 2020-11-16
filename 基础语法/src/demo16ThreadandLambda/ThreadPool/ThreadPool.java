package demo16ThreadandLambda.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
   线程池：JDK1.5后提供的java.util.Excutors:线程池的工厂类，用来生成线程池
   Excutors类中的静态方法static ExecutorService newFixedRThreadPool(int nThreads)
   参数：int nThreads 创建线程中包含线程的数量

   返回值：ExecutorService，返回时ExecutorService接口类的实现类对象，可以使用ExecutorService接口来接收
   线程池使用步骤：
   1.使用线程池工厂类Executors里面的静态方法newFixedRThreadPool(int nThreads)生产一个指定线程数量的线程池
   2.创建一个实现Runnable接口的实现类，重写run方法，设置线程任务
   3.调用ExecutorService()中的submit(）方法传递线程任务，执行任务
   4.ExecutorService()中的shutdown()方法销毁线程
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 1.使用线程池工厂类Executors里面的静态方法newFixedRThreadPool(int nThreads)生产一个指定线程数量的线程池
        ExecutorService es=Executors.newFixedThreadPool(2);
        // 3.调用ExecutorService()中的submit(）方法传递线程任务，执行任务
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

    }

}
