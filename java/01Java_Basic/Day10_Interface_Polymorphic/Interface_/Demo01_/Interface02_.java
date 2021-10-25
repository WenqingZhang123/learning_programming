public interface Interface02_ {
 // Abstract method
 public abstract void methodAbs();

 // Anoter abstract method
//    public abstract void methodAbs2();

 // default method
 public default void methodDefault() {
     System.out.println("This is the new default method called methodDefault! ");
 }
}
