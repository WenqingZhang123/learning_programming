public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();

        
        USB usbMouse = new Mouse(); // poly
    
        computer.useDevice(usbMouse);

     
        Keyboard keyboard = new Keyboard(); // no poly

        computer.useDevice(keyboard); 
     
//        computer.useDevice(new Keyboard()); // right also

        computer.powerOff();
        System.out.println("==================");

        method(10.0); //double --> double
        method(20); //int --> double
        int a = 30;
        method(a); //int --> double
    }

    public static void method(double num) {
        System.out.println(num);
    }

}
