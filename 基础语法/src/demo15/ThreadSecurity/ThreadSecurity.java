package demo15.ThreadSecurity;
/*
线程安全问题
 */
public class ThreadSecurity {
    public static void main(String[] args) {
        RunnableImpl runnable=new RunnableImpl();
        Thread r1=new Thread(runnable);
        Thread r2=new Thread(runnable);
        Thread r3=new Thread(runnable);
        r1.start();
        r2.start();
        r3.start();
    }
}
