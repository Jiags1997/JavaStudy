package demo15.Thread;
//创建Thread的子类
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("新线程："+i);
        }
    }
}
