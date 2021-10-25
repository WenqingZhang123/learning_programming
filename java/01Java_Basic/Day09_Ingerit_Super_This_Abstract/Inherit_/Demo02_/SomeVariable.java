

public class SomeVariable {
    public static void main(String[] args) {
        Father fa = new Father(); 
        System.out.println(fa.numFa);
        System.out.println("===========");

        Son son = new Son();

        System.out.println(son.numFa); // 10, which can be found inherited by father
        System.out.println(son.numSon); // 20
        System.out.println("===========");

    
        System.out.println(son.num); // num in son will be used firstly
//        System.out.println(son.abc); // no abc , it will be error 
        System.out.println("===========");

        
        son.methodSon(); // 200
      
        son.methodFa(); // 100
    }
}
