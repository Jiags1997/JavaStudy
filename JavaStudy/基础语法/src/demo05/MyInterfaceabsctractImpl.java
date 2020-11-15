package demo05;

public class MyInterfaceabsctractImpl implements MyInterfaceabsctract {

    @Override
    public void methonAbs() {
        System.out.println("这是第一个方法");
    }
    @Override
    public void methonDefault(){
        System.out.println("覆盖重写的接口的默认方法");
    }
}
