import java.util.Scanner;
public class Demo01_Scanner{
    public static void main(String[] args){
        //Scanner
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please, give me a number! ");
        int num1 = scan1.nextInt();
        System.out.println("What you have given is : " + num1);

        System.out.println("Please, give me a word! ");
        String str1 = scan1.next();
        System.out.println("What you have given is : "+str1);
    }
}