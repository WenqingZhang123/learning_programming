public class Person {
    String name; 
    private int age; 

    public void show() {
        System.out.println("My name is :" + name + ", my age is :" + age);
    }

    // member method to advoid unreasonable value
    public void setAge(int num) {
        if (num < 100 && num >= 9) { // reasonable situation
            age = num;
        } else {
            System.out.println("Unreasonable data");
        }
    }

    // member method return the variable of age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        //name is not influenced by private
        person.name = "Super star: Tony Stake";
//        person.age = -20; // error for the reason of private
        person.setAge(20);
        person.show();
    }
}
