package demo15.Runnable;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("new Thread-->"+i);
        }
    }
}
