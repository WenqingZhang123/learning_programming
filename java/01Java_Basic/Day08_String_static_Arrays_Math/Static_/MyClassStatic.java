public class MyClassStatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); 
        
        obj.method();

        obj.methodStatic(); // right, but not recommend
        MyClass.methodStatic(); // right, recommend

        // For those class which has their own static method, it could omit the name of class when call the static method
        myMethod();
        MyClassStatic.myMethod(); // No difference
    }

    public static void myMethod() {
        System.out.println("My own static method! ");
    }
}
