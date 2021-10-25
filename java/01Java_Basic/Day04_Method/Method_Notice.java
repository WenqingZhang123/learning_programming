public class Method_Notice {
    public static int method1() {
        return 10;
    }

    public static void method2() {
//        return 10; //error cause  "void" implies there cannot exist value behind the "return"
        return; // no return number , just means the end of this Method
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
//        return; // the "return" can be omit
    }

    public static int getMax(int a, int b) {
        /*int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;*/

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
}
