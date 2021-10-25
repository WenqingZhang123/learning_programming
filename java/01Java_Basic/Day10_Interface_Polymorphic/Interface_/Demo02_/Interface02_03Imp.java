public class Interface02_03Imp implements Interface02_,Interface03_ {

    @Override
    public void methodA() {
        System.out.println("Override the methodA");
    }


    @Override
    public void methodB() {
        System.out.println("Override the methodB");
    }

    @Override
    public void methodAbs() {
        System.out.println("Override the common methodAbs that Interface02 and Interface03 has");
    }

    @Override
    public void methodDefault() {
        System.out.println("Override for multiply default method");
    }
}
