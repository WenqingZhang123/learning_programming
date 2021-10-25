public class Zi extends Fu{

    int num = 20;

    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("This belongs to Zi---Zi");
    }

    public void methodZi() {
        System.out.println("Only Zi has this method--Zi");
    }
    
}
