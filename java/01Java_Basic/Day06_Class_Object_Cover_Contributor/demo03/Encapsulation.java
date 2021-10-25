public class Encapsulation {
    public static void main(String[] args) {

        //Method is also a kind of encapsulation
        int[] array = {5, 15, 25, 20, 100};

        int max = getMax(array);
        System.out.println("The max value is : " + max);
    }

    // get the max value of array
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
}
