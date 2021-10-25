package demo02;

public class PhoneSame {
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

        one.call("Jobs"); // Give Jobs call
        one.sendMessage(); // send message
        System.out.println("=========");

        // Give the address in one to two
        Phone two = one;
        System.out.println(two.brand); // Apple
        System.out.println(two.price); // 8388.0
        System.out.println(two.color); // Black
        System.out.println("=========");

        two.brand = "Samsung";
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
