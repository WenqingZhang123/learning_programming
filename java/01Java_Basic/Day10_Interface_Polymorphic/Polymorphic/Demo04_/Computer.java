public class Computer {

    public void powerOn() {
        System.out.println("Computer has launched! ");
    }

    public void powerOff() {
        System.out.println("Computer has turned off! ");
    }

   
    public void useDevice(USB usb) {
        usb.open(); 
        if (usb instanceof Mouse) { 
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) { 
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close(); 
    }

}
