package demo07;

public class Demo07Test {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.shutUp();
        USB usbKeybroad=new KeyBroad();
        USB usbMouse=new Mouse();

        laptop.useDevice(usbKeybroad);
        laptop.useDevice(usbMouse);
        System.out.println("======");
        laptop.useDevice(new Mouse());
        laptop.useDevice(new KeyBroad());
        laptop.shutDown();;

    }
}
