package demo01;

public class StudentTest {
    public static void main(String[] args) {
        
        Student stu = new Student();

        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=============");

        
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name); // 赵丽颖
        System.out.println(stu.age); // 18
        System.out.println("=============");

        
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
