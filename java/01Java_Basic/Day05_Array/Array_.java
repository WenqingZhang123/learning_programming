public class Array_ {

    public static void main(String[] args) {
        //Create array
        int[] arrayA = new int[300];
       
        double[] arrayB = new double[10];

        String[] arrayC = new String[5];

        int[] arrayD = new int[] { 5, 15, 25, 40 };

        String[] arrayE = new String[] { "Hello", "World", "Java" };

        //two ways to create array
        int[] arrayF = { 10, 20, 30 };

        int[] arrayG;
        arrayG = new int[] { 11, 21, 31 };

        int[] arrayH;
        arrayH= new int[5];

        // error, static initialization could not to be devided into two parts
//        int[] arrayI;
//        arrayI = { 10, 20, 30 };

    //usage
        int[] arrayJ = { 10, 20, 30 };

        System.out.println(arrayJ); // [I@75412c2f

        // print elements
        System.out.println(arrayJ[0]); // 10
        System.out.println(arrayJ[1]); // 20
        System.out.println(arrayJ[2]); // 30
        System.out.println("=============");

        // assign value to variable 
        int num = arrayJ[1];
        System.out.println(num); // 20

        //address
        int[] arrayK = new int[3];

        System.out.println(arrayK); // memory of address
        System.out.println(arrayK[0]); // 0
        System.out.println(arrayK[1]); // 0
        System.out.println(arrayK[2]); // 0
        System.out.println("=================");

        arrayK[1] = 123;
        System.out.println(arrayK[0]); // 0
        System.out.println(arrayK[1]); // 123
        System.out.println(arrayK[2]); // 0
    }
}