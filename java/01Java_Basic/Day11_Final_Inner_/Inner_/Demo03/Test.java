
public class Test {
    public static void main(String[] args) {
        //        Interface01_ obj = new Interface01Impl();
        //        obj.method();
        
        //        Interface01_ some = new Interface01_(); // error
        
                Interface01_ objA = new Interface01_() {
                    @Override
                    public void method1() {
                        System.out.println("The anonymous inner calss has achieved the method1!---111-A");
                    }
        
                    @Override
                    public void method2() {
                        System.out.println("The anonymous inner calss has achieved the method2！---222-A");
                    }
                };
                objA.method1();
                objA.method2();
                System.out.println("=================");
        
                // anonymous object
                new Interface01_() {
                    @Override
                    public void method1() {
                        System.out.println("The anonymous inner calss has achieved the method1!---111-B");
                    }
        
                    @Override
                    public void method2() {
                        System.out.println("The anonymous inner calss has achieved the method2！---222-B");
                    }
                }.method1();

                new Interface01_() {
                    @Override
                    public void method1() {
                        System.out.println("The anonymous inner calss has achieved the method1!---111-B");
                    }
        
                    @Override
                    public void method2() {
                        System.out.println("The anonymous inner calss has achieved the method2！---222-B");
                    }
                }.method2();
            }
}
