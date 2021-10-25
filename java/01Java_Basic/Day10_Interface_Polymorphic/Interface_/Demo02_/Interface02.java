public interface Interface02 {

    // error, the interface can not have the static block
//    static {
//
//    }

    // error, the interface can not have the constuctor
//    public MyInterfaceA() {
//
//    }

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("The default method---AAAA! ");
    }

}
