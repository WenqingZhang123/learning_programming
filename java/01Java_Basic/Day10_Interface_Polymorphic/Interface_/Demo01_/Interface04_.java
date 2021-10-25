public interface Interface04_ {

    public static void methodStatic1() {
        System.out.println("Static method--1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("Static method--2");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
