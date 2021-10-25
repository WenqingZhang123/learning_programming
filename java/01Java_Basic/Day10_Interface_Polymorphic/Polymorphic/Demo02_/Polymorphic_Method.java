public class Polymorphic_Method {
    public static void main(String[] args) {
        Fu obj = new Zi(); //poly

        obj.method(); // Zi 
        obj.methodFu(); // Look up

        //error, when compile, find there is no methodZi in Fu
//        obj.methodZi(); // error
    }
}
