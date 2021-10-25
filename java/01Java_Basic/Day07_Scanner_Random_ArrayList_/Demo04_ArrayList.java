import java.util.ArrayList;

public class Demo04_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // add
        boolean success = list.add("Yan Liu");
        System.out.println(list); // [Yan liu]
        System.out.println("Whether the add action is successful ?" + success); // true

        list.add("Yuanyuan Gao");
        list.add("Youting Zhao");
        list.add("Xiaolu Li");
        list.add("Nailiang Jia");
        System.out.println(list); // [Yan liu, Yuanyuan Gao, Youting Zhao, Xiaolu li, Nailiang jia]

        // get
        String name = list.get(2);
        System.out.println("Get index from num 2" + name); // Youting Zhao

        // remove
        String whoRemoved = list.remove(3);
        System.out.println("Remove index from num 3" + whoRemoved); // Xiaolu li
        System.out.println(list); // [Yan Liu, Yuanyuan Gao, Youting Zhao, Nailiang jia]

        // size
        int size = list.size();
        System.out.println("The length of ArrayList is :" + size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Basic type of data
        ArrayList<String> listA = new ArrayList<>();

//        ArrayList<int> listB = new ArrayList<>(); error for int

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC); // [100, 200]

        int num = listC.get(1);
        System.out.println("The no.1 element is : " + num);
    }

    
}
