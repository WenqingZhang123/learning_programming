public class Zi extends Fu {

    int num = 20;

    public Zi() {
        super();
    }

    public void methodZi() {
        System.out.println(super.num); // num in father
    }

    public void method() {
        super.method(); 
        System.out.println("Son method! ");
    }

}
