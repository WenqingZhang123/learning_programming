import java.util.ArrayList;
import java.util.Random;


public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //get a random number of red pocket in arraylist
        int index = new Random().nextInt(list.size());
        //delete the one this member have in arraylist
        int delta = list.remove(index);
        //show the money left of this member's account
        int money = super.getMoney();
        // add to this member's account
        super.setMoney(money + delta);
    }
}

