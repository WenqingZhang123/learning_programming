public class Method_ {

    public static void main(String[] args) {
        //Main
        System.out.println("Hello, World!111");

        //Method
        printMethod();

        //Method's usage
        // invoke directly
         sum(10, 20);
         System.out.println("===========");
 
         // print invoke
         System.out.println(sum(10, 20)); // 30
         System.out.println("===========");
 
         // assign invoke
         int number = sum(15, 25);
         number += 100;
         System.out.println("The variable is " + number); // 140

    //types
         method1(10, 20);
         System.out.println("==============");
         method2();

         //Practise_1
         int num = getSum(10, 20);
        System.out.println("The result is " + num);
        System.out.println("==============");

        printSum(100, 200);
        System.out.println("==============");

        System.out.println(getSum(2, 3)); 
        getSum(3, 5); 
        System.out.println("==============");

        //practice_2
        System.out.println(isSame(10, 20)); // false
        System.out.println(isSame(20, 20)); // true

        //practise_3
        System.out.println("结果是：" + getSum());

        //practise_4
        printCount(10);



    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sum(int a, int b) {
        System.out.println("Method has been compeleted!");
        int result = a + b;
        return result;
    }

    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("The result is " + result);
    }

    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World! " + i);
        }
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("The result is " + result);
    }

    public static boolean isSame(int a, int b) {
        /*boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }*/

        // boolean same = a == b ? true : false;

        // boolean same = a == b;

        return a == b;
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, World!" + (i + 1));
        }
    }

}