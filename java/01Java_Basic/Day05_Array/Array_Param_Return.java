public class Array_Param_Return {
    public static void main(String[] args) {
        //Param
        int[] array = { 10, 20, 30, 40, 50 };

        System.out.println(array); 

        printArray(array); 
        System.out.println("==========AAA==========");
        printArray(array);
        System.out.println("==========BBB==========");
        printArray(array);

        //return
        int[] result = calculate(10, 20, 30);

        System.out.println("The main method is received ");
        System.out.println(result); 

        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);
    }

    public static void printArray(int[] array) {
        System.out.println("The method of printArray is received ");
        System.out.println(array); 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; 
        int avg = sum / 3; 
       
        /*
        int[] array = new int[2];
        array[0] = sum; 
        array[1] = avg; 
        */

        int[] array = { sum, avg };
        System.out.println("The inner array in method of calculate is : ");
        System.out.println(array); 
    }

}
