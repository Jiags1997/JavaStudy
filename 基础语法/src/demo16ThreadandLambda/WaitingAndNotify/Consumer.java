package demo16ThreadandLambda.WaitingAndNotify;

public class Consumer extends Thread{
    Baozi baozi;

    public Consumer(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int n=10;
        while (n>0){
            synchronized (baozi){

                if(baozi.flag==false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("顾客正在吃："+baozi.pi+baozi.xian+"包子");
                System.out.println("顾客已经吧："+baozi.pi+baozi.xian+"包子吃完了");
                baozi.flag=false;
                baozi.notify();
            }
            n--;
        }

    }
}
