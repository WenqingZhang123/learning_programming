public class Zi extends Fu {

    int num = 20;

    public Zi() {
//        super(); // omit cause this() and super() can exist only one of them
        this(123); // invoke the cons in this class
//        this(1, 2); // error for this(123)
    }

    public Zi(int n) {
        this(1, 2);
    }

    public Zi(int n, int m) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num); 
        System.out.println(this.num); 
        System.out.println(super.num); 
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }

}

