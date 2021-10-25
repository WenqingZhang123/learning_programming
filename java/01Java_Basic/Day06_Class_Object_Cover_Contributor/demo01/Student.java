package demo01;

public class Student {

    String name; 
    int age; 

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Eat something");
    }

    public void sleep() {
        System.out.println("Sleep for moment");
    }

    public void study() {
        System.out.println("Get up to learn !");
    }

}
