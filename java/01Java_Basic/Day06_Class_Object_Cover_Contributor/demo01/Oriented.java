package demo01;
import java.util.Arrays;

public class Oriented {
    public static void main(String[] args) {
        //Process orientied
        int[] array = { 10, 20, 30, 40, 50, 60 };

        // request to print ：[10, 20, 30, 40, 50]
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) { // the last element
                System.out.println(array[i] + "]");
            } else { // if not the last element
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==============");

        //A good method, Arrays from JDK  which could turn array to relevant format of "String"
        System.out.println(Arrays.toString(array));
    }
    
}
