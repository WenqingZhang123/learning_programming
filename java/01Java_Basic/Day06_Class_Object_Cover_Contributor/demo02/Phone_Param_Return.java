package demo02;

public class Phone_Param_Return {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "Gold";

        method(one); // What has been passed is address


        Phone two = getPhone();
        System.out.println(two.brand); // Apple
        System.out.println(two.price); // 8388.0
        System.out.println(two.color); // Gold
    }

    public static void method(Phone param) {
        System.out.println(param.brand); // Apple
        System.out.println(param.price); // 8388.0
        System.out.println(param.color); // Gold
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "Gold";
        return one;
    }
    
}
