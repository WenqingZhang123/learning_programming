public class StudentStatic {
    public static void main(String[] args) {
        
        Student.room = "classroom 101";

        Student one = new Student("郭靖", 20);
        System.out.println("The name of one: " + one.getName());
        System.out.println("The age of one: " + one.getAge());
        System.out.println("The classroom of one: " + Student.room);
        

        System.out.println("============");

        Student two = new Student("黄蓉", 18);

        System.out.println("The name of two: " + two.getName());
        System.out.println("The age of two: " + two.getAge());
        System.out.println("The classroom of two: " + Student.room);

        System.out.println("============");

        two.room = "classroom 102";
        System.out.println("Name: " + one.getName()
        + ",age: " + one.getAge() + ",classroom: " + one.room
        + ",studentId: " + one.getId());

        System.out.println("Name: " + two.getName()
                + ",age: " + two.getAge() + ",classroom: " + two.room
                + ",studentId: " + two.getId());

            
    }
}
