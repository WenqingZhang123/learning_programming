public class Demo01_StringConstructor{

    public static void main(String[] args) {
    //four ways to built String
        //01-constructor without param
        String str1 = new String();
        System.out.println("The first string is: " + str1);

        //02-use char array to build string
        char[] charArray = { 'A', 'B', 'C' };
        String str2 = new String(charArray);
        System.out.println("The second string is: " + str2);

        //03-use byte array to build string
        byte[] byteArray = { 97, 98, 99 };
        String str3 = new String(byteArray);
        System.out.println("The third string is: " + str3);

        //04-use the quotation directly
        String str4 = "Hello";
        System.out.println("The fourth string is: " + str4);
    }

}