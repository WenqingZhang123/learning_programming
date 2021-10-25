

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Manager manager = new Manager("Master", 100);

        Member one = new Member("MemberA", 0);
        Member two = new Member("MemberB", 0);
        Member three = new Member("MemberC", 0);

        manager.show(); // 100
        one.show(); // 0
        two.show(); // 0
        three.show(); // 0
        System.out.println("===============");

        // Master give three red pocket for total 20 
        ArrayList<Integer> redList = manager.send(20, 3);
        // three member receive the red pocket
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show(); // 100-20=80
        // 6、6、8，random assignment
        one.show();
        two.show();
        three.show();
    }

}