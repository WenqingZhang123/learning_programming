public class Person {
    String name; 

    // The local and global variable is the same, so this is used to express the global/class variable
    public void sayHello(String name) {
        System.out.println(name + " says:  Hello  " + this.name);
        //the address of this class
        System.out.println(this);
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Jianling";
        person.sayHello("Sicong");

        System.out.println(person); // the address of class person
    }
    
}
