package demo16ThreadandLambda.WaitingAndNotify;

public class Test {
    public static void main(String[] args) {

        Baozi baozi=new Baozi();
        BaoziStore bs=new BaoziStore(baozi);
        Consumer consumer=new Consumer(baozi);
        bs.start();
        consumer.start();

    }
}
