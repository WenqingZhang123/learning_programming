public class Student {
    private String name; 
    private int age; 
    private boolean male; 

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("Han Lu");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("Name is: " + stu.getName());
        System.out.println("Age is: " + stu.getAge());
        System.out.println("Is man? " + stu.isMale());
    }
    
}
