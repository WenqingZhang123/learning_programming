/**
 * 
 * @author zhangwenqing
 *
 */
public class Operator {
	public static void main(String[] args) {
		//calculate between constants
		System.out.println(20 + 30);
		
		// calculate between variables
		int a = 20;
		int b = 30;
		System.out.println(a - b); // -10
		
			//calculate between constant and variable
		System.out.println(a * 10); // 200
		
		int x = 10;
		int y = 3;
		
		int result1 = x / y;
		System.out.println(result1); // 3
		
		int result2 = x % y;
		System.out.println(result2); // mod is 1
		
		// int + double --> double + double --> double
		double result3 = x + 2.5;
		System.out.println(result3); // 12.5
		
	//usage of +
		String str1 = "Hello";
		System.out.println(str1); // Hello
		
		System.out.println("Hello" + "World"); // HelloWorld
		
		String str2 = "Java";
		// String + int --> String
		System.out.println(str2 + 20); // Java20
		
	//Priority
		// String + int + int
		// String		+ int
		// String
		System.out.println(str2 + 20 + 30); // Java2030
		
		System.out.println(str2 + (20 + 30)); // Java50
		
	//Assignment Operator
		int a = 10;
		// a = a + 5
		// a = 10 + 5;
		// a = 15;
		a += 5; 
		System.out.println(a); // 15
		
		int x = 10;
		// x = x % 3;
		// x = 10 % 3;
		// x = 1;
		x %= 3;
		System.out.println(x); // 1
		
	//Comparation Operator
		System.out.println(10 > 5); // true
		int num1 = 10;
		int num2 = 12;
		System.out.println(num1 < num2); // true
		System.out.println(num2 >= 100); // false
		
		System.out.println(20 != 25); // true
		System.out.println(20 != 20); // false
		
		int x = 2;
		// System.out.println(1 < x < 3); // error, can not be written needing the logic operators
		
	//logic operation
		System.out.println(true && false); // false
		// true && true --> true
		System.out.println(3 < 4 && 10 > 5); // true
		
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		
		System.out.println(true); // true
		System.out.println(!true); // false	
		
		int a = 10;
		// false && ...
		System.out.println(3 > 4 && ++a < 100); // false
		System.out.println(a); // 10
		System.out.println("============");
		
		int b = 20;
		// true || ...
		System.out.println(3 < 4 || ++b < 100); // true
		System.out.println(b); // 20
		
	//Ternary operators
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println("最大值：" + max); // 20
	}
}
