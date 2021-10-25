public class MyClass {

    int num; 
    static int numStatic; 

    public void method() {
        System.out.println("This is a member method! ");
        // memeber method can call member variable
        System.out.println(num);
        // memeber method can call static variable
        System.out.println(numStatic);
    }

    // static method
    public static void methodStatic() {
        System.out.println("This is a static method! ");
        // static method can call static variable
        System.out.println(numStatic);
        // static method can not call those that are not static variables, like member variable
//        System.out.println(num); // error 

        // static method can not call key word, this
//        System.out.println(this); // this
    }
}
