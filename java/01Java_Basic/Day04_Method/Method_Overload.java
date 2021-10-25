public class Method_Overload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10, 20)); // 30
        System.out.println(sumThree(10, 20, 30)); // 60
        System.out.println(sumFour(10, 20, 30, 40)); // 100*/

        System.out.println(sum(10, 20)); // The method of two param
        System.out.println(sum(10, 20, 30)); // The method of three param
        System.out.println(sum(10, 20, 30, 40)); // The method of four param
//        System.out.println(sum(10, 20, 30, 40, 50)); // error for no match

        sum(10, 20);
    }

    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        return (int) (a + b);
    }

    public static int sum(int a, int b) {
        System.out.println("The method with two param has been done");
        return a + b;
    }

    // error for there does not exist relationship between  return type and overload
//    public static double sum(int a, int b) {
//        return a + b + 0.0;
//    }

    // error for there does not exist relationship between  variable name and overload
//    public static int sum(int x, int y) {
//        return x + y;
//    }

    public static int sum(double a, double b) {

        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        System.out.println("The method with three param has been done! ");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("The method with four has been done! ");
        return a + b + c + d;
    }
}
