/**
 * 
 * @author zhangwenqing
 *
 */
public class DataType {
	public static void main(Srtring[] args) {
		System.out.println(1024); // default int
		System.out.println(3.14);//default double
		
		//convert automaticlly
		long num1 = 100;
		System.out.println(num1); // 100
		
		double num2 = 2.5F;
		System.out.println(num2); // 2.5
		
		float num3 = 30L;
		System.out.println(num3); // 30.0
		
		//convert compulsive
		int num = (int) 100L;
		System.out.println(num);
		
		int num2 = (int) 6000000000L;
		System.out.println(num2); // 1705032704
		
		int num3 = (int) 3.99;
		System.out.println(num3); // 3，ignore the decimal 
		
		//ASCII
		char zifu1 = 'A'; // 
		System.out.println(zifu1 + 1); // 66，('A' equals 65)
		
		char zifu1 = '1';
		System.out.println(zifu1 + 0); // 49,('1' equals 48)
		
		char zifu3 = 'c';
		int num = zifu3;
		System.out.println(num); // 99
		
		char zifu4 = '中'; 
		System.out.println(zifu4 + 0); // 20013
		
		//underground(inner) convert automaticlly
		byte num4 = 40; 
		byte num5 = 50;
			// byte + byte --> int + int --> int
		int result1 = num4 + num5;
		System.out.println(result1); // 90
		
		short num6 = 60;
			// byte + short --> int + int --> int
		short result2 = (short) (num4 + num6);
		System.out.println(result2); // 100
	
	}

}
