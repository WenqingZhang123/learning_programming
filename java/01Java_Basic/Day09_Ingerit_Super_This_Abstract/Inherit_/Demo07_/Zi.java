public class Zi extends Fu {

    public Zi() {
        super(); 
//        super(20);
        System.out.println("Son constructor");
    }

    public void method() {
//        super(); // error, only son's constructor could invoke father's constructor
    }

}
