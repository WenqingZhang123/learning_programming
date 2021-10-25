public interface Interface03_ {
    public default void methodDefault1() {
        System.out.println("Default method---1");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("Default method---2");
        methodCommon();
    }

    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
