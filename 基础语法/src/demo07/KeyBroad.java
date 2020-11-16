package demo07;

public class KeyBroad implements USB {
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("敲击键盘");
    }
}
