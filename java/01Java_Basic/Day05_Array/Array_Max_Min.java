public class Array_Max_Min {
    public static void main(String[] args) {
        //Max
        int[] array = { 5, 15, 30, 20, 10000, 30, 35 };

        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The max value is " + max);

        //Min
        int[] arrayB = { 5, 15, 30, 20, 10000, -20, 30, 35 };

        int min = arrayB[0]; 
        for (int i = 1; i < arrayB.length; i++) {
            if (arrayB[i] < min) {
                min = arrayB[i];
            }
        }
        System.out.println("The min value is " + min);


    }
}
