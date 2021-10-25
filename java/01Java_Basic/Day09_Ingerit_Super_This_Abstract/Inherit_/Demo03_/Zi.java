package Inherit_.Demo03_;

public class Zi extends Fu {

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 30，local variable
        System.out.println(this.num); // 20，variable in this class
        System.out.println(super.num); // 10，variable in super class
    }

}
