package demo07;

public class Laptop  {

    public void  useDevice(USB usb){
        usb.openDevice();
        if( usb instanceof Mouse)
        {
            Mouse mouse=(Mouse)usb;
            mouse.click();
        } else if (usb instanceof KeyBroad) {

            KeyBroad keyBroad=(KeyBroad)usb;
            keyBroad.type();
        }
        usb.closeDevice();
    }
    public void shutUp(){
        System.out.println("笔记本开机了");
    }
    public void  shutDown(){
        System.out.println("笔记本关机了");
    }

}
