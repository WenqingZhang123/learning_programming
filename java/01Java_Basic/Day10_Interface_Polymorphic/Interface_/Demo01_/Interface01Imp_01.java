public class Interface01Imp_01 extends Interface01Imp {
    public static void main(String[] args){
        // error: Interface01_ is abstract; cannot be instantiated
    //It is forbidden to build object directly by interface
     //   Interface01_ inter = new Interface01_();

     Interface01Imp_01 imp = new Interface01Imp_01();

     imp.methodAbs1();
     imp.methodAbs2();
     imp.methodAbs3();
     imp.methodAbs4();

    }

}
