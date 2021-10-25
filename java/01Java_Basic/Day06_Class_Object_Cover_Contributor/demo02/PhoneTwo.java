package demo02;

public class PhoneTwo {

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
        one.sendMessage(); // Send message
        System.out.println("=========");

        Phone two = new Phone();
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        System.out.println("=========");

        two.brand = "Samsumg";
        two.price = 5999.0;
        two.color = "Blue";
        System.out.println(two.brand); // Sasumg
        System.out.println(two.price); // 5999.0
        System.out.println(two.color); // Blue
        System.out.println("=========");

        two.call("Bro"); // Give Bro call 
        two.sendMessage(); // Send message
    }

}
