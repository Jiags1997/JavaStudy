package demo16ThreadandLambda.WaitingAndNotify;

public class BaoziStore extends Thread {
    Baozi baozi;

    public BaoziStore(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count=0;
        int n=10;
            while(n>0)
            synchronized (baozi){
                if(baozi.flag==true){
                     try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    baozi.pi="薄皮";
                    baozi.xian="牛肉";
                }else{
                    baozi.pi="厚皮";
                    baozi.xian="猪肉芹菜";
                }
                count++;
                System.out.println("包子铺正在生产："+baozi.pi+baozi.xian+"包子");
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                baozi.flag=true;
                System.out.println("包子铺已经生产好了："+baozi.pi+baozi.xian+"包子，顾客可以吃了");
                n--;
                baozi.notify();


            }
        }


}
