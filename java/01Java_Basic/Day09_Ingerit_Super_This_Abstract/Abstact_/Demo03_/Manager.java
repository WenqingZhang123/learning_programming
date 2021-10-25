import java.util.ArrayList;


public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
    
        ArrayList<Integer> redList = new ArrayList<>();

        // show the money the manager left
        int leftMoney = super.getMoney(); 
        if (totalMoney > leftMoney) {
            System.out.println("insufficient funds");
            return redList; // null
        }

        // deduct the total money that the manager sends
        super.setMoney(leftMoney - totalMoney);

        // the red pocket number that the manager wants to give 
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，也就是甩下的零头

        // left the remainder in last one red pocket
        // put every red pocket in arraylist
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // the last one red pocket
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
