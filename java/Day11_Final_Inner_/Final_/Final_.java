public class Final_ {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        num1 = 20;
        System.out.println(num1); // 20

       
        final int num2 = 200;
        System.out.println(num2); // 200

//        num2 = 250; // error--It cannot be changed
//        num2 = 200; // error
    
        final int num3;
        num3 = 30;

        Student stu1 = new Student("Liying Zhao");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // Liying Zhao
        stu1 = new Student("Jianhua Huo");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // Jianhua Huo
        System.out.println("===============");

        final Student stu2 = new Student("Yuanyuan Gao");
        
//        stu2 = new Student("Youting Zhao");// error for unchangable address
        System.out.println(stu2.getName()); // Yuanyuan Gao
        stu2.setName("Yuanyuan-----yuan");
        System.out.println(stu2.getName()); //Yuanyuan-----yuan
    }

}
