package demo02;

public class Phone {

    // member variable
    String brand; 
    double price; 
    String color; 

    // memeber method
    public void call(String who) {
        System.out.println("Give" + who + "Call");
    }

    public void sendMessage() {
        System.out.println("Send messages");
    }
}
