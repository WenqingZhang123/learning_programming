public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); //reuse
        
        System.out.println("Show the name who is calling me! ");
        System.out.println("Show the image who is calling me! ");
    }
}