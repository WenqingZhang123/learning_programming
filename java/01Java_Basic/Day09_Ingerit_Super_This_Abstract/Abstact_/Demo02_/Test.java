public class Test {
    public static void main(String[] args) {
        //        Animal animal = new Animal(); // error
        
        //        Dog dog = new Dog(); // error
        
                Dog2Ha ha = new Dog2Ha(); // common class
                ha.eat();
                ha.sleep();
                System.out.println("==========");
        
                DogGolden golden = new DogGolden();
                golden.eat();
                golden.sleep();
            }
    
}
