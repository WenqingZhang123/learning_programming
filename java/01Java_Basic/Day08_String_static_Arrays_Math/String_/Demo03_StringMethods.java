public class Demo03_StringMethods {
    public static void main(String[] args) {
        // length
        int length = "asdasfeutrvauevbueyvb".length();
        System.out.println("The length of string is: " + length);

        // concat
        String strA = "Hello";
        String strB = "World";
        String strC = strA.concat(strB);
        System.out.println(strA); // Hello
        System.out.println(strB); // World
        System.out.println(strC); // HelloWorld
        System.out.println("==============");

        // charAt
        char ch = "Hello".charAt(1);
        System.out.println("The char in no.1 index is:" + ch);
        System.out.println("==============");

        //indexOf---whether subString exists and if not, return -1.
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("The first time it appears in " + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1

        //subString
        String strD = "HelloWorld";
        String strE = strD.substring(5);
        System.out.println(strD); // HelloWorld
        System.out.println(strE); // World
        System.out.println("================");

        String strF = strD.substring(4, 7);
        System.out.println(strF); // oWo
        System.out.println("================");

        
        String strG = "Hello";
        System.out.println(strG); // Hello
        strG = "Java";
        System.out.println(strG); // Java

         // toCharArray
         char[] chars = "Hello".toCharArray();
         System.out.println(chars[0]); // H
         System.out.println(chars.length); // 5
         System.out.println("==============");
 
         // getBytes
         byte[] bytes = "abc".getBytes();
         for (int i = 0; i < bytes.length; i++) {
             System.out.println(bytes[i]);
         }
         System.out.println("==============");
 
         // replace
         String strH = "How do you do?";
         String strI = strH.replace("o", "*");
         System.out.println(strH); // How do you do?
         System.out.println(strI); // H*w d* y*u d*?
         System.out.println("==============");
 
         String lang1 = "会不会玩儿呀！你大爷的！你大爷的！你大爷的！！！";
         String lang2 = lang1.replace("你大爷的", "****");
         System.out.println(lang2); // 会不会玩儿呀！****！****！****！！！

         //split
         String strJ = "aaa,bbb,ccc";
         String[] array1 = strJ.split(",");
         for (int i = 0; i < array1.length; i++) {
             System.out.println(array1[i]);
         }
         System.out.println("===============");
 
         String strK = "aaa bbb ccc";
         String[] array2 = strK.split(" ");
         for (int i = 0; i < array2.length; i++) {
             System.out.println(array2[i]);
         }
         System.out.println("===============");
 
         String strL = "XXX.YYY.ZZZ";
         String[] array3 = strL.split("\\.");
         System.out.println(array3.length); // 0
         for (int i = 0; i < array3.length; i++) {
             System.out.println(array3[i]);
         }
    }
    
}
