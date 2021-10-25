public class  Interface01Imp_02{

    public static void main(String[] args) {
        
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // error
//        impl.methodStatic();

        // It could only be invoked by its interface
        MyInterfaceStatic.methodStatic();
    }

}