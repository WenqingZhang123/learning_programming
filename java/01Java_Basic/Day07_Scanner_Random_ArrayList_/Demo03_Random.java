import java.util.Random;
import java.util.Scanner;
public class Demo03_Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("The random number is : " + num);

        for (int i = 0; i < 100; i++) {
            int num1 = r.nextInt(10); // integer in [0,10) -------0~9
            System.out.println(num1);
        }

        System.out.println("=========================");
        for (int i = 0; i < 100; i++) {
            // [0,8)-------0~7------1~8
            int result = r.nextInt(8) + 1;
            System.out.println(result);
        }


        //Guess random number(game)
        int randomNum = r.nextInt(100) + 1; // [1,100]
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Give the input which you guess:");
            int guessNum = sc.nextInt(); 

            if (guessNum > randomNum) {
                System.out.println("Too big, try agin");
            } else if (guessNum < randomNum) {
                System.out.println("Too small, try again");
            } else {
                System.out.println("Congratulations, well done");
                break; //if it is wrong, try loop again
            }
        }

        System.out.println("Game over");
    
    }
    
}
