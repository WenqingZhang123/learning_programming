package Inner_.Demo01;
public class BodyMain {
    public static void main(String[] args) {
        Body body = new Body(); 

        body.methodBody();
        System.out.println("=====================");

        // following ones is the standard format
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
