import java.util.Scanner;

public class Demo04_StringPractise {
    public static void main(String[] args) {
        //practise_01----[word1#word2#word3]
        int[] array = {1, 2, 3, 4};

        String result = fromArrayToString(array);
        System.out.println(result);

        //practise_02---big, small, number, others
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a string: ");
        String input = sc.next(); 

        int countUpper = 0; //big case
        int countLower = 0; // small case
        int countNumber = 0; // number
        int countOther = 0; // others

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; 
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("Big case number is: " + countUpper);
        System.out.println("Small case number is: " + countLower);
        System.out.println("Number has : " + countNumber);
        System.out.println("Others number is: " + countOther);
    
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
