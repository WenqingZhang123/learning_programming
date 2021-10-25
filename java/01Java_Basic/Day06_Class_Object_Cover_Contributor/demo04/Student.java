public class Student {

    private String name;
    private int age;

    // the construction method without param
    public Student() {
        System.out.println("The cons without param has been executed! ");
    }

    // the construction method with param
    public Student(String name, int age) {
        System.out.println("The cons param with param has been executed! ");
        this.name = name;
        this.age = age;
    }

    // Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(); //cons without param
        System.out.println("============");

        Student stu2 = new Student("赵丽颖", 20); //cons with param
        System.out.println("Name is: " + stu2.getName() + ", age is : " + stu2.getAge());
        
        stu2.setAge(21); 
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }

}
