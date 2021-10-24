package Inner_.Demo01;
public class OuterMain {

    public static void main(String[] args) {
        
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }

}
