public class Method_OverloadPractise {

    public static void main(String[] args) {
        //Practise_1
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));

        System.out.println(isSame((short) 20, (short) 20));

        System.out.println(isSame(11, 12));

        System.out.println(isSame(10L, 10L));

        //practise_2
        myPrint(100); // int
        myPrint("Hello"); // String
    }
    //Practise_1
    public static boolean isSame(byte a, byte b) {
        System.out.println("The method with two byte param has been done! ");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("The method with two short param has been done! ");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("The method with two int param has been done! ");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("The method with two long param has been done! ！");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //Practise_2
    public static void open(){} // right overload
    public static void open(int a){} // right overload
    //static void open(int a,int b){} // wrong , conflict with no.8
    public static void open(double a,int b){} // right overload
    //public static void open(int a,double b){} //  wrong , conflict with no.6
    //public void open(int i,double d){} //  wrong , conflict with no.5
    public static void OPEN(){} // right without meaning
    //public static void open(int i,int j){} //  wrong , conflict with no.3

    //practise_3
    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }

}
