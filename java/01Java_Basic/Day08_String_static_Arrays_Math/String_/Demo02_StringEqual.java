public class Demo02_StringEqual {
    public static void main(String[] args) {
        //==
        String strA = "abc";
        String strB = "abc";

        char[] charArrayC = {'a', 'b', 'c'};
        String strD = new String(charArrayC);

        System.out.println(strA == strB); // true
        System.out.println(strA == strD); // false
        System.out.println(strA== strD); // false

        //method to compare wheher two string have the same content
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false
        System.out.println("=================");

        String str5 = null;
        System.out.println("abc".equals(str5)); // 推荐：false
//        System.out.println(str5.equals("abc")); // NullPointerException
        System.out.println("=================");

        String strX = "Java";
        String strY = "java";
        System.out.println(strX.equals(strY)); // false
        System.out.println(strX.equalsIgnoreCase(strY)); // true

        System.out.println("abc一123".equalsIgnoreCase("abc壹123")); // false
    }

}
