public class Interface02Imp_01_02 {
    public static void main(String[] args) {
        
        Interface02Imp_01 a = new Interface02Imp_01();
        a.methodAbs(); 

        // if implements class does not have such method, it will look up for method
        a.methodDefault(); 
        System.out.println("==========");

        Interface02Imp_02 b = new Interface02Imp_02();
        b.methodAbs();
        b.methodDefault(); 
    }

    
}
