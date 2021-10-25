import java.util.ArrayList;
import java.util.Random;

public class Practise {
    public static void main(String[] args) {

        //Practise_1-----put random number [1,33] in ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        // Iterate list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Practise_2------put the object of student in ArrayList
        ArrayList<Student> list1 = new ArrayList<>();

        Student one = new Student("洪七公", 20);
        Student two = new Student("欧阳锋", 21);
        Student three = new Student("黄药师", 22);
        Student four = new Student("段智兴", 23);

        list1.add(one);
        list1.add(two);
        list1.add(three);
        list1.add(four);

        // Iterate list1
        for (int i = 0; i < list1.size(); i++) {
            Student stu = list1.get(i);
            System.out.println("Name is : " + stu.getName() + ", age is : " + stu.getAge());
        }

        //Practise3-------System.out.println(list);       [10, 20, 30]---------printArrayList(list);           {10@20@30}
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三丰");
        list2.add("宋远桥");
        list2.add("张无忌");
        list2.add("张翠山");
        System.out.println(list2); // [张三丰, 宋远桥, 张无忌, 张翠山]

        printArrayList(list2);
    
        //Practise4_Put even number in big set  to small set
        ArrayList<Integer> bigList = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1; // 1~100
            bigList.add(num);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);

        System.out.println("Total even num is :" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }
    public static void printArrayList(ArrayList<String> list) {
        // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {

        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }


}
