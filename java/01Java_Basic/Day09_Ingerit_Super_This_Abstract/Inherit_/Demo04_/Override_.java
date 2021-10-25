

public class Override_ {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        // the father method is covered by son method
        zi.method();
    }
    
}
