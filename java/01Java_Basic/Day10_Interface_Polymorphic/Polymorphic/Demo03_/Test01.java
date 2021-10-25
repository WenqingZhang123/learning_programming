public class Test01 {
    public static void main(String[] args) {
        
        Animal animal = new Cat(); 
        animal.eat(); // CAT EATS FISH

//        animal.catchMouse(); // error

       
        Cat cat = (Cat) animal;
        cat.catchMouse(); // CAT CATCHES MOUSE

      
        // error, java.lang.ClassCastException，
        //Dog dog = (Dog) animal;
    }
}
