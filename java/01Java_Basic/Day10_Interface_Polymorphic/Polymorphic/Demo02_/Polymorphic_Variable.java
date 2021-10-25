public class Polymorphic_Variable {
    public static void main(String[] args) {
        // poly
        Fu obj = new Zi();
        System.out.println(obj.num); // Fu：10
       // System.out.println(obj.age); // error
        System.out.println("=============");

        // no override----Fu：10
        // Override----Zi：20
        obj.showNum();
    }
    
}
