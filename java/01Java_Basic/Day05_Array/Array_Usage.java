public class Array_Usage {

    public static void main(String[] args) {
    //usage_1
        int[] arrayA = new int[3];
        System.out.println(arrayA); // 地址值
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("==============");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // 地址值
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20
        System.out.println("==============");

        int[] arrayB = new int[3];
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 0
        System.out.println(arrayB[2]); // 0
        System.out.println("==============");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200

        arrayB = arrayA;
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 10
        System.out.println(arrayB[2]); // 20
        System.out.println("==============");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
        

    //usage_2
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

        //Usage_3
        int[] array = {15, 25, 35};

        System.out.println(array[0]); //15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35

        //error for overflow
        //System.out.println(array[3]);

        //Usage_4
        int[] arrayM = null;
//      arrayM = new int[3];
        arrayM = new int[3];
        System.out.println(arrayM[0]);

        //usage_5
        int[] arrayZ = new int[3];

        int[] arrayY = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayY.length;
        System.out.println("The length of arrayY is " + len);
        System.out.println("=============");

        int[] arrayX = new int[3];
        System.out.println(arrayX.length); // 3
        arrayX = new int[5];
        System.out.println(arrayX.length); // 5

        //Usage_6
        int[] arrayO = { 15, 25, 30, 40, 50, 60, 75 };

        // 首先使用原始方式
        System.out.println(arrayO[0]); // 15
        System.out.println(arrayO[1]); // 25
        System.out.println(arrayO[2]); // 30
        System.out.println(arrayO[3]); // 40
        System.out.println(arrayO[4]); // 50
        System.out.println(arrayO[5]); // 50
        System.out.println("=================");

        // use loop to iterate array
        for (int i = 0; i < 6; i++) {
            System.out.println(arrayO[i]);
        }
        System.out.println("=================");

//        int len = arrayO.length; 
        for (int i = 0; i < arrayO.length; i++) {
            System.out.println(arrayO[i]);
        }
    }
}