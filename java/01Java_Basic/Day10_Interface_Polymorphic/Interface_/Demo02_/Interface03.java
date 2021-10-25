public interface Interface03 {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("The default method----BBB!  ");
    }
}
