public class Student {
    private String name; 
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("Name is: " + stu1.getName() + ", age is " + stu1.getAge());
        System.out.println("=================");

        Student stu2 = new Student("古力娜扎", 21);
        System.out.println("Name is: " + stu2.getName() + ",age is: " + stu2.getAge());
        stu2.setAge(22);
        System.out.println("Name is: " + stu2.getName() + ", age is: " + stu2.getAge());
    }
    
}
