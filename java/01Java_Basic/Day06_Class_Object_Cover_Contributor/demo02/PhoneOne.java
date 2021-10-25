package demo02;

public class PhoneOne {
    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("=========");

        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "Black";
        System.out.println(one.brand); // Apple
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // Black
        System.out.println("=========");

        one.call("Jobs"); // Give Jobs Call
        one.sendMessage(); // Send messages
    }
    
}
