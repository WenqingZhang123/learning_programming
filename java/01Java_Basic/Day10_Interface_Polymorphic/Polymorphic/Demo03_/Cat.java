public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("CAT EAT FISH");
    }

    // Only 'Cat' has
    public void catchMouse() {
        System.out.println("CAT CATCH MOUSE");
    }
}
