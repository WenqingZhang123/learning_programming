import java.util.Scanner;

public class Demo02_Anonymouse {
    public static void main(String[] args) {
        //formal
        Person one = new Person();
        one.name = "Yuanyuan Gao";
        one.showName(); // My name is : Yuanyuan Gao
        System.out.println("===============");

        // Anonymouse
        new Person().name = "Youting Zhao";
        new Person().showName(); // My name is : null


        //Scanner
//       Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // Anonymouse
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        System.out.println("Please give me a number! ");
        int num = sc.nextInt();
        System.out.println("What has been inputed is :" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("What has been inputed is : " + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

    
}
